package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Scene scene = new Scene(new HBox(20), 400, 100);
        primaryStage.setTitle("Color Picker");
        HBox box = (HBox) scene.getRoot();
        final ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.BLUE);

        final Text text = new Text("Color picker: ");
        text.setFill(colorPicker.getValue());

        colorPicker.setOnAction((ActionEvent event) -> text.setFill(colorPicker.getValue()));

        box.getChildren().addAll(colorPicker, text);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
