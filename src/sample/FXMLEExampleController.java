package sample;



package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML private Text actiontarget;

    @FXML protected void onAction="handleSubmitButtonAction(event);"{
        actiontarget.setText("Sign in button pressed");
    }

}

public class FXMLEExampleController {






}
