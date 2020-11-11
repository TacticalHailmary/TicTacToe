public class Space {
    //X or O
    private char value = ' ';
    
    //Pointers
    //Index key
    /*
    0|1|2
    3| |4
    5|6|7
    */
    Space upLeft = null;
    Space up = null;
    Space upRight = null;
    Space left = null;
    Space right = null;
    Space downLeft = null;
    Space down = null;
    Space downRight = null;
    Space[] pointers = new Space[]{upLeft, up, upRight, left, right, downLeft, down, downRight};
    
    public Space(){
    }
    
    //Getter and Setter
    public char getValue(){
        return value;
    }
    
    public void setValue(char n){
        if(n == 'X' || n == 'O'){
            value = n;
        }
    }
}