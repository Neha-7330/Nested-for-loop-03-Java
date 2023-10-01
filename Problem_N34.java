/* 
    3C   3C   3C   3C
    3C   3C   3C
    3C   3C   
    3C   

*/
public class Problem_N34 {
    public static void main(String[] args){

        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("3C   ");
            }
            System.out.println("");
        }
    }
}
