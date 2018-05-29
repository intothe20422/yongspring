package org.study.spring;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class MysqlConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://192.168.0.221:3306/book_ex?useSSL=no&characterEncoding=utf-8";
	private static final String USER = "yong";
	private static final String PW = "yong3482";
	@Test
	public void testConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
