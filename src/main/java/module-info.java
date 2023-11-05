module com.example.aula31 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.aula31 to javafx.fxml;
    exports com.example.aula31;
}