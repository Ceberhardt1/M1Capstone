package com.techelevator;

import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		Application application = new Application();
		application.run();
	}

	public void run() throws FileNotFoundException {

		StockFileReader loadingFile = new StockFileReader();
		loadingFile.loadFile();

	}
}
