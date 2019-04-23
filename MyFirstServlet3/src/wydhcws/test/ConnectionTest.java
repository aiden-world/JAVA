package wydhcws.test;

import java.sql.Connection;
import org.junit.jupiter.api.Test;
import wydhcws.utils.JDBCUtils;

class ConnectionTest {
	@Test
	void testConnection() {
		Connection connection = JDBCUtils.getConnection();
		System.out.println(connection);
	}
}