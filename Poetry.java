public class Poetry{
	public static void main(String[] args){
		char arr[][]=new char[4][];
		arr[0]=new char[]{'春','眠','不','觉','晓'};
		arr[1]=new char[]{'处','处','闻','啼','鸟'};
		arr[2]=new char[]{'夜','来','风','雨','声'};
		arr[3]=new char[]{'花','落','知','多','少'};
		System.out.printf("------------横板------------\n");
		for(int i=0;i<4;i++){   //四行
			for(int j=0;j<5;j++){   //五列
				System.out.print(arr[i][j]);
			}
			if(i%2==0){
				System.out.println("，");  //一三句逗号
			}
			else{
				System.out.println("。");
			}
		}
		System.out.println("\n---------竖版---------");
		for(int j=0;j<5;j++){   //列边行
			for(int i=3;i>=0;i--){   //行变列，反序输出
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("。，。，");
	}
}