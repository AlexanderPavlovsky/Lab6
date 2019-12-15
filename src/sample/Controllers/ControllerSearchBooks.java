package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sample.classes.JsonGet;
import sample.classes.Library;

/**
 * Class ControllerSearchBooks
 */
public class ControllerSearchBooks {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    /**
     * Choice box of search by
     */
    @FXML
    private ChoiceBox<searchByEnum> searchBy;
    /**
     * Text field of search by
     */
    @FXML
    private TextField searchByTextField;
    /**
     * Button "search"
     */
    @FXML
    private Button buttonSearch;
    /**
     * Button "cancel"
     */
    @FXML
    private Button buttonCancel;

    @FXML
    void cancel(final ActionEvent event) {
        final Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void search(final ActionEvent event) {
        String searchByText = null;
        boolean fail = false;
        String failText = null;
        if (searchBy.getValue() == searchByEnum.Title) {
            if (searchByTextField.getText().matches("[A-Z,a-z ]+")) {
                searchByTextField.setStyle("-fx-border-color: defult");
                searchByText = "title=" + searchByTextField.getText();
            } else {
                searchByTextField.setStyle("-fx-border-color: red");
                failText = "Title of book is fail";
                fail = true;
            }
        } else if (searchBy.getValue() == searchByEnum.Author) {
            if (searchByTextField.getText().matches("[A-Z][a-z]+[ ]+[A-z][a-z]+")) {
                searchByTextField.setStyle("-fx-border-color: defult");
                searchByText = "author=" + searchByTextField.getText();
            } else {
                searchByTextField.setStyle("-fx-border-color: red");
                failText = "Author of book is fail";
                fail = true;
            }
        } else if (searchBy.getValue() == searchByEnum.ISBN) {
            if (searchByTextField.getText().matches("[0-9]{13}")) {
                searchByTextField.setStyle("-fx-border-color: defult");
                searchByText = "isbn=" + searchByTextField.getText();
            } else {
                searchByTextField.setStyle("-fx-border-color: red");
                failText = "ISBN of book is fail. For example \"9781476708706\"";
                fail = true;
            }
        }
        if (fail) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(failText);
            alert.show();
        } else {
            JsonGet jsonGet = new JsonGet();
            JsonGet.url = "https://api.nytimes.com/svc/books/v3/reviews.json?" + searchByText + "&api-key=ppTp0mkMTgrTo0wAS4OOPu3U4biZwwi9";
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
            if (!jsonArray.isEmpty()) {
                library = new Library((String) jsonObject.get("status"), (String) jsonObject.get("copyright"), jsonArray);
                closeScene();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Found nothing");
                alert.show();
            }
        }
    }

    /**
     * Object Library
     */
    static Library library = new Library();

    @FXML
    void initialize() {
        searchBy.setItems(FXCollections.observableArrayList(searchByEnum.values()));
        searchBy.setValue(searchByEnum.Title);

    }

    /**
     * Enum search by
     */
    enum searchByEnum {
        Title,
        Author,
        ISBN
    }

    private void closeScene() {
        final Stage stage = (Stage) buttonSearch.getScene().getWindow();
        stage.close();
    }
}