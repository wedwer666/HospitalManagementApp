package sample.Pacients;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<storeContacts> contacts = FXCollections.observableArrayList();
    File f = new File("contacts.txt");

    @FXML
    public ListView list;

    @FXML
    public TextField name;

    @FXML
    public TextField phone;

    @FXML
    public TextField email;

    @FXML
    public TextField address;

    public void addContact() throws IOException {
        storeContacts contact = new storeContacts(name.getText(), phone.getText(), email.getText(), address.getText());
        contacts.add(contact);
        name.setText("");
        phone.setText("");
        email.setText("");
        address.setText("");

        FileWriter fw = new FileWriter(f);
        fw.append(contact.toString());
        fw.close();
    }

    public void removeContact() {
        storeContacts contact = (storeContacts) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }


    public void loginbutton(ActionEvent event) throws IOException  {
        System.out.println("You Cliked me");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("samplelogin.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(home_page_scene);
        stage.show();
    }
}
