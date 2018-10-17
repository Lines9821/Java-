package demo;
/*
public class MethodDemo {
    public static void main(String[] args) {
        printRect();
    }
    public static void printRect(){
        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
*/



/*
import java.util.Scanner;
public class MethodDemo{
    public static void main(String[] args) {
        //int num=getNumber();
        //System.out.println(num);
        System.out.println(getNumber());
    }
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
}
*/



/*
import java.util.Scanner;
public class MethodDemo{
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner x =  new Scanner(System.in);
        int m = x.nextInt();
        System.out.println("请输入列数：");
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();
        printRect_1(m,n);

    }
    public static void printRect_1(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
*/

import java.util.Scanner;
public class MethodDemo{
    public static void main(String[] args) {
        System.out.println("请输入三个数：");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        Scanner z = new Scanner(System.in);
        int c = z.nextInt();
        double ave = getAverage(a,b,c);
        System.out.println("他们的平均数是："+ave);
    }
  public static double getAverage(double a,double b,double c) {
       return (a+b+c)/3;
    }
}
