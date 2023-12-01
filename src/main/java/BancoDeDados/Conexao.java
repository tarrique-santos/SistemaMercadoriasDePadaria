package BancoDeDados;

import com.example.Home.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/CadastroItensDePadaria";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Produto> obterProdutosDoBanco() {
        List<Produto> produtos = new ArrayList<>();
        Connection conexao = obterConexao();
        if (conexao != null) {
            try {
                String sql = "SELECT * FROM sua_tabela";
                PreparedStatement preparedStatement = conexao.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    double valor = resultSet.getDouble("valor");

                    Produto produto = new Produto(id, nome, valor);
                    produtos.add(produto);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                fecharConexao(conexao);
            }
        }
        return produtos;
    }
}