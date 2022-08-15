public class Reverse {
    public static void main(String[] args) {
        int x = 4321;
        int res =0;
        while(x != 0){
            int a = x%10;
            res= res*10 + a;
            x/=10;
        }
        System.out.println(res);
    }
}
