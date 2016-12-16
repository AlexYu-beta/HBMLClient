package presentation.view.customerui.customerui;

import java.io.IOException;
import java.util.Date;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HotelListPageUI extends Scene
{
	public HotelListPageUI(Parent root, Stage stage, Scene preScene, String searchInfo, boolean state)
	{
		super(root);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../customeruiFXML/HotelListPage.fxml"));
		try{
			this.setRoot(fxmlLoader.load());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		HotelListPageController controller = fxmlLoader.getController();
		controller.init(stage, preScene,this, searchInfo, state);
	}
	
	public HotelListPageUI(Parent root, Stage stage, Scene preScene, String province, String city, String region, Date checkinTime, int star,boolean state)
	{
		super(root);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../customeruiFXML/HotelListPage.fxml"));
		try{
			this.setRoot(fxmlLoader.load());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		HotelListPageController controller = fxmlLoader.getController();
		controller.init(stage, preScene, province, city, region, checkinTime, star,state);
	}
}
