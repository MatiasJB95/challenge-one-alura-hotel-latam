package jdbc.modelo;

import java.time.LocalDate;

public class Reservas {
	private Integer id;
	private LocalDate data_E;
	private LocalDate data_S;
	private String valor;
	private String formasPago;
	

public Reservas(LocalDate data_E, LocalDate data_S, String valor, String formasPago) {
	super();
	this.data_E = data_E;
	this.data_S = data_S;
	this.valor = valor;
	this.formasPago = formasPago;
}




public Reservas(Integer id, LocalDate data_E, LocalDate data_S, String valor, String formasPago) {
	super();
	this.id = id;
	this.data_E = data_E;
	this.data_S = data_S;
	this.valor = valor;
	this.formasPago = formasPago;
}




public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public LocalDate getData_E() {
	return data_E;
}


public void setData_E(LocalDate data_E) {
	this.data_E = data_E;
}


public LocalDate getData_S() {
	return data_S;
}


public void setData_S(LocalDate data_S) {
	this.data_S = data_S;
}


public String getValor() {
	return valor;
}


public void setValor(String valor) {
	this.valor = valor;
}


public String getFormasPago() {
	return formasPago;
}


public void setFormasPago(String formasPago) {
	this.formasPago = formasPago;
}

}
