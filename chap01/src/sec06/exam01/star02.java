package sec06.exam01;

public class star02 {

	public static void main(String[] args) {
		//피라미드
		for(int i=0; i<4; i++) {
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		System.out.println( );
		//역삼각형
		for (int i=4; i>0; i--) {
		    for (int j=4-i; j>0; j--) {
		        System.out.print(" ");
		    }
		    for (int j=i*2-1; j>0; j--) {
		        System.out.print("*");
		    }
		    System.out.println();

	}

  }
}
