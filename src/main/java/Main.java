import ClassessAndMetchods.MusicPlayer;
import Controllers.Controller;
import Controllers.PrimaryWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/FXML/MainWindow.fxml"));


            StackPane stackPane = loader.load(); /*  zaladowanie panelu */
            Controller controller = loader.getController();



            Scene scene = new Scene (stackPane);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Kici App");
            primaryStage.show();



        }


    public static void main(String[] args) {
        launch(args);
    }
}
