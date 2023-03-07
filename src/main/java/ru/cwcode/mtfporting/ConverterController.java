package ru.cwcode.mtfporting;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import ru.cwcode.mtfporting.adapter.*;

import java.io.IOException;
import java.util.HashMap;

public class ConverterController {
  public static HashMap<String, TextAdapter> adapters = new HashMap<>() {{
    put("Plain", new PlainAdapter());
    put("Legacy", new LegacyAdapter());
    put("MiniMessage", new MiniMessageAdapter());
    put("Json", new JsonAdapter());
  }};
  @FXML
  private Button formatButton;
  @FXML
  private TextArea textFrom;
  @FXML
  private TextArea textTo;
  @FXML
  private ChoiceBox<String> textFromFormat;
  @FXML
  private ChoiceBox<String> textToFormat;
  
  @FXML
  protected void initialize() {
    textFromFormat.setItems(FXCollections.observableArrayList(adapters.keySet()));
    textToFormat.setItems(FXCollections.observableArrayList(adapters.keySet()));
    
    textFromFormat.setValue("Legacy");
    textToFormat.setValue("MiniMessage");
  }
  
  @FXML
  protected void onFormatButtonClick() {
    TextAdapter from = getAdapter(textFromFormat.getValue());
    TextAdapter to = getAdapter(textToFormat.getValue());
    
    textTo.setText(to.deserialize(from.serialize(textFrom.getText())));
  }
  @FXML
  protected void openCwcode() {
    try {
      Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "https://vk.com/cwcode");
    } catch (IOException e) {
    
    }
  }
  @FXML
  protected void onSwapButtonClick() {
    String from = textFrom.getText();
    textFrom.setText(textTo.getText());
    textTo.setText(from);
  
    String fromFormat = textFromFormat.getValue();
    textFromFormat.setValue(textToFormat.getValue());
    textToFormat.setValue(fromFormat);
  }
  
  private TextAdapter getAdapter(String name) {
    return adapters.get(name);
  }
}