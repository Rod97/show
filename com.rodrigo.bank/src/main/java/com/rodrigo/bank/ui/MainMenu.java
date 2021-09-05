package com.rodrigo.bank.ui;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.rodrigo.bank.model.BankUser;

public class MainMenu implements Menu {
	
	@Override
	public void display() throws StreamWriteException, DatabindException, IOException {
		BankUser user = new BankUser();
		File file = new File("./boooob.txt");
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		
		System.out.println("Welcome, enter your name");
		user.setName(Menu.sc.nextLine());
		System.out.println("Enter your password");
		user.setPassword(Menu.sc.nextLine());
		
		writer.writeValue(file, user);
	}

}
