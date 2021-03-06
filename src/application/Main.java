package application;

import draw.MainScreen;
import game.GameMain;
import javafx.application.Application;
import javafx.stage.Stage;
import share.RenderableHolder;
import window.SceneManager;

public class Main extends Application {
	
	public static int gameState = 0;
	
	@Override
	public void start(Stage stage) {
		try {
			SceneManager.initialize(stage);
			SceneManager.goToMainMenu();
			stage.setTitle("Last Defense");
			stage.centerOnScreen();
	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void stop() {
		RenderableHolder.getInstance().stopAllSound();
		GameMain.stopGame();
		MainScreen.getTimer().stop();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}