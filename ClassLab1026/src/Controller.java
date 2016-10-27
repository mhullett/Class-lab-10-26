import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {
	double tip;
	double bill;

	@FXML
	private Label tipOutput;

	@FXML
	private TextField tipInput;

	@FXML
	private RadioButton ten;

	@FXML
	private ToggleGroup Tips;

	@FXML
	private RadioButton fifteen;

	@FXML
	private RadioButton eightteen;

	@FXML
	private RadioButton twenty;

	@FXML
	void calculateListener(ActionEvent event) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		bill = Double.parseDouble(tipInput.getText());
		if (ten.isSelected()) {
			tip = 0.10;
			tipOutput.setText("Tip Amount $" + df.format(tip * bill));
		} else if (fifteen.isSelected()) {
			tip = 0.15;
			tipOutput.setText("Tip Amount $" + df.format(tip * bill));
		} else if (eightteen.isSelected()) {
			tip = 0.18;
			tipOutput.setText("Tip Amount $" + df.format(+ tip * bill));
		} else if (twenty.isSelected()) {
			tip = 0.20;
			tipOutput.setText("Tip Amount $" + df.format(+ tip * bill));
		}
	}
}
