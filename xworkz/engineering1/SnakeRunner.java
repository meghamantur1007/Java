package com.xworkz.engineering1;
import com.xworkz.engineering.Snake;
public class SnakeRunner {

	public static void main(String[] args) {
		Snake snake=new Snake("Indian python",21,"Python molurus");
		Snake snake1=new Snake("Green anaconda",33,"semi-aquatic");
		Snake snake2=new Snake("King cobra",18,"Ophiophagus hannah");
		
		Snake[] ref=new Snake[3];
		  ref[0]=snake;
		  ref[1]=snake1;
		  ref[2]=snake2;

		  for(Snake values:ref) {
			 
			  values.print();
		  }
	}

}
