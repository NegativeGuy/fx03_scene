package ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

// 신빌더에서 controllerclass로 설정해놨기 때문에
// 신빌더가 실행되면 자동으로 이 클래스가 실행된다
public class Controller implements Initializable{ // 상속(implements)을 해준다

	
	// 신빌더에서 만든 버튼 등을 이 클래스에서 코드화 하려면 아래처럼 설정해준다
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField02;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적으로 사용합니다");
		btn.setOnAction(e->{ // btn을 클릭하면(onAction)
			txtPrint();// 람다식으로 이 매서드 호출
		});
		
//		btn.setOnMouseClicked(e->{ // btn을 클릭하면(onAction)
//			txtPrint();// 람다식으로 이 매서드 호출
//		});
		
//		btn.setOnMousePressed(e->{ // btn을 클릭하면(onAction)
//			txtPrint();// 람다식으로 이 매서드 호출
//		});
		
	}
	public void txtPrint() {
		System.out.println(txtField.getText());
		// 텍스트 필드에 써진 텍스트를 가져와서 출력
		
		txtField02.setText(txtField.getText());
		txtField.setText("");	// txtField를 빈칸으로 만들기 위해
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("조심하세요");
		alert.show();
	}
}
