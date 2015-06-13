public class GGT{
    public static int calc(int a, int b){
        if (b == 0) return a;
        return calc(b, a % b);
    }        
}