package com.springapp.dao;

import org.springframework.stereotype.Service;

import com.springapp.dto.HelloDto;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: nwong
 * Date: 8/30/13
 * Time: 11:28 AM
 */
@Service
public class HelloDao {

	@Resource
	private DataSource dataSource;

	/**
	 * Checkstyle requires I do this.
	 * 
	 * @param helloId
	 *            DB ID of the Hello Row
	 * @return retrieved HelloDto
	 */
	public final HelloDto getHello(final int helloId) {

		final String sql = "SELECT * FROM HELLO.HELLO WHERE ID = ?";

		try {
			Connection c = dataSource.getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, helloId);
			ResultSet rs = ps.executeQuery();
			rs.next();
			final String name = rs.getString(2);
			ps.close();

			return new HelloDto(helloId, name);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
