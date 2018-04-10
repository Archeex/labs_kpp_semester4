package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public  class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label txtField = new Label("Integral of sin(x)dx:");        //Объявление содержимого
        Label leftTip = new Label("Left limit:");
        Label rightTip = new Label("Right limit:");
        TextField leftLimit = new TextField();
        TextField rightLimit = new TextField();
        GridPane pane = new GridPane();
        Button equal = new Button("Equal");
        Label ans = new Label();

        pane.add(ans, 1,4);                         //Add in Pane
        pane.add(txtField, 0, 0);
        pane.add(leftTip, 0,1);
        pane.add(leftLimit,1,1);
        pane.add(rightTip,0,2);
        pane.add(rightLimit,1,2);
        pane.add(equal, 0,4);

        equal.setOnAction(event ->{                                     //Parsing button
            try {
                Double.parseDouble(leftLimit.getText());
                Double.parseDouble(rightLimit.getText());
//                if(Double.valueOf(leftLimit.getText()) < -1 || Double.valueOf(leftLimit.getText()) > 1
//                        || Double.valueOf(rightLimit.getText()) < -1 || Double.valueOf(rightLimit.getText()) > 1)
//                    throw new NumberFormatException();
            }
            catch (NumberFormatException exc){
                leftLimit.clear();
                rightLimit.clear();
                ans.setText("Wrong limits!");
                return;
            }

            double tl = Double.valueOf(leftLimit.getText());
            double dl = Double.valueOf(rightLimit.getText());
            double answer = Math.cos(tl)*-1 - Math.cos(dl)*-1;
            ans.setText(String.valueOf(answer));
        });

        pane.setAlignment(Pos.CENTER);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab1");
        primaryStage.setScene(new Scene(pane, 250, 100));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
