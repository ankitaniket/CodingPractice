public class IsPowTwo {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(isPowerOfTwo(n));
    }
    private static boolean isPowerOfTwo(int n) {
        int ans = 1;
        for (int i=0; i< 31;i++){
            if(ans == n)
                return true;

            if(ans < 999999999){
                ans *=2;
            }
        }
        return false;
    }
}
