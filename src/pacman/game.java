
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

public class game extends Application {
        @Override
        public void start(Stage primaryStage){
                Pane pane = new Pane();

                pane.setStyle("-fx-background-image: url(File:../img/emptyMap.png)");
                Scene scene = new Scene(pane, 448, 496);
                primaryStage.setTitle("circles");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String[] args){
                 launch(args);
        }
}
