import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Dialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.Pos;

public class HelloWorldGUI extends Application{
	
	@Override
	public void start(Stage primaryStage){
		
		Button button = new Button("Hello");			// Controls used in GUI
		TextField textField = new TextField();			// 
		VBox vBox = new VBox();							//
		
		button.setOnMouseClicked(e -> display(textField)); 			// Callback for button click event
		
		vBox.getChildren().add(button);					// Adding controls to vertical box
		vBox.getChildren().add(textField);				// and setting alignment of vertical 
		vBox.setAlignment(Pos.CENTER);					// box
		
		Scene scene = new Scene(vBox, 350, 150);		// Create a main scene with vertical box
		
		primaryStage.setTitle("Hello World");			// Set primary stage title
		
		primaryStage.setScene(scene);					// Set primarys satges scene
		
		primaryStage.show();							// Show primary stage
	}
	
	private void display(TextField textField){
		
		Dialog pane = new Dialog();									// Create new dialog
		pane.setContentText("Hello " + textField.getText());		// Set text in dialog
		pane.showAndWait();											// Show dialog
	}
	
	public static void main(String[] args){
		launch(args);									// Launch application
	}
}