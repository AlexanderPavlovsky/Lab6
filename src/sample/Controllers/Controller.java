package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import sample.Main;
import sample.classes.Table;
import sample.classes.Book;
import sample.classes.Library;

/**
 * Class Controller
 */
public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    /**
     * Table view of books
     */
    @FXML
    private TableView<Table> libraryTable;
    /**
     * Table column of book title
     */
    @FXML
    private TableColumn<Table, String> bookTitle;
    /**
     * Table column of book author
     */
    @FXML
    private TableColumn<Table, String> bookAuthor;
    /**
     * Table column of book summary
     */
    @FXML
    private TableColumn<Table, String> summary;
    /**
     * Table column of book isbn
     */
    @FXML
    private TableColumn<Table, String> isbn;
    /**
     * Table column of by line New York Times
     */
    @FXML
    private TableColumn<Table, String> byLine;
    /**
     * Table column of publication date in New York Times
     */
    @FXML
    private TableColumn<Table, String> publicationDT;


    @FXML
    void searchBook(final ActionEvent event) {
        Main.searchBook();
        if (ControllerSearchBooks.library != null) {
            library = ControllerSearchBooks.library;
            creatTable();
        }

    }

    /**
     * Object Library
     */
    private Library library = new Library();
    /**
     * Object ObservableList
     */
    private ObservableList<Table> data = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        bookTitle.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        bookTitle.setCellFactory(param -> {
            TableCell<Table, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(bookTitle.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });
        bookAuthor.setCellValueFactory(new PropertyValueFactory<>("bookAuthor"));
        bookAuthor.setCellFactory(param -> {
            TableCell<Table, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(bookAuthor.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });
        summary.setCellValueFactory(new PropertyValueFactory<>("summary"));
        summary.setCellFactory(param -> {
            TableCell<Table, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(summary.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });
        isbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        byLine.setCellValueFactory(new PropertyValueFactory<>("byLine"));
        byLine.setCellFactory(param -> {
            TableCell<Table, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(byLine.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });
        publicationDT.setCellValueFactory(new PropertyValueFactory<>("publicationDT"));
        libraryTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        libraryTable.setItems(data);
    }

    @FXML
    void about(final ActionEvent event) {
        final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("About");
        alert.setContentText("Library\nAlexander Pavlovsky\n2019 \u00A9 copyright");
        alert.show();
    }

    private void creatTable() {
        data.clear();
        for (Book book : library.getBooks()) {
            data.add(new Table(book));
        }
    }
}
