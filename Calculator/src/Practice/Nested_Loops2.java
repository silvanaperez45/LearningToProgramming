package Practice;

public class Nested_Loops2 {

	public static void main(String[] args) {
		int i=0;
		int k=0;
		int j=0;
		while (i<3){
			while(j<4){
				do{
					System.out.println("i= " + i + "j= " + j + "k= " + k);
					k++;
				}while(k<5);
				 j++;
			}
			i++;
		}  
	}
}
