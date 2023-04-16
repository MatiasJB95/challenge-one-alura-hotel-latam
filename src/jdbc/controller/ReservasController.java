package jdbc.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import jdbc.dao.ReservaDao;
import jdbc.factory.ConnectionFactory;
import jdbc.modelo.Reservas;

public class ReservasController {
	private ReservaDao reservasDao;
	

public ReservasController() {
Connection con = new ConnectionFactory().Connection();
this.reservasDao = new ReservaDao(con);
}
	
public void guardar(Reservas reservas) {
	this.reservasDao.guardar(reservas);
}

public List<Reservas> view(){
	return this.reservasDao.ListaReservas();
}
public List<Reservas> busquedaPorId(String id){
	return this.reservasDao.busquedaPorId(id);
}
public void editarReservas(LocalDate data_E, LocalDate data_S, String valor, String formasPago, Integer id) {
	this.reservasDao.editar(data_E, data_S, valor, formasPago, id); 
}
public void Eliminar(Integer id) {
	this.reservasDao.Eliminar(id);
}

}
