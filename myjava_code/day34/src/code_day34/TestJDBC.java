package code_day34;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import org.junit.jupiter.api.Test;



public class TestJDBC {
	public static Connection Connect() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		return conn;
	}
	
	public static void CloseConnection(Connection conn,Statement sm,ResultSet rs) 
			throws ClassNotFoundException, SQLException{
		if(rs!=null) rs.close();
		if(sm!=null) sm.close();
		if(conn!=null) {
			conn.close();
		}
	}
	
	@Test
	void test7() throws Exception {
		Connection conn = JDBCUtils.getConn();
	}
	
	
	//一个数据库对应一个项目的数据
	//一张表对应java一个类
    //表的一行对应类的一个熟悉
    //表的一行数据对应类的一个对象
	@Test
	void testQueryAll() throws Exception {
		Connection conn = JDBCUtils.getConn();
		String sql = "SELECT * FROM t_employee WHERE eid>?";
		PreparedStatement ps = null;
		
		ps = conn.prepareStatement(sql);
		
		ps.setObject(1, 10);
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Employee> list = new ArrayList<>();
		
		while(rs.next()) {
			//每一行对应Employee的一个对象
			Integer eid = rs.getInt("eid");
			String ename = rs.getString(2);
			String tel = rs.getString(3);
			String gender = rs.getString(4);
			Double commissionPct = rs.getDouble(5);
			Double salary = rs.getDouble(6);
			Date date = rs.getDate(7);
			
			Employee emp = new Employee(eid,ename,tel,gender,commissionPct,salary,date);
		  list.add(emp);
		  
		}
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	

	@Test
	void test6() throws Exception {
		Connection conn = JDBCUtils.getConn();
		
		String sql = "SELECT * FROM t_employee ";
		Statement cs = conn.createStatement();
		ResultSet es = cs.executeQuery(sql);
		while(es.next()) {
			ResultSetMetaData metaData = es.getMetaData();
			int columnCount = metaData.getColumnCount();
			for(int i = 1;i<=columnCount;i++)
				System.out.print(es.getObject(i));	
			
			System.out.println();
		}
		//以后会将查询到的数据封装为对象或对象的集合,交给方法调用者使用集合
		
		CloseConnection(conn, cs, es);
	}
	
	
	@Test
	void test5() throws Exception {
		//获取连接
		Connection conn = Connect();
		//创建sql命令发送对象
		String sql = "	SELECT * FROM t_employee WHERE eid = ? AND ename = ?";  
		//ps需要提高带占位符的sql语句,进行预编译(防止用户传参有特殊符号,提高相同结构语句执行的效率)
		PreparedStatement ps = conn.prepareStatement(sql);
		//给占位符填充参数
		ps.setInt(1, 25); //占位符从1开始
		ps.setObject(2, "姚笛");
		// 执行sql
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rs.getObject(i));
			}
			System.out.println();
			
		}
		
		CloseConnection(conn, ps, rs);
	}
	
	@Test
	void test4() throws Exception {
		Connection conn = Connect();
		Statement sm = null;
		PreparedStatement ps = null;
		
		ps = conn.prepareStatement("update t_department set description ='开火车的22'"
				+ " where  did  = 1");		
		int i = ps.executeUpdate();
		System.out.println(i>0?"更新成功":"更新失败");
		
	}
	
	/**
	 * statement在使用时，由于是字符串拼接，用户可以通过提交的字符串参数改变sql语句的本意，查询意外的结果，造成sql注入问题
	 * 开发中要慎用statement
	 */
	@Test
	void test3() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入员工id");
		String line = scanner.nextLine();
		
		Connection conn = Connect();
		
		Statement sm  =conn.createStatement();
		
		String sql = "SELECT eid , ename , tel , gender , birthday FROM t_employee WHERE eid = "+ line;
		System.out.println(sql);
		ResultSet rs = sm.executeQuery(sql);
		ResultSetMetaData metaData = rs.getMetaData(); 
		int columnCount = metaData.getColumnCount();
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rs.getObject(i));
			}
			System.out.println();
			
		}
		
		CloseConnection(conn, sm, rs);
		
	}
	
	
	
	@Test
	void test2() throws Exception {
		Connection conn= Connect();
		Statement sm  = conn.createStatement();		
		ResultSet rs = sm.executeQuery("SELECT * FROM t_employee");
		//rs除了包含查询的所有行,还包含查询到表的元数据(列数,列名等)
		ResultSetMetaData metaData = rs.getMetaData(); 
		int columnCount = metaData.getColumnCount();
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rs.getObject(i));
			}
			System.out.println();
			
		}
		
		CloseConnection(conn, sm, rs);
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	void test1() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement sm = conn.createStatement();
	
		//sm.executeUpdate(sql)  
		//sm.executeQuery(sql)
		
		String sql = "SELECT eid,ename,tel,gender,birthday FROM t_employee ";
		ResultSet rs = sm.executeQuery(sql);
		//结果集查询到记录后,默认会将结果集的游标放到第一行,如果下一行有数据返回true
		//解析结果集
		while(rs.next()) {
			//光标移动到第一行,且有记录
			//列索引从1开始计算
			int  eid =rs.getInt(1);
			//rs.getXXX()根据传入的列索引或者列名,获取指定列的数据
			String ename =  rs.getString("ename");
			Object tel = rs.getObject(3);
			String gender = rs.getString(4);
			Date birthday = rs.getDate("birthday");
			System.out.println(eid +" "+ename+" "+tel+" "+gender+" "+birthday);
		}
		//关闭资源
		rs.close();
		sm.close();
		conn.close();
		
		
	}

	@Test
	void test() throws Exception {
		//1导入mysql取得jar包
		//2 对jar包右键add build path
		//3 使用jar
			//3.1加载jar中的驱动类
		Class.forName("com.mysql.jdbc.Driver"); 
		//让mysql.Driver的静态代码块执行,将Driver对象注册给Driver
		//通过DriverManager中的注册的驱动对象获取数据库连接
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		//conn.close();
		
		
		
		
		
	}

}
