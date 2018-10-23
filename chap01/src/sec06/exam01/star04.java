package sec06.exam01;

public class star04 {

	public static void main(String[] args) {
		//처음과 마지막줄은 다 그림
		//중간은 처음과 마지막칸에만 *
		for(int i=0; i<5; i++) {
			if(isfirstRow(i)||i==4) {
			//처음과 마지막줄	
				for(int j=0; j<5; j++)
					System.out.print("*");
			} else {
				for(int j=0; j<5; j++) {
					if(isfirstCol(j) || j==4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
			}
			
			System.out.println(" ");
		}

	}

	private static boolean isfirstRow(int rowIdx) {
		return rowIdx==0;
	}
	private static boolean isfirstCol(int colIdx) {
		return colIdx==0;
	}

}

