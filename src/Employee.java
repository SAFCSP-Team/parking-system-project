import java.util.*;

class Employee {
    String name;
    int id;
    String vehicle;

    public Employee(String name, int id, String vehicle) {
        this.name = name;
        this.id = id;
        this.vehicle = vehicle;
    }

    public String toString() {
        return "name: " + name + ", ID: " + id + ", vehicle: " + vehicle;
    }
}


