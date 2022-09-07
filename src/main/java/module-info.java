module org.example.fxexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens org.example.fxexample to javafx.fxml;
    exports org.example;

}