# Real Estate Console Application
This is a consolse application that offers the interface for buying and selling properties

## User Journey

### Buyer

- Buyer is prompted to identify as either a buyer or seller
```txt
Hello, Welcome 

Are you a seller or Buyer [B-Buyer/S-Seller]
```
- User selects Buyer (B) and is presented with a list of already listed houses
```txt
Pick a House below, by it's House Number
1. Tarila's House (3000000)
2. Ephraim's House (10000000)
3. Mr. Success' House (5000000)
4. Mr Dubem's House (9000000)
5. Mr. John's House (2550000)
```
- Buyer selects any number, ```2``` for this example and is asked for confirmation of his decision
```txt
You selected Ephraim's House which costs: NGN 10000000. Do you want to continue? [Y/N]
```
- Buyer confirms order by pressing "Y"
```
You just Purchased Ephraim's House at NGN10000000
```
- If buyer rejects, it would say: 
```
Thanks for your patronage
```
and then exit


### Seller
- Seller is prompted to identify as either a buyer or seller
```txt
Hello, Welcome 

Are you a seller or Buyer [B-Buyer/S-Seller]
```
- Seller makes input as ```s``` for buyer and gets a few prompts that take in certain information that concern the house, afte which the house is listed once again to confirm to the user that the house has been listed
```
Please follow the prompt below to add your house
Input house name: 
My House
Input house location: 
The Location
Input number of Bedrooms: 
1
Input house price: 
1200000
Input number of Kitchens: 
1
Input number of Bathrooms: 
2
Input number of Sitting Rooms: 
1
Input number of Garage: 
1
Is there swimming pool? [Y/N]: 
y
You just Listed My House at NGN1200000
Tarila's House
Ephraim's House
Mr. Success' House
Mr Dubem's House
Mr. John's House
My House
```
- Seller is asked if he wants to continue or not

```
Want to list another house? [Y/N]
```
- If Continue it goes up to receive inputs again
- If Not continue, It asks if another transactions should be performed.
```
n
Want to perform another transaction? [Y/N]
```
- If the transaction should be performed it goes on and asks if the user is a buyer or seller basically repeating the whole process oer again

- If it shouldn't be performed, it exits and thanks the user

## Util Classes Usages
The util classes are incharge of everything that has to do with performing any transaction. They contain mostly static methods. this was used as an instance is not necessarily needed, to be created for each of the utility classes.

### HouseUtil.java
This includes worker static methods that perfomrm listing Houses and getting the currently selected house

#### List of Houses
To get the list of manually stored Houses, call
```java
HouseUtil.getHouseList();
```

#### Single House
```java
HouseUtil.getSingleHouse(houseList, selection-1);
```


# TO BE CONTINUED
### OrderUtil.java

### MessageUtil.java

### UserUtil.java


## Model Classes Usages

### House.java

### Order.java

### User.java

