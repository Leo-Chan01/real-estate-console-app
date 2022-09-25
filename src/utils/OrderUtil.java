package utils;

import models.House;

import java.util.List;
import java.util.Scanner;

public class OrderUtil {
    public static void performHouseBuyingTransactions(List<House> houseList) {
        MessageUtil.writeInstruction("Pick a House below, by it's House Number");
        HouseUtil.displayInitializedStoredHouses(houseList);
        Scanner selectHouse = new Scanner(System.in);
        Scanner makeDecision = new Scanner(System.in);
        int selection = selectHouse.nextInt();
        House selectedHouse = HouseUtil.getSingleHouse(houseList, selection-1);
        String houseName = selectedHouse.getHouseName();
        int housePrice = selectedHouse.getHousePrice();
        System.out.println("You selected " + houseName + " which costs: NGN " + housePrice
                + ". Do you want to continue? [Y/N]");
        String userDecision = makeDecision.nextLine().toUpperCase();

        if (!userDecision.equals("")){
            if (userDecision.equals("Y")){
                MessageUtil.giveUserFeedback(selectedHouse.getHouseName(), selectedHouse.getHousePrice(), false);
            } else if (userDecision.equals("N")) {

                MessageUtil.messenger("Thank you for your patronage");
            }else{
                MessageUtil.messenger("Wrong input, please selected a House again: ");
                performHouseBuyingTransactions(houseList);
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
        houseName = takeName.nextLine();
        MessageUtil.writeInstruction("Input house location: ");
        houseLocation = takeHouseLocation.nextLine();
        MessageUtil.writeInstruction("Input number of Bedrooms: ");
        numberOfBedrooms = Integer.parseInt(takeNumberOfBedrooms.nextLine());
        MessageUtil.writeInstruction("Input house price: ");
        housePrice = Integer.parseInt(takeHousePrice.nextLine());
        MessageUtil.writeInstruction("Input number of Kitchens: ");
        numberOfKitchens = Integer.parseInt(takeNumberOfKitchens.nextLine());
        MessageUtil.writeInstruction("Input number of Bathrooms: ");
        numberOfBathrooms = Integer.parseInt(takeNumberOfBathrooms.nextLine());
        MessageUtil.writeInstruction("Input number of Sitting Rooms: ");
        numberOfSittingRooms = Integer.parseInt(takeNumberOfSittingRooms.nextLine());
        MessageUtil.writeInstruction("Input number of Garage: ");
        numberOfGarage = Integer.parseInt(takeNumberOfGarage.nextLine());
        MessageUtil.writeInstruction("Is there swimming pool? [Y/N]: ");
        isSwimmingPoolAvailable = takeSwimmingPoolAvailability.nextLine().equalsIgnoreCase("Y");
        id = HouseUtil.getHouseList().size();

        try {
            houseList.add(new House(id+1, houseName, houseLocation, housePrice,
                    numberOfBedrooms, numberOfKitchens, numberOfBathrooms, numberOfSittingRooms, numberOfGarage,
                    isSwimmingPoolAvailable));
            House currentHouse = HouseUtil.getSingleHouse(houseList, id);
            MessageUtil.giveUserFeedback(currentHouse.getHouseName(), currentHouse.getHousePrice(), true);
            for (House house :
                    houseList) {
                System.out.println(house.getHouseName());
            }
            MessageUtil.messenger("Want to list another house? [Y/N]");
            boolean isNotLastListing = takeDecision.next().equalsIgnoreCase("Y");
            if (isNotLastListing) {
                OrderUtil.performHouseListing(houseList);
            } else {
                OrderUtil.checkNextDecision(houseList, takeDecision);
            }
        }catch (IndexOutOfBoundsException e){
            MessageUtil.messenger("Could Not add House " + e);
        }
    }

    private static void checkNextDecision(List<House> houseList, Scanner takeDecision) {
        MessageUtil.messenger("Want to perform another transaction? [Y/N]");
        boolean isNotLastTransaction = takeDecision.next().equalsIgnoreCase("Y");
        if (isNotLastTransaction){
            MessageUtil.messenger("Choose B-Buy or S-Sell");
            boolean isBuying = takeDecision.next().equalsIgnoreCase("B");
            if (isBuying){
                OrderUtil.performHouseBuyingTransactions(houseList);
            }else {
                OrderUtil.performHouseListing(houseList);
            }
        }else {
            MessageUtil.messenger("Thank you for your business! See you later!");
        }
    }
}
