package jdbc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.factory.ConnectionFactory;

public class Usuarios {
	private String nickname;
	
	private String password;
	public Usuarios(String nickname, String password) {
		this.nickname = nickname;
		this.password = password;
		
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public static boolean validacionUsuarios(String nickname, String password) {
		ConnectionFactory con = new ConnectionFactory();
		Connection cone = null;
		PreparedStatement state = null;
		ResultSet result = null;
		
		try {
			cone = con.Connection();
			state = cone.prepareStatement("SELECT * FROM usuarios WHERE nickname=? AND password=?");
			state.setString(1, nickname);
			state.setString(2, password);
			result = state.executeQuery();
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if(result !=null)
					result.close();
				if(state !=null)
					state.close();
				if(cone != null)
					cone.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
}
