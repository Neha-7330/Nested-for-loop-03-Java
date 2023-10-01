/* 
    1   2   3   4
    4   5   6  
    6   7
    7
*/
public class Problem_N40 {

    public static void main(String[] args){

        int num = 0;
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print((++num) + "  ");
                
            }
            num--;
            System.out.println("");
        }
    }
}
