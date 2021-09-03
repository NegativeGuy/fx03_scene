package ex02;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		System.out.println("실행 시점 1");  // 실행 순서를 확인하기 위한 시점 출력
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		System.out.println("실행 시점 2");  // 실행 순서를 확인하기 위한 시점 출력
		Scene scene = new Scene(root);
		System.out.println("실행 시점 3");  // 실행 순서를 확인하기 위한 시점 출력
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
