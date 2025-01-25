import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileChooserExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label filePathLabel = new Label("Selected file path will be displayed here.");

       
        Button openFileButton = new Button("Open File Chooser");
        openFileButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            // Set the title of the FileChooser
            fileChooser.setTitle("Open Resource File");
            // Show the Open dialog and get the selected file
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                // Update the label with the selected file's name and path
                filePathLabel.setText("Selected file: " + selectedFile.getName() + "\nPath: " + selectedFile.getAbsolutePath());
            } else {
                filePathLabel.setText("File selection canceled.");
            }
        });

      
        VBox vbox = new VBox(10, openFileButton, filePathLabel);
        vbox.setPrefSize(400, 200);

        
        Scene scene = new Scene(vbox);
        primaryStage.setTitle("File Chooser Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
