public class Poetry{
	public static void main(String[] args){
		char arr[][]=new char[4][];
		arr[0]=new char[]{'��','��','��','��','��'};
		arr[1]=new char[]{'��','��','��','��','��'};
		arr[2]=new char[]{'ҹ','��','��','��','��'};
		arr[3]=new char[]{'��','��','֪','��','��'};
		System.out.printf("------------���------------\n");
		for(int i=0;i<4;i++){   //����
			for(int j=0;j<5;j++){   //����
				System.out.print(arr[i][j]);
			}
			if(i%2==0){
				System.out.println("��");  //һ���䶺��
			}
			else{
				System.out.println("��");
			}
		}
		System.out.println("\n---------����---------");
		for(int j=0;j<5;j++){   //�б���
			for(int i=3;i>=0;i--){   //�б��У��������
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("��������");
	}
}