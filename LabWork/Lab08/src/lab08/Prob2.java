package lab08;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Prob2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		
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
