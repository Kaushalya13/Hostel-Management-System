package org.hms.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageStudentFromController {
    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private Label lblStudentID;

    @FXML
    private JFXTextField txtContactNo;

    @FXML
    private DatePicker datePicker;

    @FXML
    private RadioButton radioButton;

    @FXML
    private RadioButton radioButton01;

    @FXML
    private TableView<?> tblStudent;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContactNo;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colGender;
    public void btnSaveOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void txtSearchOnAction(ActionEvent actionEvent) {

    }
}
