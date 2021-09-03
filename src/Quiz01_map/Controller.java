package Quiz01_map;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	
	@FXML private Button btn;
	@FXML private TextField txtId;
	@FXML private PasswordField txtPw;
	MyDB db = new MyDB();
	Alert alert = new Alert(AlertType.INFORMATION);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction(e->{
			if(txtId.getText().isEmpty()) {
				requestId();
			}
			
			else if(txtPw.getText().isEmpty()) {
				requestPw();
			}
			
			else {
				comparePw();
			}
		});
		
	}
	
	public void requestId() {
		alert.setTitle("메시지");
		alert.setHeaderText("메시지");
		alert.setContentText("idTextField를 입력 해야합니다");
		alert.show();
	}
	public void requestPw() {
		alert.setTitle("메시지");
		alert.setHeaderText("메시지");
		alert.setContentText("pwTextField를 입력 해야합니다");
		alert.show();		
	}
	public void comparePw(){		
		Iterator it = db.getTable().keySet().iterator();
		while(it.hasNext()) {
			String id = (String)it.next();
			if(id.equals(txtId.getText())&&(db.getTable().containsValue(txtPw.getText()))) {
				alert.setTitle("메시지");
				alert.setHeaderText("메시지");
				alert.setContentText("로그인 성공");
				alert.show();	
			}else {
				alert.setTitle("메시지");
				alert.setHeaderText("메시지");
				alert.setContentText("로그인 실패");
				alert.show();		
			}
		}	
	}
}
