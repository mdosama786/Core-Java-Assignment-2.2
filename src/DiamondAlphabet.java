/**
 * @Program to Print Diamond Alphabet:
 * 
 */

/**@Create a class**/
public class DiamondAlphabet {

	/**
	 * @Main Method**/
	public static void main(String[] args) {
		/**
		 * @Decration**/
		int j, i;
		/**
		 * @For Loop**/
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				/**
				 * @if Condition**/
				if (i == 1 && j == 3 || i == 2 && j == 2 || i == 3 && j == 1 || i == 2 && j == 4 || i == 3 && j == 5
						|| i == 4 && j == 2 || i == 4 && j == 4 || i == 5 && j == 3)
					/**
					 * @Displaying Output**/
					System.out.print('a');
				/**
				 * @else if condition**/
				else if (i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 4 || i == 4 && j == 3)
					System.out.print('b');
				else if (i == 3 && j == 3)
					System.out.print('c');
				else
					System.out.print(" ");
			}
			/**
			 * @Next Line**/
			System.out.println();
		}
	}
}