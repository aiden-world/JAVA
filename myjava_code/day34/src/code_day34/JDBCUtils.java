package code_day34;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
	private JDBCUtils() {}
	private static String driverClassName;
	private static String url;
	private static String user;
	private static String password;
	//加载配置文件参数到内存中
		static {
			//可以通过当前类的类加载器从src下加载配置文件到内存中
			InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

			System.out.println((is==null?true:false));
			
			//创建property对象
			Properties info =new Properties();
			//使用info加载properties文件的io流,转为键值对形式
			
				try {
					info.load(is);
					driverClassName = info.getProperty("mysql.driverClassName");
					url = info.getProperty("mysql.url");
					user = info.getProperty("mysql.user");
					password = info.getProperty("mysql.password");
					Class.forName(driverClassName);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
				System.out.println(url+user+password);
			
		}
		
		public static Connection getConn() {
			Connection conn = null;
			try {
				//2、获取连接
				//System.out.println(url);
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		
		
		
		
}
