package controller;

import java.time.LocalDate;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.OperationsMove;

public class AddValueController {

    @FXML
    private TextField tfValue;

    @FXML
    private RadioButton rbRevenues,rbExpenses;

    @FXML
    private DatePicker date;
    
    private Main main;
    
    private OperationsMove om= new OperationsMove();

    @FXML
    public void addRegist(ActionEvent event) {
    	main.showAdd();
    }

    @FXML
    public void filterRegist(ActionEvent event) {
    	main.showFilter();
    }

    @FXML
    public void movementList(ActionEvent event) {
    	main.showList();
    }
    
    public void setMain(Main main) {
    	this.main=main;
    }
    
    @FXML
    public void addMovement(ActionEvent event) {
    	
    	LocalDate myDate= date.getValue();
    	if(tfValue.getText()==""||(!rbRevenues.isSelected()&&!rbExpenses.isSelected())||myDate.toString()=="") {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning Dialog");
    		alert.setContentText("Falta completar espacios en blanco");
    		alert.showAndWait();
    	}
    	else {
    		try {
    			int revenue=0;
    			int expenses=0;
    			if(rbRevenues.isSelected()) {
    				revenue=Integer.parseInt(tfValue.getText());
    			}
    			else {
    				expenses=Integer.parseInt(tfValue.getText());
    			}
    			
    			om.checkMove(revenue, expenses, myDate);
    			
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public OperationsMove sentOperation() {
    	return om;
    }
}
