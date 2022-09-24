import utils.HouseUtil;
import utils.MessageUtil;
import utils.OrderUtil;

public class Main {
    public static void main(String[] args) {
        MessageUtil.messenger("Hello, Welcome");
        MessageUtil.writeInstruction("Pick a House Below, by it's House Number");
        HouseUtil.displayInitializedStoredHouses();
        OrderUtil.performHouseSale();
//        for (int index = 0; index < houses.length; index++){
//            System.out.println(houses[index].getId() +". "+ houses[index].getHouseName() + "\n"
//                    + "Number of Bathrooms: " + houses[index].getNumberOfBathrooms());
//        }
//        System.out.println("Single House is having id of: " + HouseUtil.getSingleHouse(HouseUtil.getHouseList(), houseId).getHouseName());
    }
}