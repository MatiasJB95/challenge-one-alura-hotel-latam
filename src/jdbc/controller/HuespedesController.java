package jdbc.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import jdbc.dao.HuespedesDao;
import jdbc.factory.ConnectionFactory;
import jdbc.modelo.Huespedes;

public class HuespedesController {
	private HuespedesDao huespedesDao;
	
	public HuespedesController() {
		Connection con = new ConnectionFactory().Connection();
		this.huespedesDao = new HuespedesDao(con);
		
	}
	public void guardar(Huespedes huespedes) {
		this.huespedesDao.guardar(huespedes);
	}

	public List<Huespedes> viewHuespedes(){
		return this.huespedesDao.ListaHuespedes();
	}
	
	public List<Huespedes> busquedaPorApellido(String apellido){
		return this.huespedesDao.buscarPorApellido(apellido);
	}
	public void EditarHuesped(String nombre, String apellido, LocalDate fecha_nacimiento, String nacionalidad, String telefono,
			Integer idReserva, Integer id) {
		this.huespedesDao.EditarHuesped(nombre, apellido, fecha_nacimiento, nacionalidad, telefono, idReserva, id);
	}
	public void Eliminar(Integer idreserva) {
		this.huespedesDao.Eliminar(idreserva);
	}
}
