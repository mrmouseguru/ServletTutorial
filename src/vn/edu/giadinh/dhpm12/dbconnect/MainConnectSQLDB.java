package vn.edu.giadinh.dhpm12.dbconnect;

import java.sql.SQLException;

public class MainConnectSQLDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String str;
		str = SQLServerConnUtils_SQL_DBBC.getSQLServerConnection().toString();
		
		System.out.println(str);

	}

}
