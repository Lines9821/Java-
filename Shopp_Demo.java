package demo;
import java.util.Scanner;
 /*
   实现商品的库存管理
     功能:
	    1. 展示用户选择功能清单
		2. 根据选择的功能编号,进行不同的操作
		   A. 展示所有库存
		   B. 修改库存数量
*/

public class Shopp_Demo {
    public static void main(String[] args) {

        String brand[] = {"MacBookPro", "ThinkPadT'"};
        double size[] = {13.3, 15.6};
        double price[] = {1399.99, 9999.98};
        int count[] = {0, 0};
        while(true){
        int chooseNumber = chooseFunction();
        switch (chooseNumber) {
            case 1:
                printStore(brand, size, price, count);
                break;
            case 2:
                update(brand, count);
                break;
            case 3:
                return;
            default:
                System.out.println("请输入正确的功能");
                break;
        }
        }
    }
            //显示商品库存信息
            public static void printStore(String brand[],double size[],double price[],int count[]){
                System.out.println("品牌型号     尺寸     价格   库存数");
                int totalCount = 0;
                int totalMoney = 0;
                for(int i=0;i<brand.length;i++){
                    System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
                    totalCount+=count[i];
                    totalMoney+=count[i]*price[i];
                }
                System.out.println("总库存数: "+totalCount);
                System.out.println("商品库存总金额: "+totalMoney);
            }

            //修改库存信息
            public static void update(String brand[],int count[]){
                for(int i=0;i<brand.length;i++){
                    System.out.println("请输入"+brand[i]+"的库存");
                    Scanner sc = new Scanner(System.in);
                    int newCount = sc.nextInt();
                    count[i] = newCount;
                }
            }

            //选择功能的实现
            public static int chooseFunction(){
                System.out.println("---------------库存管理----------------");
                System.out.println("1.查看库存清单");
                System.out.println("2.修改商品库存数量");
                System.out.println("3.退出");
                System.out.println("请输入要执行的操作序号：");
                Scanner sc = new Scanner(System.in);
                int chooseNumber = sc.nextInt();
                return chooseNumber;
            }
        }
