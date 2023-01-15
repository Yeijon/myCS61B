public class DrawTriangle{
	
	public static void Draw(int SIZE){
		int row = 0;
		int col;
		while (row < SIZE){
			col = 0;
			while (col < row + 1){
				System.out.print("* ");
				col++;
			}
			System.out.print("\n");
			row++;
		}
		System.out.println("You draw a trangle!");

	}

	public static void main(String[] args){
		Draw(8);

	}
}