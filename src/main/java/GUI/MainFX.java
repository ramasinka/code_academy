package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");
        primaryStage.setScene(createScene(loadMainPane("MainPanel.fxml")));
        primaryStage.show();

    }

    private Pane loadMainPane(String path) throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(
                getClass().getResourceAsStream(path));

        return mainPane;
    }


    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
        return scene;
    }
}
