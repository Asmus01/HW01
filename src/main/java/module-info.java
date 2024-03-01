module com.example.hw01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.hw01 to javafx.fxml;
    exports com.example.hw01;
}