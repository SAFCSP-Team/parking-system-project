# Parking System Project

### Objective
Using fundamental data structures and algorithms, solve real-world problems with arrays.

### Problem
A software development company has space for 100 cars, and the manager wants to create a **Parking System** to assign each employee their own parking slot. The system allows to perform various operations such as `allocation()``, `deallocation()`, `reallocation()`, `printParkingList()`, `isFull()`, and `isEmpty()`.

> Each employee has a name, id, and vehicle.   
 
  

### Implementation
- Create a `Parking` 2D array that can accommodate 100 vehicles.
- Write a function called `allocation()` to find the first available slot in the parking and add the employee.
- Write a function `deallocation()` that takes the row and column parameters to identify the slot that needs to be removed. If the slot is valid and occupied, the function removes the employee information and prints a message indicating that the slot is now empty.
- Write a function `reallocation()` that takes the current slot and the new slot parameters. The function updates the position of the employee from the current slot to the new slot if the slot is valid and not occupied.
- Write a function `printParkingList()` to display the employee information currently stored in the parking system. 
- Write a function `isFull()` to determine if all the parking slots are currently filled.
- Write a function `isEmpty()` to determine if all the parking slots are empty.
- In the main method:
  - Add 10 employee cars.
  - Display all parked slot information.
  - Delete one employee's parking slot.
  - Update the parking slot of the last employee.
  - Display all parked slot information after deletion and update.

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
- [ ] Completely define the `Employee` class.
- [ ] Completely define  the `ParkingSystem` class.
