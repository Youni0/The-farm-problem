public class Main {
    public static void main(String[] args) {
        System.out.println(legs(2,3,5));

    }
    public static int legs(int chicken, int cow, int pig){
        int sumoflegs = 0;
        sumoflegs=(chicken*2)+(cow*4)+(pig*4);
        return sumoflegs;
    }
}