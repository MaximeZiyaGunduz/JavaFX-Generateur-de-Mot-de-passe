import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Pwd_Generator extends Application {

    public static void main(String[] args) {
        System.out.println("Début");
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load((this.getClass().getResource("view/Pwd_Generator.fxml")));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Generateur de Mot de passe");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
