class Employee {
    String name;
    String id;
    String vehicle;

    Employee(String name, String id, String vehicle) {
        this.name = name;
        this.id = id;
        this.vehicle = vehicle;
    }

    public String toString() {
        return "Name: " + name + ",ID: " + id + ",Vehicle: " + vehicle;
    }
}

public class ParkingSystem {
    static int ROWS = 10;
    static int COLS = 10;
    static Employee[][] parking = new Employee[ROWS][COLS];

    public static boolean allocate(Employee emp) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (parking[i][j] == null) {
                    parking[i][j] = emp;
                    System.out.println(emp.name + " parked at slot (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("No parking slots left!!");
        return false;
    }

    public static void deallocate(int row, int col) {
        if (isValidSlot(row, col) && parking[row][col] != null) {
            System.out.println("Slot (" + row + "," + col + ") clear for" + parking[row][col].name);
            parking[row][col] = null;
        } else {
            System.out.println("Slot (" + row + "," + col + ") is empty or invalid.");
        }
    }

    public static void reallocate(int fromRow,int fromCol,int toRow,int toCol) {
        if (!isValidSlot(fromRow, fromCol) || parking[fromRow][fromCol] == null) {
            System.out.println("No employee at source slot (" + fromRow + "," + fromCol + ")");
        } else if (!isValidSlot(toRow, toCol) || parking[toRow][toCol] != null) {
            System.out.println("Destination slot (" + toRow + "," + toCol + ")is invalid or occupied.");
        } else {
            parking[toRow][toCol] = parking[fromRow][fromCol];
            parking[fromRow][fromCol] = null;
            System.out.println("Moved to slot (" + toRow + "," + toCol + ")");
        }
    }

    public static void printAll() {
        System.out.println("\nCurrent parkings :");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (parking[i][j] != null) {
                    System.out.println("Slot (" + i + "," + j + "): " + parking[i][j]);
                }
            }
        }
    }

    public static boolean isFull() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (parking[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEmpty() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (parking[i][j] != null) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidSlot(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    public static void main(String[] args) {
        // Here i will addd 10 employees
        for (int i = 1; i <= 10; i++) {
            Employee emp = new Employee("Emp" + i, "ID" + i, "Car" + i);
            allocate(emp);
        }

        printAll();

        // here ill deallocate one employee's parking slot
        deallocate(0, 2);

        //  here ill reallocate the last employee to a new slot
        reallocate(0, 9, 1, 1);

        printAll();

        System.out.println("\nIs parking full? " + isFull());
        System.out.println("Is parking empty? " + isEmpty());
    }
}
