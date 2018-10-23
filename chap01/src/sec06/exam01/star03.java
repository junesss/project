package sec06.exam01;

public class star03 {

	public static void main(String[] args) {
		//¸¶¸§¸ð
		for(int i=0; i<4; i++) {
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}

		for (int i=3; i>0; i--) {
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
