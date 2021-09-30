package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);


        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas where nome like ?";

        System.out.println("Informe a sua pesquisa? ");
        String pesquisa = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+pesquisa.trim()+ "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas){
            System.out.println(p.getCodigo() + " -> "+ p.getNome());
        }

        entrada.close();
        stmt.close();
        conexao.close();
    }

}
