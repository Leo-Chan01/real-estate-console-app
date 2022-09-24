import models.House;
import utils.HouseUtil;
import utils.MessageUtil;
import utils.OrderUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner selectUserType = new Scanner(System.in);
        String userType;
        List<House> houseList = HouseUtil.getHouseList();

        MessageUtil.messenger("Hello, Welcome \n");
        MessageUtil.messenger("Are you a seller or Buyer [B-Buyer/S-Seller]");

        userType = selectUserType.nextLine().toUpperCase();

        if (!userType.equals("")){
            if (userType.equals("B")){
                OrderUtil.performHouseBuyingTransactions();
            } else if (userType.equals("S")) {
                OrderUtil.performHouseListing(houseList);
            }else {
                MessageUtil.messenger("Wrong Input, please select one option above");
                OrderUtil.performHouseListing(houseList);
            }
        }else {
            MessageUtil.messenger("Cannot have empty string. Exiting...");
        }
    }
}