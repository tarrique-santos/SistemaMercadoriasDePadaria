package com.example.aula31;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Label lblResultado;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;

    @FXML
    public void efetuarLogin(MouseEvent event) {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        if(usuario.equals("admin") && senha.equals("123")){
            lblResultado.setText("Bem vindo "+usuario);
        }else{
            lblResultado.setText("Informações incorretas");
        }

    }

}
