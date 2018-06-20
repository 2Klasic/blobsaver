package blobsaver;

import com.sun.javafx.PlatformUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static final String appVersion = "v1.0.1";
    static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("blobsaver.fxml"));
        primaryStage.setTitle("SHSH Blob Saver " + appVersion);
        if (PlatformUtil.isWindows()) {
            primaryStage.setScene(new Scene(root, 520, 570));
        } else {
            primaryStage.setScene(new Scene(root, 500, 540));
        }
        primaryStage.getScene().getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        primaryStage.show();
        primaryStage.setResizable(false);
        Main.primaryStage = primaryStage;
    }
}
