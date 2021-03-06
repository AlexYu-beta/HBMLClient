package presentation.view.customerui.customerui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vo.UserVO;

public class WelcomePageUILogoutEdition extends Scene
{
		public WelcomePageUILogoutEdition(Parent root, Stage stage, Scene preScene, FirstPageUIController fcontroller,UserVO userVO)
		{
			super(root);
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customeruiFXML/WelcomePageUILogoutEdition.fxml"));
			try
			{
				this.setRoot(fxmlLoader.load());
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			
			WelcomePageUILogoutEditionController controller = fxmlLoader.getController();
			controller.init(stage, preScene, fcontroller,userVO);
		}
}
