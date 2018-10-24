package demo;

import java.util.ArrayList;
import java.util.Scanner;

//自定义商品类
class GoodsItem {
    int ID;
    String name;
    double price;
    int number;
    double money;
}

//商品管理系统
public class GoodsShop {
    //main方法调用作用
    public static void main(String[] args) {
        ArrayList<GoodsItem> array = new ArrayList<GoodsItem>();
        //调用商品初始化，调用集合
        init(array);
        while (true) {
            /*
            调用菜单方法
            调用用户选择序号方法
             */
            mainMenu();
            int choose = chooseNumber();
            switch (choose) {
                case 1:
                    showGoodsList(array);
                    break;
                case 2:
                    addGoods(array);
                    break;
                case 3:
                    deleteGoods(array);
                    break;
                case 4:
                    updateGoodsItem(array);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入序号有误，请重新输入");
            }
        }
    }

    //显示货物清单
    public static void showGoodsList(ArrayList<GoodsItem> array) {
        System.out.println();
        System.out.println("=====================商品库存清单=====================");
        System.out.println("商品编号         商品名称             商品单价");
        for (int i = 0; i < array.size(); i++) {
            GoodsItem item = array.get(i);
            System.out.println(item.ID + "           " + item.name + "           " + item.price);
        }
    }

    //添加商品
    public static void addGoods(ArrayList<GoodsItem> array) {
        System.out.println("选择的是添加商品信息功能");
        Scanner sc = new Scanner(System.in);
        GoodsItem item = new GoodsItem();
        while (true) {
            System.out.println("请输入商品编号");
            int ID = sc.nextInt();
            if (judgeID(array, ID)) {
                System.out.println("商品编号重复，请重新输入");
            } else {
                item.ID = ID;
                break;
            }
        }

//        if(ID==g1)  想判断是否重复编号？
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品单价");
        double price = sc.nextDouble();
        item.name = name;
        item.price = price;
        array.add(item);
        System.out.println("添加成功！");
    }

    //判断编号是否重复
    public static boolean judgeID(ArrayList<GoodsItem> array, int ID) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            GoodsItem item = array.get(i);
            if (item.ID == ID) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //删除商品信息
    public static void deleteGoods(ArrayList<GoodsItem> array) {
        System.out.println("选择的是删除商品信息功能");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品编号");
        int ID = sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            GoodsItem item = array.get(i);
            if (item.ID == ID) {
                array.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("您输入的编号不存在！");
    }

    //实现主菜单
    public static void mainMenu() {
        System.out.println();
        System.out.println("====================欢迎光临ItCast超市====================");
        System.out.println("1.货物清单   2.添加货物   3.删除货物   4.修改货物   5.退出");
        System.out.println("请您输入要操作的功能序号：");
    }

    //修改商品信息
    public static void updateGoodsItem(ArrayList<GoodsItem> array) {
        System.out.println("选择的是修改商品信息功能");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品编号");
        int ID = sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            GoodsItem item = array.get(i);
            if (item.ID == ID) {
                System.out.println("请输入新的商品编号");
                item.ID = sc.nextInt();
                System.out.println("输入新的商品名字");
                item.name = sc.next();
                System.out.println("输入新的商品单价");
                item.price = sc.nextDouble();
                System.out.println("商品信息修改成功！");
                return;
            }
        }
        System.out.println("您输入的编号不存在！");
    }

    //选择功能编号
    public static int chooseNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //初始化商品信息
    public static void init(ArrayList<GoodsItem> array) {
        GoodsItem g1 = new GoodsItem();
        g1.ID = 9527;
        g1.name = "少林寺酥饼核桃";
        g1.price = 12.7;

        GoodsItem g2 = new GoodsItem();
        g2.ID = 9008;
        g2.name = "尚康杂粮牡丹饼";
        g2.price = 5.6;

        GoodsItem g3 = new GoodsItem();
        g3.ID = 9879;
        g3.name = "新疆原产哈密瓜";
        g3.price = 599.6;

        array.add(g1);
        array.add(g2);
        array.add(g3);
    }
}