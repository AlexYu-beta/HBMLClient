package presentation.view.customerui.customerui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExecutedOrderPageUI extends VBox
{
	public ExecutedOrderPageUI(Stage stage,int userID)
	{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customeruiFXML/ExecutedOrder.fxml"));
		try
		{
			this.getChildren().add(fxmlLoader.load());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
//		OrderFirstPageUIFromFirstPageController controller = fxmlLoader.getController();
//		controller.initEditingPart();
		ExecutedOrderUIController controller = fxmlLoader.getController();
		controller.init(stage,userID);
	}
}
