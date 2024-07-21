public class PowerOfTwo_231 {
    public static boolean powerOfTwo(int n){
        int i = 1;

        while(i < n){
            i = i * 2;
        }

        if( i == n){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(powerOfTwo(n));
    }
}
