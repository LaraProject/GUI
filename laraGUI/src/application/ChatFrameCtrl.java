package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ChatFrameCtrl extends Main {
	
    @FXML
    private Label welcomeLabel;

    @FXML
    private Button buttonRiad;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button buttonAnna;

    @FXML
    private Button buttonLouis;

    @FXML
    private Button buttonAntoine;

    @FXML
    private TextField messageInput;

    @FXML
    private TextArea chatBox;

    @FXML
    private Button sendButton;

    @FXML
    void idLouis(ActionEvent event) {
    	Lara = "Louis";
    	chatBox.setText("");
    }

    @FXML
    void idAnna(ActionEvent event) {
    	Lara = "Anna";
    	chatBox.setText("");
    }

    @FXML
    void idRiad(ActionEvent event) {
    	Lara = "Riad";
    	chatBox.setText("");
    }

    @FXML
    void idAntoine(ActionEvent event) {
    	Lara = "Antoine";
    	chatBox.setText("");
    }

    @FXML
    void sendMessage(ActionEvent event) {
    	if (messageInput.getText().length() < 1) {
            // do nothing
        } else if (messageInput.getText().equals(".clear")) {
            chatBox.setText("Cleared all messages\n");
            messageInput.setText("");
        } else {
            chatBox.appendText("<" + username + ">:  " + messageInput.getText() + "\n");
            // TRAITER CAS OÙ AUCUN LARA SELECTIONNÉ
            chatBox.appendText("<"+ Lara +">:  " + messageInput.getText() + "\n"); // doit chopper Lara
            messageInput.setText("");
            
        }
        messageInput.requestFocus();
    }

}
