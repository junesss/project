package sec06.exam01;

public class star05 {

	public static void main(String[] args) {
		int spaceCnt=5/2-1;
		int starCnt = 1;
		for(int i=0; i<7;i++) {
			if(i <= 5/2) {
				//마름모꼴 상단부
				for(int j=0;j<spaceCnt;j++)
					System.out.print(" ");
				for(int j=0;j<starCnt;j++)
					System.out.print("*");
				spaceCnt--;
				starCnt++;
			} else {
				//마름모꼴 하단부
				for(int j=0;j<spaceCnt;j++)
					System.out.print(" ");
				for(int j=0;j<starCnt;j++)
					System.out.print("*");
				spaceCnt++;
				starCnt--;
			}
			System.out.println(" ");
			
		}

	}

}
