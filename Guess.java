package demo;
import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        String[] a = new String[3];
        a[0] = "石头";
        a[1] = "剪刀";
        a[2] = "布";
        System.out.println("选择石头，剪刀，布（输入‘退出’以退出）");
        while (j < 4) {
            Scanner s = new Scanner(System.in);
            String man = s.next();
            if (man.equals("石头") || man.equals("剪刀") || man.equals("布")) {
                String r = Compare(man, a);
                j++;
                if (r.equals("恭喜你，你赢了")) {
                    i++;
                    System.out.println("已赢局数："+i+"局");
                }
                if(i==2)
                    break;

            } else if(man.equals("退出")){
                break;
            }
            else{
                System.out.println("请重新输入");
            }
        }
        if(i==2){
            System.out.println("你赢得了比赛");
        }
        if(i!=2&&j!=1){
            System.out.println("输掉比赛请重新开局");
        }
        if(j==1){
            System.out.println("退出游戏");
        }
    }


    public static String Compare(String man,String[] a){
        String r="0";
            Random ran = new Random();
            int com = ran.nextInt(3);
            System.out.println(a[com]);
            if ((man .equals( "石头") && a[com] == "剪刀" )||( man.equals("剪刀")  && a[com] == "布") ||( man.equals("布") && a[com] == "石头")) {
                System.out.println(r="恭喜你，你赢了");
            }
            else if(man.equals(a[com])){
                System.out.println(r="是平局");
            }
            else{
                System.out.println(r="很遗憾，你输了");
            }
        return r;
    }
}