import models.House;
import utils.HouseUtil;
import utils.MessageUtil;
import utils.OrderUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houseList = HouseUtil.getHouseList();
        MessageUtil.messenger("Hello, Welcome \n");
        OrderUtil.startTransaction(houseList);
    }
}