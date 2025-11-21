package campusapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("/views/login.fxml"));
        Scene scene = new Scene(fxml.load());
        stage.setScene(scene);
        stage.setTitle("Campus Events App - Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

