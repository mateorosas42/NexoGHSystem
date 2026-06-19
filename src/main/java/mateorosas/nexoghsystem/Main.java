package mateorosas.nexoghsystem;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    static void main() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        stage.setTitle("NexoGHS");
        stage.centerOnScreen();
        stage.setWidth(600);
        stage.setScene(InterfaceControler.getLoginScene());
        stage.setHeight(400);
        stage.show();
    }
}
