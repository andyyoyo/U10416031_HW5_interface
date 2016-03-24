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

		//add the balls in the pane
		Circle cir = new Circle(200,50,2);
		cir.setStroke(Color.GREEN);
		
		p.getChildren().add(cir);
		Circle[] cir1 = new Circle[2];
		for(int i=0;i<2;i++){
			cir1[i] = new Circle(188.5+25*i,75,2);
			cir1[i].setStroke(Color.GREEN);
			p.getChildren().add(cir1[i]);
		}
		Circle[] cir2 = new Circle[3];
		for(int i=0;i<3;i++){
			cir2[i] = new Circle(177+25*i,100,2);
			cir2[i].setStroke(Color.GREEN);
			p.getChildren().add(cir2[i]);
		}
		Circle[] cir3 = new Circle[4];
		for(int i=0;i<4;i++){
			cir3[i] = new Circle(165.5+25*i,125,2);
			cir3[i].setStroke(Color.GREEN);
			p.getChildren().add(cir3[i]);
		}
		Circle[] cir4= new Circle[5];
		for(int i=0;i<5;i++){
			cir4[i] = new Circle(154+25*i,150,2);
			cir4[i].setStroke(Color.GREEN);
			p.getChildren().add(cir4[i]);
		}
		Circle[] cir5 = new Circle[6];
		for(int i=0;i<6;i++){
			cir5[i] = new Circle(142.5+25*i,175,2);
			cir5[i].setStroke(Color.GREEN);
			p.getChildren().add(cir5[i]);
		}
		Circle[] cir6 = new Circle[7];
		for(int i=0;i<7;i++){
			cir6[i] = new Circle(131+25*i,200,2);
			cir6[i].setStroke(Color.GREEN);
			p.getChildren().add(cir6[i]);
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

