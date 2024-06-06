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

		Inventory inventory = new Inventory();




		VendingUI ui = new VendingUI(scanner);
//		ui.showMainMenu();
		MoneyBox change = new MoneyBox();


		StockFileReader loadingFile = new StockFileReader();


		while (true) {
			String userChoice = ui.showMainMenu();


			if (userChoice.equals("1")) {
				//display items
				for (Items in : inventory.retreiveList()){
					ui.displayItems(in);
				}




			} else if (userChoice.equals("2")) {
				// head to purchase menu
				double money = 0.00;


				while (true) {

					String purchaseChoice = ui.showPurchaseMenu();

					ui.displayMoney(money);


					if (purchaseChoice.equals("1")) {
						//feed money
						ui.askForDollarAmount();
						money = change.feedMoney();
//						ui.displayMoney(money);


					}
					else if (purchaseChoice.equals("2")) {
						// select product
						loadingFile.loadFile();




					}
					else if (purchaseChoice.equals("3")) {
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
