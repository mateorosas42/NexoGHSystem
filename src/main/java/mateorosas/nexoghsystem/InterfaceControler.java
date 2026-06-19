package mateorosas.nexoghsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;

public class InterfaceControler {
    private static final String PATH = "/mateorosas/nexoghsystem/";

    public static Scene getLoginScene(){
        URL resource = InterfaceControler.class.getResource(PATH + "login.fxml");
        FXMLLoader loader = new FXMLLoader(resource);
        try {
            return new Scene(loader.load(), 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return new ErrorScene();
        }
    }
}
