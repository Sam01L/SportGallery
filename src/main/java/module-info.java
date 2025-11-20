module com.example.anothercookieclicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anothercookieclicker to javafx.fxml;
    exports com.example.anothercookieclicker;
}