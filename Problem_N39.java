/* 
    1    
    8     27 
    64    125    216
*/
public class Problem_N39 {

    public static void main(String[] args){

        int num = 1;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                if(num < 3)
                    System.out.print((num * num * num ) + "    ");
                else
                    System.out.print((num * num * num ) + "   ");
                
                num++;
            }
            System.out.println("");
        }
    }

    
}
