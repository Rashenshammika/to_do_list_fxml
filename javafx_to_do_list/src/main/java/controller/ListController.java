package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.*;

public class ListController {

    @FXML
    private TableView<?> doneTable;

    @FXML
    private TableView<?> listTable;

    @FXML
    private TextField txtListAdd;

    @FXML
    void btnOnActionAdd(ActionEvent event) {

    }

    @FXML
    void btnOnActionReload(ActionEvent event) {
        try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/to_do_list","root","12345");
            System.out.println(connection);

           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM list");

            System.out.println(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
