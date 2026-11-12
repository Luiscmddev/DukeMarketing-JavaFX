module br.dev.luis.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;

    opens br.dev.luis.dukemarket.javafx to javafx.fxml;
    opens br.dev.luis.dukemarket.javafx.controller to javafx.fxml;
    
    exports br.dev.luis.dukemarket.javafx;
    exports br.dev.luis.dukemarket.javafx.DAO;
    exports br.dev.luis.dukemarket.javafx.model;
    exports br.dev.luis.dukemarket.javafx.controller;
    exports connection;
    
    requires mysql.connector.java;
}
