package wydhcws.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;

public class JDBCUtils {
	private static DataSource dataSource;

	static {
		try {
			Properties pro = new Properties();
			pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			dataSource = DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception var1) {
			var1.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection connection = null;

		try {
			connection = dataSource.getConnection();
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

		return connection;
	}

	public static void releaseConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException var2) {
				var2.printStackTrace();
			}
		}

	}
}