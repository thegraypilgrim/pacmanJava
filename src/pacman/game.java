
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
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Background;

public class game extends Application{
        @Override
        public void start(Stage primaryStage){
                Pane pane = new Pane();
                Image img = new Image("https://cdn.goandroid.co.in/wp-content/uploads/2015/04/wpid-pacman.jpg");
                BackgroundImage bgImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, 
                                BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, new BackgroundSize(448.0, 496.0, false, false, true, false));
                pane.setBackground(new Background(bgImg));
                pane.setStyle("-fx-background-image: url(https://cdn.goandroid.co.in/wp-content/uploads/2015/04/wpid-pacman.jpg)");
                Scene scene = new Scene(pane, 448, 496);
                primaryStage.setTitle("circles");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String[] args){
                 launch(args);
        }
}
