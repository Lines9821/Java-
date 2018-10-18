package demo;

public class Monkey {
    public static void main(String[] args) {
        System.out.println("第一天桃子的数量为："+peach(1));

    }
    public static int peach(int day){
        {
            if (day == 7)
                return 1;
            else {
                return (peach(day+1)+1)*2;
            }
        }
    }
}
