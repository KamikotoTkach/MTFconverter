package ru.cwcode.mtfporting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 1024, 480);
    
    stage.setTitle("MTF конвертер @ vk.com/cwcode");
    stage.setScene(scene);

    stage.setMinWidth(640);
    stage.setMinHeight(480);
    
    stage.show();
    
  }
  
  public static void main(String[] args) {
    launch();
  }
}