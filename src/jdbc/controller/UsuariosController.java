package jdbc.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jdbc.modelo.Usuarios;
import views.Login;
import views.MenuUsuario;

public class UsuariosController implements ActionListener {
private Login view;

public UsuariosController(Login view) {
	this.view = view;
}
@Override
public void actionPerformed(ActionEvent e) {
	String nickname = view.getNickname();
	String password = view.getPassword();
	if(Usuarios.validacionUsuarios(nickname, password)) {
		MenuUsuario menu = new MenuUsuario();
		menu.setVisible(true);
		view.dispose();
		
	}else {
		JOptionPane.showMessageDialog(view, "Nombre de usuario o contraseña incorrecta");
	}
}
}
