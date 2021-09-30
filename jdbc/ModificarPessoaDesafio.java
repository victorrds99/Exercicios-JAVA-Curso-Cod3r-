package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPessoaDesafio {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);


        Connection conexao = FabricaConexao.getConexao();
        String sql = "update pessoas set nome = ? where codigo = ?";

        System.out.println("Informe o codigo para mudança? ");
        int pesquisaCodigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o novo nome ?");
        String pesquisaNome = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(2, pesquisaCodigo);
        stmt.setString(1, pesquisaNome);

        stmt.executeUpdate();




        entrada.close();
        stmt.close();
        conexao.close();

        System.out.println("Feito!!!");
    }

}
