package controller;

import java.awt.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Movements;
import model.OperationsMove;

public class MovementListController {
	
	private OperationsMove op= new OperationsMove();
	
	@FXML
	private TableView<Movements> tvMoves;
	
	@FXML
    private TableColumn<Movements, String> tcDate;

    @FXML
    private TableColumn<Movements, String> tcRevenues;

    @FXML
    private TableColumn<Movements, String> tcExpenses;

    @FXML
    private TextField tfBalance;
    
    public void initialize() {
    	tcDate.setCellValueFactory(new PropertyValueFactory<>("defDate"));
    	tcRevenues.setCellValueFactory(new PropertyValueFactory<>("defRevenues"));
    	tcExpenses.setCellValueFactory(new PropertyValueFactory<>("defExpenses"));
    	
    	ObservableList<Movements> moves = FXCollections.observableArrayList(op.getList());
    	tvMoves.setItems(moves);
    }
}
