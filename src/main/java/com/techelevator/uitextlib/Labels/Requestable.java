package com.techelevator.uitextlib.Labels;

import com.techelevator.uitextlib.ActionPackage;

public interface Requestable<T> {
	public String request();
	public ActionPackage<T> processRequest(String userInput);
}
