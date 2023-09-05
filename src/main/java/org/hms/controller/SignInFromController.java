package org.hms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInFromController {
    @FXML
    private Button btnRegister;

    @FXML
    private Button btnBack;
    public void btnRegisterOnAction(ActionEvent actionEvent) {

    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/login_from.fxml"));
        Stage stage = (Stage) btnBack.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("SignIn From");
        stage.centerOnScreen();
    }
}
