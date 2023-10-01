/*
    10   10   10   10
    11   11   11
    12   12
    13
*/
public class Problem_N35 {
    public static void main(String[] args){

        int num = 10;
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(num + "   ");
            }
            num++;
            System.out.println("");
        }
    }
}
