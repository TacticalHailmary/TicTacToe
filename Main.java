public class Main {
    public static void main(String args[]) {
      Board test = new Board();
      
      //Sets top right and right to X and O respectively
      test.setSpace(2, 'X');
      test.setSpace(5, 'O');
      
      //Prints top right and right
      System.out.println(test.getSpace(2));
      System.out.println(test.getSpace(5));
      
      test.printBoard();
    }
}

