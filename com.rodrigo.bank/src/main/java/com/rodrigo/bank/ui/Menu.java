package com.rodrigo.bank.ui;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;

public interface Menu {
	
	Scanner sc = new Scanner(System.in);
	
	void display() throws StreamWriteException, DatabindException, IOException;
}
