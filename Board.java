public class Board {
    /*
        Key for Index/Position on board
        0|1|2
        3|4|5
        6|7|8
    */
    
    Space[] values = new Space[9];
    
    public Board(){
        for(int i = 0; i < 9; i++){
            values[i] = new Space();
        }
        //Top left
        values[0].right = values[1];
        values[0].downRight = values[4];
        values[0].down = values[3];
        
        //Top
        values[1].left = values[0];
        values[1].downLeft = values[3];
        values[1].down = values[4];
        values[1].downRight = values[5];
        values[1].right = values[2];
        
        //Top Right
        values[2].left = values[1];
        values[2].downLeft = values[4];
        values[2].down = values[5];
        
        //Left
        values[3].up = values[0];
        values[3].upRight = values[1];
        values[3].right = values[4];
        values[3].downRight = values[7];
        values[3].down = values[6];
        
        //Middle
        values[4].up = values[1];
        values[4].upRight = values[2];
        values[4].right = values[5];
        values[4].downRight = values[8];
        values[4].down = values[7];
        values[4].downLeft = values[6];
        values[4].left = values[3];
        values[4].upLeft = values[0];
        
        //Right
        values[5].up = values[2];
        values[5].down = values[8];
        values[5].downLeft = values[7];
        values[5].left = values[4];
        values[5].upLeft = values[1];
        
        //Bottom Left
        values[6].up = values[3];
        values[6].upRight = values[4];
        values[6].right = values[7];
        
        //Bottom
        values[7].up = values[4];
        values[7].upRight = values[5];
        values[7].right = values[8];
        values[7].left = values[6];
        values[7].upLeft = values[3];
        
        //Bottom Right
        values[8].up = values[5];
        values[8].left = values[7];
        values[8].upLeft = values[4];
    }
    
    //Easy retrieval of spaces
    //Enter which space you'd like according to the key
    /*
        Key for Index/Position on board
        0|1|2
        3|4|5
        6|7|8
    */
    public char getSpace(int i){
        return values[i].getValue();
    }
    
    //For setting spaces
    //Enter index of space you'd like to change
    //Followed by the char you're assigning
    public void setSpace(int i, char n){
        values[i].setValue(n);
    }
    
    
    
    //I = position in the board
    //P = position relative
    
    //Board Index Key
    /*0|1|2
      3|4|5
      6|7|8*/
    
    //Pointers Index Key
    /*0|1|2
      3| |4
      5|6|7*/
    public Space getPointer(int i, int p){
        return values[i].pointers[p];
    }
    

    //Prints the board
    public void printBoard(){
        String holder = "";
        for(int i = 0; i < 9; i++){
            holder += values[i].getValue();
            if(i != 2 && i != 5 && i != 8){
                holder += "|";
            }
            else{
                holder += "\n";
            }
        }
        System.out.println(holder);
    }
}