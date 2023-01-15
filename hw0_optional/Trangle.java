public class Trangle{
	public static void main(String[] args){
		int row = 0;
		int col;
		while (row < 4){
			col = 0;
			while (col < row + 1){
				System.out.print("* ");
				col++;
			}
			System.out.print("\n");
			row++;
		}
		System.out.println("I draw a trangle!");

	}
}