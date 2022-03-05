package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddValueController {

    @FXML
    private TextField tfValue;

    @FXML
    private RadioButton rbRevenues,rbExpenses;

    @FXML
    private DatePicker date;
    
    private Main main;

    @FXML
    void AddRegist(ActionEvent event) {
    	main.showAdd();
    }

    @FXML
    void FilterRegist(ActionEvent event) {
    	main.showFilter();
    }

    @FXML
    void MovementList(ActionEvent event) {
    	main.showList();
    }
    
    public void setMain(Main main) {
    	this.main=main;
    }
}
