package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sample.classes.Book;
import sample.classes.JsonGet;
import sample.classes.Library;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        JsonGet jsonGet = new JsonGet();
        String temp = "title=";
        String nameBook = "The Innovators";
        JsonGet.url = "https://api.nytimes.com/svc/books/v3/reviews.json?" + temp + nameBook + "&api-key=ppTp0mkMTgrTo0wAS4OOPu3U4biZwwi9";
        jsonGet.run();
        String jsonString = jsonGet.jsonIn;
        Object o = null;
        try {
            o = new JSONParser().parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) o;
        JSONArray jsonArray = (JSONArray) jsonObject.get("results");
        Library library = new Library((String) jsonObject.get("status"), (String) jsonObject.get("copyright"), jsonArray);
        System.out.println(library);
        launch(args);

    }
}
