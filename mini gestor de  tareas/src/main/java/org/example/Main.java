package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);

        Scene scene = new Scene(controller.getRoot(), 980, 620);
        stage.setTitle("Tareas — JavaFX (sin FXML)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}