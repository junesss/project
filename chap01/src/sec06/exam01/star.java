package sec06.exam01;

public class star {

	public static void main(String[] args) {
		//�簢�� 5x5
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		//���ܿ��� �����ϴ� �����ﰢ��
		for(int i=0; i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		//�»�ܿ��� �����ϴ� �����ﰢ��
		for(int i=0; i<5; i++) {
			for(int j=5; j>5; j--) { 		//for(int j=0; j<5 j++)
				if(i<j){					//if(j<5-i-1)
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			
			System.out.println("");
		}

	}

}



