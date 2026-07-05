import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws Exception {

  
    var view = getClass().getResource("View.fxml");

    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(view);

    var scene = new Scene(loader.load());

    stage.setScene(scene);
    stage.show();

  }
}