package utils;

import models.House;

import java.util.ArrayList;
import java.util.List;

public class HouseUtil {

    public static House[] getHouses(){

        House[] housesArray = new House[]{
                new House(1, "Tarila's House", "Akenfa", 1000000,2,
                        1, 1, 2,
                        3, true),
                new House(2, "Ephraim's House", "Yenegwe", 1000000,6,
                        4, 5, 4, 5,
                        false)
        };
        return housesArray;
    }

    public static List<House> getHouseList(){
        List<House> houses = new ArrayList<>();
        houses.add(new House(1, "Tarila's House", "Akenfa", 3000000,2,
                1, 1, 2,
                3, true));
        houses.add(new House(2, "Ephraim's House", "Yenegwe", 10000000,6,
                4, 5, 4, 5,
                false));
        houses.add(new House(3, "Mr. Success' House", "Opolo", 5000000, 6,
                4, 5, 4, 5,
                false));
        houses.add(new House(4, "Mr Dubem's House", "Edepie", 9000000, 6,
                4, 5, 4, 5,
                false));
        houses.add(new House(5, "Mr. John's House", "Okutukutu", 2550000,6,
                4, 5, 4, 5,
                false));
        return houses;
    }

    public static House getSingleHouse(List<House> houseList, int houseId){
        House singleHouse;
        singleHouse = houseList.get(houseId);
        return singleHouse;
    }
}
