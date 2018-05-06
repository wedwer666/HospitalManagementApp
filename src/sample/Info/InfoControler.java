//package sample;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextField;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class InfoControler implements Initializable {
//
//    ObservableList<storeInfo> Info = FXCollections.observableArrayList();
//    File f_info = new File("info.txt");
//
//    @FXML
//    public ListView list2;
//
//    @FXML
//    public TextField data;
//
//    @FXML
//    public TextField sectiunea;
//
//    public void addInfo() throws IOException {
//        storeInfo info = new storeInfo(data.getText(), sectiunea.getText());
//        Info.add(info);
//        data.setText("");
//        sectiunea.setText("");
//
//        FileWriter fw = new FileWriter(f_info);
//        fw.append(info.toString());
//        fw.close();
//    }
//
//    public void removeContact() {
//        storeContacts inf = (storeContacts) list2.getSelectionModel().getSelectedItem();
//        Info.remove(inf);
//    }
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//    }
//}
