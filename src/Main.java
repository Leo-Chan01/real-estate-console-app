import com.sun.management.OperatingSystemMXBean;
import models.House;
import utils.HouseUtil;
import utils.MessageUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner selectHouse = new Scanner(System.in);
        Scanner makeDecision = new Scanner(System.in);
        Boolean isBuying;
        int houseNumber;

        MessageUtil.sayWelcome("Hello, Welcome");
        MessageUtil.writeInstruction("Pick a House Below, by it's House Number");
        House[] houses = HouseUtil.getHouses();

        for (int index = 0; index < houses.length; index++){
            System.out.println(houses[index].getId() +". "+ houses[index].getHouseName() + "\n"
                    + "Number of Bathrooms: " + houses[index].getNumberOfBathrooms());
        }
    }
}