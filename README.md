# Parking System Project

### Objective
Using fundamental data structures and algorithms to solve real-world problems with arrays.

### Problem
The software development company has space for 100 cars, and the manager wants to create a `parking system` to assign each employee their own parking spot. The system allows to perform various operations such as **parkingAllocation()**, **parkingDeallocation()**, **parkingReallocation()**, **printParkingList()**, **isFull()**, and **isEmpty()**.

> Each employee has a name, ID, and Vehicle.   
 
  

### Implementation
- Create a `Parking` 2D array that can accommodate 100 vehicles.
- Write a function `allocation()` for finding the first available slot in the parking and adding the employee.
- Write a function `deallocation()` that takes the row and column parameters to identify the slot that needs to be removed. If the slot is valid and occupied, the function removes the employee information and prints a message indicating that the slot is now empty.
- Write a function `reallocation()` that takes the current slot and the new slot parameters. The function updates the position of the employee from the current slot to the new slot if the slot is valid and not occupied.
- Write a function `printParkingList()` to display the employee information currently stored in the parking system. 
- Write a function `isFull()` to determine if all the parking slots are currently filled.
- Write a function `isEmpty()` to determine if all the parking slots are empty.
- In the main method:
  - Add 10 employee cars.
  - Display all parked information.
  - Delete one employee's parking spot.
  - Update the parking spot of the last employee.
  - Display all parked information after deletion and update.

``` java
public class ParkingSystem {
    public static void main(String[] args) {
      /* add your code here */
    }

}
```
### Qualification to pass
- [ ] The code should run successfully.
- [ ] Write all required functions correctly.
- [ ] Completely define the employee class.
- [ ] Completely define  ParkingSystem class.
