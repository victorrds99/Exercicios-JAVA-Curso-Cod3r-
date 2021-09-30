package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestarConexao {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306";
		String usuario = "root";
		String senha = "@12345";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		
		System.out.println("Conexao feita com sucessogg!!!");
		
	
		
		conexao.close();
		
	}

}
