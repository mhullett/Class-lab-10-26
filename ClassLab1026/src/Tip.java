import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tip extends Application{	
	
	public static void main(String[]args){
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("tip.fxml"));
		//Load the fxml^
		
		//Build the senegraph
		Scene scene = new Scene(parent);
		
		//set and show the stage
		arg0.setScene(scene);
		arg0.setTitle("Tip.exe");
		arg0.show();
	
	}

}
