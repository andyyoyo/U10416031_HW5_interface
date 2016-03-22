//U10416031 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class BeanGame extends Application{

	public void start(Stage primaryStage) {
		//create a pane
		Pane p = new Pane();
		
		//add the line which is outside the pane
		Line upl1 = new Line(175,40,175,50);
		Line upr1 = new Line(225,40,225,50);
		Line ll = new Line(175,50,105,210);
		Line rl = new Line(225,50,305,210);
		Line dl = new Line(105,210,105,240);
		Line dr = new Line(305,210,305,240);
		Line d = new Line(105,240,305,240);
	
		//add all to the getChildren
		p.getChildren().add(upl1);
		p.getChildren().add(upr1);
		p.getChildren().add(ll);
		p.getChildren().add(rl);
		p.getChildren().add(dl);
		p.getChildren().add(dr);
		p.getChildren().add(d);
		
		//add the buttom line
		Line[] line = new Line[8];
		for(int i =1;i<=7;i++){
			
			line [i] = new Line(105+25*i,210,105+25*i,240);
			p.getChildren().add(line[i]);
		}
		
		Scene scene = new Scene(p);
		primaryStage.setTitle("Bean game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main (String[] args){
		launch(args);
	}
	
}

