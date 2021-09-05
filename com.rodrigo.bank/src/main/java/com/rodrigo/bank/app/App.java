package com.rodrigo.bank.app;

import com.rodrigo.bank.ui.MainMenu;
import com.rodrigo.bank.ui.Menu;

public class App {

	public static void main(String[] args) {
		
		Menu main = new MainMenu();
		
		try {
			main.display();
		} catch (Exception e) {
			System.err.println("oops");
		}finally {
			System.out.println("end");
			System.out.println("end");
		}
	}

}
