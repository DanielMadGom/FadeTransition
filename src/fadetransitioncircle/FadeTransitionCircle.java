/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package fadetransitioncircle;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author usu2dam
 */
public class FadeTransitionCircle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Ellipse circle = new Ellipse(10, 10, 100, 50);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(150);
        circle.setCenterY(120);
        circle.setRadiusX(90);
        circle.setRadiusY(90);
        
        pane.getChildren().add(circle);
        
        FadeTransition fade = new FadeTransition(Duration.millis(1900), circle);
        fade.setFromValue(1.0);
        fade.setToValue(0.1);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();

        circle.setOnMousePressed(e -> fade.pause());
        circle.setOnMouseReleased(e -> fade.play());
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("PathTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
