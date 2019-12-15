package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Class Main
 */
public class Main extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/sample.fxml"));
        primaryStage.setTitle("Library New York Times");
        primaryStage.setScene(new Scene(root, 735, 400));
        primaryStage.show();
    }

    /**
     * Function for search book
     */
    public static void searchBook() {
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/sample/FXML/searchBooks.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        final Parent root = loader.getRoot();
        final Stage stage = new Stage();
        stage.setScene(new Scene(root, 440, 130));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.showAndWait();
    }

    /**
     * Main function
     * @param args args
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
