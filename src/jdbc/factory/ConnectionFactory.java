package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
public DataSource dataS;

public ConnectionFactory() {
	ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
	comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
	comboPooledDataSource.setUser("root");
	comboPooledDataSource.setPassword("12345");
	
	this.dataS = comboPooledDataSource;
} 

	public Connection Connection() {
try {
	return this.dataS.getConnection();
} catch (SQLException e) {
	System.out.println("Error al conectar con la base de datos");
	throw new RuntimeException(e);
}	
	
}


}
