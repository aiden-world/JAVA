package code_day32.chat;

	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.net.Socket;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Set;


	public class ClientHandlerThread extends Thread{
		public static Set<ObjectOutputStream> online = Collections.synchronizedSet(new HashSet<ObjectOutputStream>());

		private Socket socket;
		private String username;
		private ObjectInputStream ois;
		private ObjectOutputStream oos;
		
		public ClientHandlerThread(Socket socket) {
			super();
			this.socket = socket;
		}
		
		public void run(){
			Message message = null;
			try{
				ois = new (socket.getInputStream());
				oos = new ObjectOutputStream(socket.getOutputStream());
				
				//接收数据
				wObjectInputStreamhile (true) {
					message = (Message) ois.readObject();
					
					if(message.getCode() == Code.LOGIN){
						//如果是登录，则验证用户名密码
						username = message.getUsername();
						String password = message.getContent();
						if(UserManager.login(username, password)){
							message.setCode(Code.SUCCESS);
							oos.writeObject(message);
							
							//并将该用户添加到在线人员名单中
							online.add(oos);
							
							message.setCode(Code.CHAT);
							message.setContent("上线了");
							//通知其他人，xx上线了
							sendToOther(message);
						}else{
							message.setCode(Code.FAIL);
							oos.writeObject(message);
						}
					}else if(message.getCode() == Code.CHAT){
						//如果是聊天信息，把消息转发给其他在线客户端
						sendToOther(message);
					}else if(message.getCode() == Code.LOGOUT){
						//通知其他人，xx下线了
						message.setContent("下线了");
						sendToOther(message);
						break;
					}
				}
			}catch(Exception  e){
				//通知其他人，xx掉线了
				if(message!=null && username!=null){
					message.setCode(Code.LOGOUT);
					message.setContent("掉线了");
					sendToOther(message);
				}
			}finally{
				//从在线人员中移除并断开当前客户端
				try {
					online.remove(oos);
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private void sendToOther(Message message) {
			ArrayList<ObjectOutputStream> offline = new ArrayList<ObjectOutputStream>();
			for (ObjectOutputStream on : online) {
				if(!on.equals(oos)){
					try {
						on.writeObject(message);
					} catch (IOException e) {
						offline.add(on);
					}
				}
			}
			
			for (ObjectOutputStream off : offline) {
				online.remove(off);
			}
		}
	}

