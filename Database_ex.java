import java.sql.*;
class Database_ex
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost","root","root");
		Statement stmt = conn.createStatement();
		String sql ="CREATE DATABASE yedpat";
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	}
}