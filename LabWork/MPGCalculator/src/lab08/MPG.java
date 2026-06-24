
package lab08;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MPG extends Application{

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
		reset.setOnAction(e -> {
			text1.setText("0");
			text2.setText("0");
			text3.setText("0");
		});
		
		Button calc = new Button("Calculate");
		
		calc.setOnAction(e -> {
			if (text1.getText() != null &&!text1.getText().isEmpty() || text2.getText() != null &&!text2.getText().isEmpty()) {
				double miles = Double.parseDouble(text1.getText());
				double gallon = Double.parseDouble(text2.getText());
				
				double mpg = miles / gallon;
				text3.setText(Double.toString(mpg));
			} else {
				text3.setText("Value Require");
			}
		});
		
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
		
		
		Scene scene = new Scene(pane, 200, 100);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
