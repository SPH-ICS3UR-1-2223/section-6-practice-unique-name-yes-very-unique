package LoopShape;

public class LoopShape {

	static void createRectangle(int width, int height) {
		// Draw a Rectangle

		// Draw top
		for (int i = 0; i < width; i++) {
			System.out.print("#");
		}
		System.out.println();
		// Draw the middle
		for (int j = 0; j < height - 2; j++) {
			System.out.print("#");
			for (int i = 0; i < width - 2; i++) {
				System.out.print(" ");
			}
			if (width > 1) {
				System.out.println("#");
			} else {
				System.out.println();

			}
		}
		// Draw the bottom
		if (height > 1) {
			for (int i = 0; i < width; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

	static void createTriangle(int leg) {
		// Draw an Isosceles Right Triangle

		// For every "leg" print a line that starts with "#" and has an amount of spaces
		// that goes up by one for each time it repeats
		// and ends with #'s up to the number of times it was looped
		// Start at/at the beginning; do while; do at the end/what changes

		for (int line = 1; line <= leg; line++) {
			if (line == 1) {
				System.out.println("#");
			} else if (line == leg) {
				for (int spaces = 0; spaces < leg; spaces++) {
					System.out.print("#");
				}
				System.out.println();
			} else {
				System.out.print("#");
				for (int spaces = 0; spaces < line - 2; spaces++) {
					System.out.print(" ");
				}
				System.out.println("#");
			}
		}

	}
}
