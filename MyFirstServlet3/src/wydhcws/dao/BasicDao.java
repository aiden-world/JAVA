package wydhcws.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import wydhcws.utils.JDBCUtils;

public class BasicDao {
	private QueryRunner queryRunner = new QueryRunner();

	public int update(String sql, Object... params) {
		Connection connection = JDBCUtils.getConnection();
		int count = 0;

		try {
			count = this.queryRunner.update(connection, sql, params);
		} catch (SQLException var9) {
			var9.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}

		return count;
	}

	@SuppressWarnings("unchecked")
	public <T> T getBean(Class<T> type, String sql, Object... params) {
		Connection connection = JDBCUtils.getConnection();
		T t = null;

		try {
			t = this.queryRunner.query(connection, sql, new BeanHandler<T>(type), params);
		} catch (SQLException var10) {
			var10.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}

		return t;
	}

	public <T> List<T> getBeanList(Class<T> type, String sql, Object... params) {
		Connection connection = JDBCUtils.getConnection();
		List list = null;

		try {
			list = (List) this.queryRunner.query(connection, sql, new BeanListHandler(type), params);
		} catch (SQLException var10) {
			var10.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}

		return list;
	}
}