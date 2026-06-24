
/**
 * File: PAssign06
 * Class: 1302
 * Author: Tyrone Darby
 * Created: March 28, 2026
 * Description: Create a phone number pad using javafx.
*/
package PAssign6;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PAssign06 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		
		// Create title for the stage
		primaryStage.setTitle("Phone Pad");
		
		// Make space between each button
		pane.setVgap(5);
		pane.setHgap(5);
		
		// Center the grid pane
		pane.setAlignment(Pos.CENTER);
		
		// Create buttons 1-9 and add them in a grid pane
		pane.add(new Button("1"), 0, 0);
		pane.add(new Button("2"), 1, 0);
		pane.add(new Button("3"), 2, 0);
		pane.add(new Button("4"), 0, 1);
		pane.add(new Button("5"), 1, 1);
		pane.add(new Button("6"), 2, 1);
		pane.add(new Button("7"), 0, 2);
		pane.add(new Button("8"), 1, 2);
		pane.add(new Button("9"), 2, 2);
		pane.add(new Button("*"), 0, 3);
		pane.add(new Button("0"), 1, 3);
		pane.add(new Button("#"), 2, 3);
				
		Scene scene = new Scene(pane, 100, 120);
		
		// Set and show scene
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
