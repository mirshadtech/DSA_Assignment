package in.ineuron;

/**
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
 * represents the coordinate of a point. Check if these points make a straight
 * line in the XY plane.
 ** 
 * Example 1:**
 * 
 ** 
 * Input:** coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 ** 
 * Output:** true
 * 
 * Solution is :- calculate the slope y2-y1/x2-x1; (dy * (x2-x1)=dx*(y2-y1)); 
 */


public class Question_8 {

	public static void main(String[] args) {

		int[][] coor = new int[][] { { 2, 4 }, { 2, 5 }, { 2, 8 } };
		System.out.println("Result is " + checkStraightLine(coor));
	}

	public static boolean checkStraightLine(int[][] coordinates) {

		if (coordinates.length == 2)
			return true;

		int x0 = coordinates[0][0], y0 = coordinates[0][1];
		int x1 = coordinates[1][0], y1 = coordinates[1][1];

		int dx = x1 - x0;
		int dy = y1 - y0;

		for (int i = 2; i < coordinates.length; i++) {
			int x = coordinates[i][0];
			int y = coordinates[i][1];

			if (dy * (x - x0) != dx * (y - y0))
				return false;
		}

		return true;
	}
}
