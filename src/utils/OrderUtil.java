package utils;

import models.House;

import java.util.List;
import java.util.Scanner;

public class OrderUtil {
    public static void performHouseBuyingTransactions() {
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
                MessageUtil.giveUserFeedback(selectedHouse.getHouseName(), selectedHouse.getHousePrice(), false);
            } else if (userDecision.equals("N")) {
                MessageUtil.messenger("Thank you for your patronage");
            }else{
                MessageUtil.messenger("Wrong input, please selected a House again: ");
                performHouseBuyingTransactions();
            }
            makeDecision.close();
        }
    }

    public static void performHouseListing(List<House> houseList) {
        int id;
        String houseName;
        String houseLocation;
        int numberOfBedrooms, numberOfKitchens, numberOfBathrooms, numberOfSittingRooms, numberOfGarage, housePrice;
        boolean isSwimmingPoolAvailable;
        Scanner takeName = new Scanner(System.in);
        Scanner takeHouseLocation = new Scanner(System.in);
        Scanner takeNumberOfBedrooms = new Scanner(System.in);
        Scanner takeNumberOfKitchens = new Scanner(System.in);
        Scanner takeNumberOfBathrooms = new Scanner(System.in);
        Scanner takeNumberOfSittingRooms = new Scanner(System.in);
        Scanner takeNumberOfGarage = new Scanner(System.in);
        Scanner takeHousePrice= new Scanner(System.in);
        Scanner takeSwimmingPoolAvailability = new Scanner(System.in);
        Scanner takeDecision = new Scanner(System.in);

        MessageUtil.messenger("Please follow the prompt below to add your house");
        MessageUtil.writeInstruction("Input house name: ");
        houseName = takeName.next();
        MessageUtil.writeInstruction("Input house location: ");
        houseLocation = takeHouseLocation.next();
        MessageUtil.writeInstruction("Input number of Bedrooms: ");
        numberOfBedrooms = Integer.parseInt(takeNumberOfBedrooms.next());
        MessageUtil.writeInstruction("Input house price: ");
        housePrice = Integer.parseInt(takeHousePrice.next());
        MessageUtil.writeInstruction("Input number of Kitchens: ");
        numberOfKitchens = Integer.parseInt(takeNumberOfKitchens.next());
        MessageUtil.writeInstruction("Input number of Bathrooms: ");
        numberOfBathrooms = Integer.parseInt(takeNumberOfBathrooms.next());
        MessageUtil.writeInstruction("Input number of Sitting Rooms: ");
        numberOfSittingRooms = Integer.parseInt(takeNumberOfSittingRooms.next());
        MessageUtil.writeInstruction("Input number of Garage: ");
        numberOfGarage = Integer.parseInt(takeNumberOfGarage.next());
        MessageUtil.writeInstruction("Is there swimming pool? [Y/N]: ");
        isSwimmingPoolAvailable = takeSwimmingPoolAvailability.next().equalsIgnoreCase("Y");
        id = HouseUtil.getHouseList().size();


        try {
//            List<House> housesList = houseUtil.getHousesList();
            houseList.add(new House(id, houseName, houseLocation, housePrice,
                    numberOfBedrooms, numberOfKitchens, numberOfBathrooms, numberOfSittingRooms, numberOfGarage,
                    isSwimmingPoolAvailable));
            House currentHouse = HouseUtil.getSingleHouse(houseList, id);
            MessageUtil.giveUserFeedback(currentHouse.getHouseName(), currentHouse.getHousePrice(), true);
            for (House house :
                    houseList) {
                System.out.println(house.getHouseName());
            }

            MessageUtil.messenger("Want to list another house? [Y/N]");
            boolean isNotLastTransaction = takeDecision.next().equalsIgnoreCase("Y");
            if (isNotLastTransaction) {
                OrderUtil.performHouseListing(houseList);
            } else {
                MessageUtil.messenger("Thank you for your business");
            }
        }catch (IndexOutOfBoundsException e){
            MessageUtil.messenger("Could Not add House " + e);
        }
    }
}
