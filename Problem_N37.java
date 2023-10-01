/* 
    F
    E   F
    D   E   F
    C   D   E   F
    B   C   D   E   F
    A   B   C   D   E   F
*/
public class Problem_N37 {
    
    public static void main(String[] args){
        char ch1 = 'F';
        for(int i = 1; i <= 6; i++){
            char ch2 = ch1;
            for(int j = 1; j <= i; j++){
                System.out.print(ch2 + "   ");
                ch2++;
            }
            ch1--;
            System.out.println("");
        }
    }
}
