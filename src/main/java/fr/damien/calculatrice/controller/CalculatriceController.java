package fr.damien.calculatrice.controller;

import fr.damien.calculatrice.App;
import fr.damien.calculatrice.view.Display;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class CalculatriceController extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Calculatrice");
        stage.setResizable(false);

        Display display = new Display();

        Scene scene = new Scene(display.getRoot(), 600, 600);
        String path = Objects.requireNonNull(App.class.getResource("/css/style.css")).toExternalForm();
        System.out.println("path=" + path);
        scene.getStylesheets().add(path);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
