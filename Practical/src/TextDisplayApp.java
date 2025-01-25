import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextDisplayApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // Horizontal gap between columns
        gridPane.setVgap(10); // Vertical gap between rows

        // Create a Label
        Label label = new Label("Enter your text:");

        // Create a TextField
        TextField textField = new TextField();

        // Create a Button
        Button button = new Button("Display Text");

        // Create another Label to show the text
        Label outputLabel = new Label();

        // Add an action event to the Button
        button.setOnAction(event -> {
            String inputText = textField.getText(); // Get the text from the TextField
            outputLabel.setText(inputText);        // Set the text on the Label
        });

        // Add the controls to the GridPane
        gridPane.add(label, 0, 0);        // (column=0, row=0)
        gridPane.add(textField, 1, 0);   // (column=1, row=0)
        gridPane.add(button, 0, 1);      // (column=0, row=1)
        gridPane.add(outputLabel, 1, 1); // (column=1, row=1)

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Text Display App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

