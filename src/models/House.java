package models;

@SuppressWarnings("ALL")
public class House {
    int id;
    String houseName;
    String houseLocation;
    int numberOfBedrooms, numberOfKitchens, numberOfBathrooms, numberOfSittingRooms, numberOfGarage, housePrice;
    Boolean isSwimmingPoolAvailable;



    public House(int id, String houseName, String houseLocation, int housePrice, int numberOfBedrooms, int numberOfKitchens, int numberOfBathrooms, int numberOfSittingRooms, int numberOfGarage, Boolean isSwimmingPoolAvailable) {
        this.id = id;
        this.houseName = houseName;
        this.houseLocation = houseLocation;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfKitchens = numberOfKitchens;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfSittingRooms = numberOfSittingRooms;
        this.numberOfGarage = numberOfGarage;
        this.isSwimmingPoolAvailable = isSwimmingPoolAvailable;
        this.housePrice = housePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfGarage() {
        return numberOfGarage;
    }

    public void setNumberOfGarage(int numberOfGarage) {
        this.numberOfGarage = numberOfGarage;
    }

    public Boolean getSwimmingPoolAvailable() {
        return isSwimmingPoolAvailable;
    }

    public void setSwimmingPoolAvailable(Boolean swimmingPoolAvailable) {
        isSwimmingPoolAvailable = swimmingPoolAvailable;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }
}
