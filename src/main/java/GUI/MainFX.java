package GUI;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       // primaryStage.setScene(FXMLLoader.load(getClass().getResource("MainPanel.fxml")));
        Parent root = FXMLLoader.load(getClass().getResource("panele.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
