package com.mygame.main;
import com.mygame.view.*;
import com.mygame.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameView view = new GameView();
		GameService service = new GameService();
		String name[] = view.displayCityNamesWithBlanks();
		for(int i=0;i<=4 ; i++);
		System.out.println(name[i]);
	}

}
