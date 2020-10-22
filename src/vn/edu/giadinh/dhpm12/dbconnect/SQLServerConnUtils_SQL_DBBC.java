package vn.edu.giadinh.dhpm12.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_SQL_DBBC {
	
	 public static Connection getSQLServerConnection()
	         throws SQLException, ClassNotFoundException {
	     String hostName = "localhost";
	     String sqlInstanceName = "SQLEXPRESS";
	     String database = "ServletTutorial";
	     String userName = "sa";
	     String password = "123";
	 
	     return getSQLServerConnection(hostName, sqlInstanceName,
	             database, userName, password);
	 }
	
	// Trường hợp sử dụng SQLServer.
	 // Và thư viện SQLJDBC.
	 public static Connection getSQLServerConnection(String hostName,
	         String sqlInstanceName, String database, String userName,
	         String password) throws ClassNotFoundException, SQLException {
	     // Khai báo class Driver cho DB SQLServer
	     // Việc này cần thiết với Java 5
	     // Java6 tự động tìm kiếm Driver thích hợp.
	     // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 
	     // Cấu trúc URL Connection dành cho SQLServer
	     // Ví dụ:
	     // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
	     String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
	             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }

}
