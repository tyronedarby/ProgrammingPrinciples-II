
package lab08;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class SimpleCalculator extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		
		Button b1 = new Button("+");
		b1.setOnAction(e -> {
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			
			double result = num1 + num2;
			tf3.setText(Double.toString(result));
		});
		
		Button b2 = new Button("-");
		b2.setOnAction(e -> {
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			
			double result = num1 - num2;
			tf3.setText(Double.toString(result));
		});
		
		Button b3 = new Button("*");
		b3.setOnAction(e -> {
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			
			double result = num1 * num2;
			tf3.setText(Double.toString(result));
		});
		
		Button b4 = new Button("/");
		b4.setOnAction(e -> {
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			
			if(num2 > 0) {
				double result = num1 / num2;
				tf3.setText(Double.toString(result));
			} else {
				tf3.setText("Undefined");
			}
		});
		
		GridPane pane = new GridPane();
		pane.add(tf1, 0, 0);
		pane.add(b1, 1, 0);
		pane.add(b2, 2, 0);
		pane.add(tf2, 3, 0);
		pane.add(tf3, 4, 0);
		
		pane.add(b3, 1,1);
		pane.add(b4, 2, 1);
		
		primaryStage.setTitle("Simple Calculator");
		
		
		Scene scene = new Scene(pane, 500, 50);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
