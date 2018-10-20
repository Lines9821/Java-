package demo;
import java.util.Scanner;
public class LCM {
    //求解最大公约数
    public static int getGcd(int m,int n){
        while(n > 0){
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    //求解数m和n和最小公倍数
    public static int getLcm(int m,int n){
        int gcd = getGcd(m,n);
        int result = m*n / gcd;
        return result;
    }

    public static void main(String[] args){
        int r;
        System.out.println("请输入两个数:");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        System.out.print("两个数的最小公倍数是：");
        System.out.println(r = getLcm(m,n));
    }
}