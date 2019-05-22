import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.application.Platform;

public class ButtonJavafx extends Application {
	public void start(Stage stage) {
		Button button1 = new Button("<<��>>");
		Button button2 = new Button("<<��>>");
		Button button3 = new Button("<<�I��>>");
		Label label1 = new Label("");
		
		button1.setOnAction((ActionEvent) -> {
			label1.setText("���͂悤!");
		});
		
		button2.setOnAction((ActionEvent) -> {
			label1.setText("���悤�Ȃ�");
		});
		
		button3.setOnAction((ActionEvent) -> {
			Platform.exit();
		});
		
		BorderPane pane = new BorderPane();
		stage.setTitle("�R���|�[�l���g�\��");
		pane.setTop(label1);
		pane.setLeft(button1);
		pane.setRight(button2);
		pane.setCenter(button3);
		
		stage.setScene(new Scene(pane, 320, 120));
		stage.show();
	}
}