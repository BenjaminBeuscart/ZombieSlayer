package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import entities.Enemy;
import entities.Player;
import entities.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		List<Enemy> enemies = new ArrayList<Enemy>();
        for (int i = 0; i < 2; i++) {
            enemies.add(new Enemy(1, "enemy" + i, 5));
        }
        Player playerBen = new Player(0,"Ben", 5);
        playerBen.setCurrentWeapon(new Weapon(0, "Classic sword", 3, 0.95));

        for (Enemy i : enemies) {
            while (i.getHp() > 0) {
                playerBen.attack(i);
            }
        }
	}
}
