package com.techelevator;

import com.sun.source.tree.UsesTree;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Application {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		Application application = new Application();
		application.run();
	}



	public void run() throws FileNotFoundException {

		Inventory inventory = new Inventory();
		List<Items> stockList = inventory.retreiveList();
		logWriter writer = new logWriter();
		salesTracker tracker = new salesTracker();
		salesWriter salesWriter = new salesWriter();



		VendingUI ui = new VendingUI(scanner);
//		ui.showMainMenu();
		MoneyBox change = new MoneyBox();


		StockFileReader loadingFile = new StockFileReader();


		while (true) {
			String userChoice = ui.showMainMenu();


			if (userChoice.equals("1")) {
				//display items
				for (Items in : stockList){
					ui.displayItems(in);
				}




			} else if (userChoice.equals("2")) {
				// head to purchase menu
				//double money = 0.00;


				while (true) {

					String purchaseChoice = ui.showPurchaseMenu();

					//ui.displayMoney(money);


					if (purchaseChoice.equals("1")) {
						//feed money
						ui.askForDollarAmount();
						Double money = change.feedMoney();
						ui.displayMoney(money);
						writer.writeToLog("FEED MONEY", "", money, change.getMachineMoneyBalance());


					}
					else if (purchaseChoice.equals("2")) {
						// select product
						for (Items in : stockList){

								ui.displayItems(in);
						}
						String askSlot = ui.askForSlotID();
						String askQuantity = ui.askForQuantity();

						for(Items in: stockList) {
							if (in.getSlot().equalsIgnoreCase(askSlot)) {


//								in.toString();

								if (inventory.isQuantityMoreThenZero(in) && inventory.isThereEnoughMoney(change.machineMoneyBalance)){

									if (inventory.validPurchase(in.getQuantity(), Integer.parseInt(askQuantity))){
										Double sum = in.getPrice() * Double.parseDouble(askQuantity);
										if (change.takeAwayMoney(sum) > 0){
											in.setQuantity(in.getQuantity() - Integer.parseInt(askQuantity));
											change.takeAwayMoney(sum);
											ui.displayMoney(change.machineMoneyBalance);
											ui.displaySnacksPriceType(in);
											ui.displayQuantity(in.getQuantity());
											ui.despensedItem(in);
											tracker.addPoduct(in);
											writer.writeToLog(in.getName(), in.getSlot(), change.takeAwayMoney(sum), change.machineMoneyBalance);
											salesWriter.writeToLog(tracker.getProduct(), tracker.getCountProduct());
										} else {
											ui.notenoughMoneError();
										}







									} else {
										ui.noquant();
									}








								} else {
									for (Items its : stockList){
										ui.displayItems(its);
									}
								}
								}

							}


					}
					else if (purchaseChoice.equals("3")) {
						// finished transaction
						if(change.machineMoneyBalance > 0 ){
							change.spitChange(change.machineMoneyBalance);
							ui.changeString(change.spitChange(change.machineMoneyBalance));
							writer.writeToLog("FEED MONEY", "", change.getMachineMoneyBalance(), 0);
							change.machineMoneyBalance = 0;

							break;



						}
						else{
							ui.notenoughMoneError();
						}

					}

				}

			} else if (userChoice.equals("3")) {
				break;
				// exit
			} else if (userChoice.equals("4")){


			}





		}
	}
}
