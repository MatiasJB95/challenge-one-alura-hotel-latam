package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.mysql.cj.xdevapi.Statement;

import jdbc.modelo.Reservas;

public class ReservaDao {
	private Connection con;
	
public ReservaDao(Connection con) {
	super();
	this.con = con;
}
public void guardar(Reservas reservas) {
	try {
		String sql= "INSERT INTO reservas(fecha_entrada, fecha_salida, valor, forma_pago)"+"VALUE( ?, ?, ?,? )";
		try(PreparedStatement pstm =con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setObject(1, reservas.getData_E());
			pstm.setObject(2, reservas.getData_S());
			pstm.setString(3, reservas.getValor());
			pstm.setString(4, reservas.getFormasPago());
			pstm.executeUpdate();
			
			try(ResultSet rst = pstm.getGeneratedKeys() ) {
				while(rst.next()) {
					reservas.setId(rst.getInt(1));
				}
				
			}


		
		}
	} catch (SQLException e) {
		throw new RuntimeException("" +e.getMessage(),e);
	}
}
public List<Reservas> ListaReservas() {
	List<Reservas> reservas = new ArrayList<Reservas>();
	try {
		String sql = "SELECT id, fecha_entrada, fecha_salida, valor, forma_pago FROM reservas";
		try(PreparedStatement pstm= con.prepareStatement(sql)){
			pstm.execute();
			VistaFinal(reservas, pstm);
		}
		return reservas;
		
	} catch (SQLException e) {
		throw new RuntimeException();
	}
}

public List<Reservas> busquedaPorId(String id) {
	List<Reservas> reservas = new ArrayList<Reservas>();
	try {
		String sql = "SELECT id, fecha_entrada, fecha_salida, valor, forma_pago FROM reservas WHERE id=?";
		try(PreparedStatement pstm= con.prepareStatement(sql)){
			pstm.setString(1, id);
			pstm.execute();
			VistaFinal(reservas, pstm);
		}
		return reservas;
		
	} catch (SQLException e) {
		throw new RuntimeException();
	}
} 

public void editar(LocalDate data_E, LocalDate data_S, String valor, String formasPago, Integer id) {
	try(PreparedStatement stm = con.prepareStatement("UPDATE reservas SET "
			+ "fecha_entrada=?, fecha_salida=?, valor=?, forma_pago=? WHERE id =?")){
		stm.setObject(1, java.sql.Date.valueOf(data_E));
		stm.setObject(2, java.sql.Date.valueOf(data_S));
		stm.setString(3, valor);
		stm.setString(4, formasPago);
		stm.setInt(5, id); 
		stm.execute();
	}catch(SQLException e) {
		throw new RuntimeException();
	}
}
public void Eliminar(Integer id) {
	try(PreparedStatement stm = con.prepareStatement("DELETE FROM reservas WHERE id = ?")){
		stm.setInt(1, id);
		stm.execute();
	}catch(SQLException e) {
		throw new RuntimeException();
		
	}
}







	private void VistaFinal(List<Reservas> ListaReservas, PreparedStatement pstm) throws SQLException {
		try(ResultSet rst = pstm.getResultSet()) {
			while(rst.next()) {
				int id = rst.getInt("id");
				LocalDate fechaEntrada = rst.getDate("fecha_entrada").toLocalDate().plusDays(1);
				LocalDate fechaSalida = rst.getDate("fecha_salida").toLocalDate().plusDays(1);
				String valor = rst.getString("valor");
				String forma_pago =rst.getString("forma_pago");
				
				Reservas vista = new Reservas(id, fechaEntrada, fechaSalida, valor, forma_pago);
				ListaReservas.add(vista);
			}
		}
		
}


}
