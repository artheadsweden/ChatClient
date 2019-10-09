package se.arthead;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatGui extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chatGui.fxml"));
        primaryStage.setTitle("Super Chat");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public void run() {
        launch(null);
    }
}
