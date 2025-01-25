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
        
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); 
        gridPane.setVgap(10); 
        Label label = new Label("Enter your text:");
        TextField textField = new TextField();

        Button button = new Button("Display Text");
        Label outputLabel = new Label();

        button.setOnAction(event -> {
            String inputText = textField.getText(); 
            outputLabel.setText(inputText);        
        });

        
        gridPane.add(label, 0, 0);        
        gridPane.add(textField, 1, 0);   
        gridPane.add(button, 0, 1);      
        gridPane.add(outputLabel, 1, 1); 

       
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Text Display App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
