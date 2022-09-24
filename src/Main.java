import com.sun.management.OperatingSystemMXBean;
import models.House;
import utils.HouseUtil;
import utils.MessageUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner selectHouse = new Scanner(System.in);
        Scanner makeDecision = new Scanner(System.in);
        Boolean isBuying;
        int houseNumber;
        int houseId = 3;

        MessageUtil.messenger("Hello, Welcome");
        MessageUtil.writeInstruction("Pick a House Below, by it's House Number");
//        House[] houses = HouseUtil.getHouses();

        for (House currentHouse: HouseUtil.getHouseList()) {
            System.out.println(currentHouse.getId() + ". " + currentHouse.getHouseName() +" ("+ currentHouse.getHousePrice() + ")");
        }

        int selection = selectHouse.nextInt();
        House selectedHouse = HouseUtil.getSingleHouse(HouseUtil.getHouseList(), selection-1);
//        selectHouse.close();

        String houseName = selectedHouse.getHouseName();
        int housePrice = selectedHouse.getHousePrice();
        System.out.println("You selected " + houseName + " which costs: NGN " + housePrice + ". Do you want to continue? [Y/N]");
//        makeDecision.next();
        String userDecision = makeDecision.nextLine().toUpperCase();
        if (!userDecision.equals("")){
            if (userDecision.equals("Y")){
                MessageUtil.giveUserFeedback(selectedHouse.getHouseName(), selectedHouse.getHousePrice());
//                makeDecision.close();
            } else if (userDecision.equals("N")) {
                MessageUtil.messenger("Thank you for your patronage");
//                makeDecision.close();
            }else{
                MessageUtil.messenger("Wrong input");
//                makeDecision.close();
            }

            makeDecision.close();
        }

//        for (int index = 0; index < houses.length; index++){
//            System.out.println(houses[index].getId() +". "+ houses[index].getHouseName() + "\n"
//                    + "Number of Bathrooms: " + houses[index].getNumberOfBathrooms());
//        }
//        System.out.println("Single House is having id of: " + HouseUtil.getSingleHouse(HouseUtil.getHouseList(), houseId).getHouseName());
    }
}