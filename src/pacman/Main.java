
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * The entry point of the Pacman game
 */
public class Main extends Application {
        private static final short WIDTH = 448;
        private static final short HEIGHT = 496;

        @Override
        public void start(Stage primaryStage) {
                
                Pane boardPane = new Pane();
                boardPane.setStyle(getPaneStyles());
                
                Scene scene = new Scene(boardPane, WIDTH, HEIGHT);
                primaryStage.setTitle("Pacman");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String[] args){
                 launch(args);
        }

        /**
         * Returns the CSS prperties for the Pane containing the main board
         * @return A inline String of CSS properties 
         */
        private static String getPaneStyles () {
                final String bgImage = "File:../img/emptyMap.png";
                //semi-colon is required at the end of each CSS prop (inside quotes)
                String props = "";
                props += "-fx-background-image: url(" + bgImage + ");";
                props += "-fx-background-repeat: stretch;";
                props += "-fx-background-position: center center;";

                return props;
        }
}
