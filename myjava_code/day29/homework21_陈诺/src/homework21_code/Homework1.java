package homework21_code;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework1 {
	static long length = 0;
	public static void main(String[] args) throws IOException {
		File dir1 = new File("演示文件夹1");
		File dir2 = new File("演示文件夹2");
		File dir3 = new File("演示文件夹3");
		
		
		File dir11 = new File("演示文件夹1/测试文件夹1");
		System.out.println(dir11.mkdirs());
		System.out.println(dir11.exists());
		
		File dir12 = new File("演示文件夹1/测试文件夹2");
		System.out.println(dir12.mkdir());
		System.out.println(dir12.exists());
		

		File dir111 = new File("演示文件夹1/测试文件夹1/Hello.java");
		System.out.println(dir111.createNewFile());
		System.out.println(dir111.exists());
		
		
		File dir121 = new File("演示文件夹1/测试文件夹2/World.java");

		System.out.println(dir121.createNewFile());
		System.out.println(dir121.exists());
		//System.out.println(getFileCount(dir121));
		FileWriter fw = new FileWriter("演示文件夹1/测试文件夹1/Hello.java",true);
		fw.write("public class Hello{}");
		fw.close();
		FileWriter fw1 = new FileWriter("演示文件夹1/测试文件夹2/World.java",true);
		fw1.write("public class World{}");
		fw1.close();
		System.out.println("---------写入文字后-----------");

		System.out.println(dir1.getAbsolutePath()+",该文件/文件夹  的大小为"+
		getFileDirLength(dir1));
		
		
		System.out.println("文件夹存在? "+dir1.exists());
		//System.out.println(getFileCount(dir111));
		//System.out.println(getFileCount(dir11));
		deleteDir(dir1);
		System.out.println("---------将演示文件夹1删除----------");
		System.out.println("文件夹存在? "+dir1.exists());		
		
		//System.out.println(getFileCount(dir1));
		//System.out.println(dir111.exists());
		//System.out.println(dir11.exists());
		//System.out.println(getFileCount(dir11));
		//dir1.delete()
		
	}
	
	public static void FileDirLength(File dir){
		if(dir.isFile()) {
			 length+= dir.length();
		}else if(dir.isDirectory()) {
			File[] subDir = dir.listFiles();
			for (File file : subDir) {
				FileDirLength(file);
			}
 		}
	}
	
	public static long getFileDirLength(File dir) {
		 length = 0;
		 FileDirLength(dir);
		return length;
	}
	
	
	public static void deleteDir(File dir) {
		
		while(getFileCount(dir)>0) {
			File[] subDir = dir.listFiles();
				for (File file : subDir) {
					deleteDir(file);
				}
			}
		dir.delete();
		
		
		//错误实现,递归到底删除.java后回返上一层后不会再次进行删除判定
//		if(getFileCount(dir)==0){
//			dir.delete();
//		}else {
//			File[] subDir = dir.listFiles();
//			for (File file : subDir) {
//				deleteDir(file);
//			}
//		}
		
}
	
	public static int getFileCount(File dir) {
		File[] subDir = dir.listFiles();
		if(subDir!=null)
			return subDir.length;
		else return 0;
	}
}
	
	

