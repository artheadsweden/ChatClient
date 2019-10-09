package se.arthead;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea txtOutput;

    @FXML
    private TextField txtInput;

    @FXML
    private ListView<?> lstUsers;

    @FXML
    void sendMessage(ActionEvent event) {

    }

}
