package sec06.exam01;

public class star04 {

	public static void main(String[] args) {
		//ó���� ���������� �� �׸�
		//�߰��� ó���� ������ĭ���� *
		for(int i=0; i<5; i++) {
			if(isfirstRow(i)||i==4) {
			//ó���� ��������	
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

