package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("startMenu.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
        //System.out.println(primaryStage.toString());
    }
    public static void main(String[] args) {
        launch(args);
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Field f1 = new Field();
        f1.autocomplete();

        f1.setCell(10,10,6);

        f1.setCellShip(1,1,new Ship(2));
        f1.printField();
        //System.out.println(f1.getCell(10,10).getConditiopn());
        System.out.println();
        Cell a= f1.getCell(10,10);
        f1.getXY(a);

    }
}
*/