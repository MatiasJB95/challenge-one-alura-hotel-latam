package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();
		Connection cone = con.Connection();
		
		
		System.out.println("Conexion establecida");
		cone.close();
		System.out.println("cerrado");
	}
	
	
}
