package com.example.Home;

import BancoDeDados.Conexao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class HelloController {
    @FXML
    private Button AdicionarMercadoria;

    @FXML
    private TableView<Produto> tabelaProdutos;

    @FXML
    private TableColumn<Produto, Integer> columnID;

    @FXML
    private TableColumn<Produto, String> columnProduto;

    @FXML
    private TableColumn<Produto, Double> columnValor;

    @FXML
    private void AdicionarMercadoria(ActionEvent event) {
        // ... (código para inserir dados)

        // Após inserir, atualize a TableView
        atualizarTabela();
    }

    @FXML
    private void ApagarMercadoria(MouseEvent event) {
        // Lógica para apagar mercadoria
        // Depois de apagar, atualize a TableView
        atualizarTabela();
    }

    @FXML
    private void EditarMercadoria(MouseEvent event) {
        // Lógica para editar mercadoria
        // Depois de editar, atualize a TableView
        atualizarTabela();
    }

    @FXML
    private void initialize() {
        atualizarTabela();
    }

    private void atualizarTabela() {
        // Crie uma instância de Conexao
        Conexao conexao = new Conexao();

        // Obtém os dados do banco de dados (substitua por sua lógica de obtenção de dados)
        List<Produto> produtos = conexao.obterProdutosDoBanco();

        // Limpa a tabela
        tabelaProdutos.getItems().clear();

        // Adiciona os dados à tabela
        tabelaProdutos.getItems().addAll(produtos);

        // Lembre-se de fechar a conexão após o uso
        //conexao.fecharConexao();
    }

}
