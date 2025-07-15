class ParkingSystem {
    private Employee[][] slots = new Employee[10][10]; 

    public void allocate(Employee employee) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (slots[i][j] == null) {
                    slots[i][j] = employee;
                    System.out.println("allocate " + employee.name + " to slot (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Parking is full!!!");
    }

    public void deallocate(int row, int col) {
        if (isValid(row, col) && slots[row][col] != null) {
            System.out.println("deallocated slot(" + row + "," + col + ") occupied by " + slots[row][col].name);
            slots[row][col] = null;
        } else {
            System.out.println("invalid or   empty slot at (" + row + "," + col + ")");
        }
    }

    public void reallocate(int fromRow, int fromCol, int toRow, int toCol) {
        if (!isValid(fromRow, fromCol) || slots[fromRow][fromCol] == null) {
            System.out.println("Reallocation failed: no employee at (" + fromRow + "," + fromCol + ")");
            return;
        }
        if (!isValid(toRow, toCol) || slots[toRow][toCol] != null) {
            System.out.println("Reallocation failed: target slot (" + toRow + "," + toCol + ") is invalid or occupied.");
            return;


        }
        Employee emp = slots[fromRow][fromCol];
        slots[toRow][toCol] = emp;
        slots[fromRow][fromCol] = null;
        System.out.println("reallocated " + emp.name + " from (" + fromRow + "," + fromCol + ") to (" + toRow + "," + toCol + ")");
    }

    public void printAll() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (slots[i][j] != null) {
                    System.out.println("Slot (" + i + "," + j + "): " + slots[i][j]);
                }
            }
        }
    }

    public boolean isFull() {
        for (Employee[] row : slots) {
            for (Employee emp : row) {
                if (emp == null) return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        for (Employee[] row : slots) {
            for (Employee emp : row) {
                if (emp != null) return false;
            }
        }
        return true;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < 10 && col >= 0 && col < 10;
    }
}
