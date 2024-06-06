package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		Application application = new Application();
		application.run();
	}



	public void run() throws FileNotFoundException {

		VendingUI ui = new VendingUI(scanner);
//		ui.showMainMenu();
		PurchaseMenu purchaseMenu = new PurchaseMenu(scanner);
		Change change = new Change();


		StockFileReader loadingFile = new StockFileReader();


		while (true) {
			String userChoice = ui.showMainMenu();


			if (userChoice.equals("1")) {
				//display items
				loadingFile.loadFile();


			} else if (userChoice.equals("2")) {
				// head to purchase menu

				while (true) {
//					purchaseMenu.showPurchaseMenu();



					String purchaseChoice = purchaseMenu.showPurchaseMenu();

					if (purchaseChoice.equals("1")) {
						//feed money
						change.eatingMoney();


					} else if (purchaseChoice.equals("2")) {
						// select product
						loadingFile.loadFile();
						System.out.println("please select one of the follow slots");

					} else if (purchaseChoice.equals("3")) {
						// finished transaction

					}


				}



			} else if (userChoice.equals("3")) {
				break;
				// exit
//		} else if (userChoice.equals("4")) {
//
//		}
			}


			//do amazing stuff here!


		}
	}
}
