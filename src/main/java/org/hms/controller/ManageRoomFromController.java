package org.hms.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ManageRoomFromController {

    @FXML
    private JFXTextField txtKeyMoney;

    @FXML
    private Label lblRoomID;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private ComboBox<?> cmbType;

    @FXML
    private TableView<?> tblRooms;

    @FXML
    private TableColumn<?, ?> colRoomID;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableColumn<?, ?> colKeyMoney;
    public void btnSaveOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void txtSearchOnAction(ActionEvent actionEvent) {
    }
}
