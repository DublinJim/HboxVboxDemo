module com.example.hboxvboxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hboxvboxdemo to javafx.fxml;
    exports com.example.hboxvboxdemo;
}