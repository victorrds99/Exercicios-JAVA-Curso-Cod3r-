package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException{

		Connection conexao = FabricaConexao.getConexao();

		Statement stmt = conexao.createStatement();
		
		stmt.execute("drop database cursojava3");

		System.out.println("Criando Banco...");

		System.out.println("Banco Criado Com Sucesso!!");
		
		conexao.close();
	}

}
