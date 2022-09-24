package utils;

import models.House;

public class HouseUtil {

    public static House[] getHouses(){
        return new House[]{
                new House(1, "Tarila's House", "Akenfa", 2,
                1, 1, 2,
                3, true),
                new House(2, "Ephraim's House", "Yenegwe", 6,
                        4, 5, 4, 5,
                        false)
        };
    }
}
