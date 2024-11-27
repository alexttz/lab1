module org.example.projeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projeto to javafx.fxml;
    exports org.example.projeto;
}