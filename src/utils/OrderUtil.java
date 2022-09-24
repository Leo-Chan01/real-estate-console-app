package utils;

import models.House;

import java.util.Scanner;

public class OrderUtil {
    public static void performHouseSale() {
        Scanner selectHouse = new Scanner(System.in);
        Scanner makeDecision = new Scanner(System.in);
        int selection = selectHouse.nextInt();
        House selectedHouse = HouseUtil.getSingleHouse(HouseUtil.getHouseList(), selection-1);
        String houseName = selectedHouse.getHouseName();
        int housePrice = selectedHouse.getHousePrice();

        System.out.println("You selected " + houseName + " which costs: NGN " + housePrice + ". Do you want to continue? [Y/N]");
        String userDecision = makeDecision.nextLine().toUpperCase();

        if (!userDecision.equals("")){
            if (userDecision.equals("Y")){
                MessageUtil.giveUserFeedback(selectedHouse.getHouseName(), selectedHouse.getHousePrice());
            } else if (userDecision.equals("N")) {
                MessageUtil.messenger("Thank you for your patronage");
            }else{
                MessageUtil.messenger("Wrong input, please selected a House again: ");
                performHouseSale();
            }
            makeDecision.close();
        }
    }
}
