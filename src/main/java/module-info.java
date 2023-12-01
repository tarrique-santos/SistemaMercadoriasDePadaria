module com.example.aula31 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.Home to javafx.fxml;
    exports com.example.Home;
}