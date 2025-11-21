module com.example.campusapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens campusapp to javafx.fxml;
    exports campusapp;
    exports campusapp.controllers;
    opens campusapp.controllers to javafx.fxml;
}