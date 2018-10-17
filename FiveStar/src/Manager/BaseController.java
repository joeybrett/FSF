package Manager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BaseController {
	
	public void newJob() {
		try {
			Stage jobStage = new Stage();
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("JobCreate.fxml"));
			Scene scene = new Scene(root,600,300);
			jobStage.setTitle("Create Job");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			jobStage.setScene(scene);
			jobStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
