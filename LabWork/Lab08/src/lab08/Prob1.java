/**
* File: prob1.java
* Class: CSCI 1302
* Author: Lawson Cahill and Tyone Darby
* Created on: March 27, 2026
* Last Modified: March 27, 2026
* Description: Lab 8 MPG calculator in javafx
*/

package lab08;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Prob1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("Miles: ");
		TextField text1 = new TextField();
		
		Label label2 = new Label("Gallons: ");
		TextField text2 = new TextField();
		
		Label label3 = new Label("MPG: ");
		TextField text3 = new TextField();
		
		Button reset = new Button("Reset");
		Button calc = new Button("Calculate");
		
		GridPane pane = new GridPane();
		pane.add(label1, 0, 0);
		pane.add(text1, 1, 0);
		
		pane.add(label2, 0, 1);
		pane.add(text2, 1, 1);
		
		pane.add(label3, 0, 2);
		pane.add(text3, 1, 2);
		
		pane.add(reset, 0, 3);
		pane.add(calc, 1, 3);
		
		primaryStage.setTitle("MPG Calculator");
		
		
		Scene scene = new Scene(pane, 250, 100);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
