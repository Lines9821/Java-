package demo;
/*
import java.util.Random;
public class CallName {
    public static void main(String[] args) {
        String name[]={"张蔚东","刘思洋","李思琦","刘月琛","李嘉宸","魏淑康","王雪宁","祁天一","张煜","万克林"};
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
       System.out.println("==========================");
    Random ran = new Random();
    int index = ran.nextInt(name.length);
    System.out.println(name[index]);
    }
}
*/



/*
   实现随机点名器
     1. 存储所有学生姓名
	 2. 预览所有学生姓名,遍历数组
	 3. 随机数作为索引,到数组中找元素

	将功能独立出来, 作成方法,调用方法即可

	定义三个功能, 用到同一个姓名数据
	姓名存储到数组中,三个方法,使用一个数组中的数据, 方法传递参数
*/

/*
import java.util.Random;
public class CallName{
    public static void main(String[] args){
        //定义数组,存储学生姓名
        String[] names = new String[8];
        //调用添加姓名方法
        addStudent(names);
        //调用遍历数组方法
        printStudentName(names);
        //调用随机姓名的方法
        String name = randomStudentName(names);
        System.out.println(name);
    }

    public static String randomStudentName(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        return names[index];
    }

    public static void printStudentName(String[] names){
        for(int i = 0 ; i < names.length ;i++){
            System.out.println(names[i]);
        }
    }

    public static void addStudent(String[] names){
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "李蕾";
        names[4] = "韩梅梅";
        names[5] = "小名";
        names[6] = "老王";
        names[7] = "小华";
    }
}
*/


import java.util.ArrayList;
import java.util.Random;

class StudentName{
    String name;
    int age;
}
public class CallName{
    public static void main(String[] args) {
        ArrayList<StudentName> array = new ArrayList<StudentName>();
        add(array);
        printArrayList(array);
        randomStudentName(array);
    }
    public static void randomStudentName(ArrayList<StudentName> array){
        Random ran = new Random();
        int num = ran.nextInt(array.size());
        StudentName s = array.get(num);
        System.out.println(s.name+"   "+s.age);
    }
     public static void printArrayList(ArrayList<StudentName> array) {
         for (int i = 0; i < array.size(); i++) {
             StudentName s = array.get(i);
             System.out.println(s.name+"   "+s.age);
         }
     }
    public static void add(ArrayList<StudentName> array){
        StudentName sn1 = new StudentName();
        StudentName sn2 = new StudentName();
        StudentName sn3 = new StudentName();
        StudentName sn4 = new StudentName();
        StudentName sn5 = new StudentName();
        sn1.name = "张三";
        sn1.age = 20;
        sn2.name = "李四";
        sn2.age = 15;
        sn3.name = "王五";
        sn3.age = 25;
        sn4.name = "赵六";
        sn4.age = 10;
        sn5.name = "孙七";
        sn5.age = 30;
        array.add(sn1);
        array.add(sn2);
        array.add(sn3);
        array.add(sn4);
        array.add(sn5);
    }
}