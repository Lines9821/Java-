package demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.jar.Attributes;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class NewCallName {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        printStudent(array);
        randomStudent(array);
    }

    public static void addStudent(ArrayList<Student> array) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(15);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(16);
        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(17);
        Student s4 = new Student();
        s4.setName("Sandy");
        s4.setAge(19);
        Student s5 = new Student();
        s5.setName("Lines");
        s5.setAge(20);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
    }

    public static void printStudent(ArrayList<Student> array){
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+"   "+s.getAge());
        }
    }

    public static void randomStudent(ArrayList<Student> array){
        Random r = new Random();
        int index = r.nextInt(array.size());
        Student s = array.get(index);
        System.out.println(s.getName());
    }
}