

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


/**
 * Created by sgfromrus on 11.2017
 */
public class Controller {
    @FXML public TextField resultTextField;
    @FXML private TextField textLenField;
    @FXML private CheckBox numbers;
    @FXML private CheckBox upperCase;

    private PasswordGenerator generator = new PasswordGenerator();

    public void btnClick(ActionEvent actionEvent) {
        String testStr = textLenField.getText();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testStr.length(); i++) {
            if (testStr.charAt(i) < '0' || testStr.charAt(i) > '9') {
                continue;
            } else {
                sb.append(testStr.charAt(i));
            }
        }

        if (sb.length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("You input no numbers!");
            alert.setContentText("You have to input length of password");
            alert.showAndWait();
        } else {
            String text = generator.generate(Integer.parseInt(sb.toString()), numbers.isSelected(), upperCase.isSelected());
            textLenField.setText(sb.toString());
            resultTextField.setText(text);
        }

    }
}
