package application;
	
import java.io.IOException;

import controller.AddValueController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage currentStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			showAdd();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void showAdd() {
		try {
			BorderPane root;
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/AddValue.fxml"));
			root = (BorderPane)loader.load();
			AddValueController controller = loader.getController();
			controller.setMain(this);

			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			currentStage = stage;
			
		}catch(IOException ioexception) {
			ioexception.printStackTrace();
		}
	}
	
	public void showFilter() {
		try {
			BorderPane root;
			BorderPane filter = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/FilterMovements.fxml"));
			Stage stage = currentStage;
			
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(filter);
			stage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showList() {
		try {
			BorderPane root;
			BorderPane filter = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/MovementList.fxml"));
			Stage stage = currentStage;
			
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(filter);
			stage.show();
			
		}catch(IOException e){
			
		}
	}
}
