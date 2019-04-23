package code_day34;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

public class JDBCPackage {
	public static <T>T getBean(Class<T> type,String sql,Object ...params) throws Exception, SQLException{
		Connection conn  = JDBCUtils.getConn();
		T bean = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSetMetaData rmd= null;
		
		try {
			ps = conn.prepareStatement(sql);
			if(params!=null&&params.length>0) {
				for(int i=0;i<params.length;i++) {
					ps.setObject(i+1, params[i]);
				}	
				
				
			}
		
		
		rs = ps.executeQuery();
		rmd = ps.getMetaData();
		int columnCount = rmd.getColumnCount();
		if(rs.next()) {
			bean = type.newInstance();
			for (int i = 0; i <columnCount; i++) {
				Object value = rs.getObject(i+1);
				
				String columnLabel = rmd.getColumnLabel(i+1);//获取列的别名,java和mysql命名有些区别
				
				Field field = type.getDeclaredField(columnLabel);
				
				field.setAccessible(true);
				
				field.set(bean, value);
				
			}
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			TestJDBC.CloseConnection(conn, ps, rs);
		}
		
		return bean;
	}
	
	@Test
	public void testQueryOne() throws SQLException, Exception {
		String sql = "SELECT  eid  , ename , tel ,gender ,commission_pct commissionPct, birthday ,salary FROM t_employee where eid=?";
		Employee employee = getBean(Employee.class,sql,3);
		System.out.println(employee);
	}


}
