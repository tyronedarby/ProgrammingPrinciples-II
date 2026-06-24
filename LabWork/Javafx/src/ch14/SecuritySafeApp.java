package ch14;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SecuritySafeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Digital Display (Label)
        Label statusDisplay = new Label("ENTER CODE");
        statusDisplay.setFont(new Font("Courier New", 20));
        statusDisplay.setTextFill(Color.LIME);
        statusDisplay.setStyle("-fx-background-color: black; -fx-padding: 10; -fx-border-color: gray;");
        statusDisplay.setPrefWidth(220);
        statusDisplay.setAlignment(Pos.CENTER);

        // 2. The Custom Keypad (Extending KeyPadPane)
        // We use true for 'phoneOrder' to get the * and # keys
        SafeKeypad safeKeypad = new SafeKeypad(true, statusDisplay);
        safeKeypad.setAlignment(Pos.CENTER);
        safeKeypad.setHgap(10);
        safeKeypad.setVgap(10);

        // 3. Real-world Object Component: The Safe Handle (ImageView)
        // Using a placeholder URL - replace with a local image if preferred
        Image handleImg = new Image("https://cdn-icons-png.flaticon.com/512/1000/1000951.png");
        ImageView safeHandle = new ImageView(handleImg);
        safeHandle.setFitWidth(100);
        safeHandle.setPreserveRatio(true);

        // 4. Layout: Building the Safe Door
        VBox interfaceLayout = new VBox(25);
        interfaceLayout.setAlignment(Pos.CENTER);
        interfaceLayout.setStyle("-fx-background-color: #34495e; -fx-border-color: #2c3e50; -fx-border-width: 15;");
        
        // Horizontal box to hold keypad and handle side-by-side
        HBox components = new HBox(40, safeKeypad, safeHandle);
        components.setAlignment(Pos.CENTER);

        interfaceLayout.getChildren().addAll(statusDisplay, components);

        // 5. Scene and Stage
        Scene scene = new Scene(interfaceLayout, 500, 450);
        primaryStage.setTitle("Secure Vault System v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * TASK 5: Add user interaction by extending KeyPadPane.
     * This handles the logic for a "Master Code" and visual feedback.
     */
    class SafeKeypad extends KeyPadPane {
        private String inputAttempt = "";
        private final String CORRECT_CODE = "1234";
        private Label display;

        public SafeKeypad(boolean phoneOrder, Label display) {
            super(phoneOrder);
            this.display = display;
        }

        @Override
        protected void registerEventHandlers() {
            // We call the super version to keep the original console prints, 
            // but we add our safe-specific logic to the buttons.
            
            // Determine which list to use based on the parent's logic
            java.util.ArrayList<Button> currentButtons = (copyListButtons != null) ? copyListButtons : listButtons;

            for (Button btn : currentButtons) {
                btn.setOnAction(e -> {
                    String text = btn.getText().trim();
                    
                    // Console update (Requirement Task 5)
                    System.out.println("Safe Input: " + text);
                    
                    if (text.equals("#")) {
                        processCode();
                    } else if (text.equals("*")) {
                        inputAttempt = "";
                        display.setText("CLEARED");
                        display.setTextFill(Color.LIME);
                    } else if (!text.isEmpty()) {
                        inputAttempt += text;
                        display.setText("CODE: " + "*".repeat(inputAttempt.length()));
                    }
                });
            }
        }

        private void processCode() {
            if (inputAttempt.equals(CORRECT_CODE)) {
                display.setText("UNLOCKED");
                display.setTextFill(Color.CYAN);
                System.out.println(">>> ACCESS GRANTED: Safe door mechanism released.");
            } else {
                display.setText("ACCESS DENIED");
                display.setTextFill(Color.RED);
                System.out.println(">>> ACCESS DENIED: Incorrect code entered.");
                inputAttempt = ""; // Reset after fail
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
