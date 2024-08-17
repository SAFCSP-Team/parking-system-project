public class ParkingSystem {
  Employee[][] parking = new Employee[10][10];
  int row = 10;
  int col = 10;
 


  public boolean isEmpty(){
      for(int i = 0; i < row; i++){
          for(int j = 0; j < col; j++){
              if(this.parking[i][j] != null){
                  return false;
              }
          }
         }
         return true;
      }
  
  public boolean isFull(){
      for(int i = 0; i < row; i++){
          for(int j = 0; j < col; j++){
              if(this.parking[i][j] == null){
                  return false;
              }
          }
         }
         return true;
      }
  


  public void allocate(String employeeName, String employeeVechile ,int employeeId){
      if(isFull()){
          System.out.println("the parking lot is full");
      }else{
      if (isEmpty()){
          this.parking[0][0] = new Employee(employeeName, employeeVechile, employeeId);
      }else{

     for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
          if(this.parking[i][j] == null){
              this.parking[i][j] = new Employee(employeeName, employeeVechile, employeeId);
              return;
          }
      }
     }
  }
  

  }}

  public void deallocate(int row, int col){
      if(isEmpty()){
          System.out.println("there is nothing to delete");
      }else{
        System.out.println(this.parking[row][col].employeeName + " was removed");
          this.parking[row][col] = null;
      }
  }

  public void reallocate(int currentRow, int currentCols, int newRow, int newCol){
      if(this.parking[newRow][newCol] == null){
          Employee s = this.parking[currentRow][currentCols];
          this.parking[currentRow][currentCols] = null;
          this.parking[newRow][newCol] = s;
      }
  }

  public void printAll(){
      for(int i = 0; i < row; i++){
          for(int j = 0; j < col; j++){
             if(this.parking[i][j] != null){
              System.out.println("employee name: " + this.parking[i][j].employeeName +" employee vechile: " + this.parking[i][j].employeeVechile+ " employee id: "+ this.parking[i][j].employeeId);
              
             }}}
          
  }    public static void main(String[] args) {
    ParkingSystem obj = new ParkingSystem();
    obj.allocate("khalid" , "bmw m5 comption", 1234);
    obj.allocate("fahad" , "lamborgini urus", 5678);
    obj.allocate("abdulmalik", "merceades amg 63", 8910);
    obj.allocate("Nora", "bently bentaga", 1234);
    obj.allocate("lama", "bently fliying spur", 2342);
    obj.allocate("lamya", "bently azure", 0234);
    obj.allocate("abdullah", "s class", 9374);
    obj.allocate("sari", "mr bean mini copper", 8384);
    obj.allocate("aljowhra", "porche 911 pink", 9293);
    obj.allocate("sarah", "gmc black 2006", 8738);

    obj.printAll();
    obj.deallocate(0,0);
    obj.reallocate(0, 8, 0, 0);
    System.out.println("-------");
    obj.printAll();


}
}