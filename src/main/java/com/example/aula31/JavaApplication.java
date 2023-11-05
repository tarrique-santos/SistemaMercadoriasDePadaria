package com.example.aula31;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Do-While Example");

        VBox root = new VBox();
        Button startButton = new Button("Start Loop");
        root.getChildren().add(startButton);

        startButton.setOnAction(event -> {
            // Inicie o loop em uma nova Thread para não bloquear a interface do usuário.
            new Thread(() -> {
                boolean condition = true;
                do {
                    // Faça algo no loop.

                    // Atualize a interface do usuário se necessário.
                    Platform.runLater(() -> {
                        // Atualize a interface do usuário aqui.
                    });

                    // Simule alguma ação.
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Defina a condição para sair do loop, por exemplo, após um certo número de iterações.
                    // Neste exemplo, vamos sair após 5 iterações.
                    condition = false;
                } while (condition);
            }).start();
        });

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
