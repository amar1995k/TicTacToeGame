package workshop;

public class Uc5 {
	public static boolean isLocationEmpty(char matrix[][], int loc) {
		switch (loc) {
		case 1: return checkEmpty(matrix[0][0]);
		case 2: return checkEmpty(matrix[0][1]);
		case 3: return checkEmpty(matrix[0][2]);
		case 4: return checkEmpty(matrix[1][0]);
		case 5: return checkEmpty(matrix[1][1]);
		case 6: return checkEmpty(matrix[1][2]);
		case 7: return checkEmpty(matrix[2][0]);
		case 8: return checkEmpty(matrix[2][1]);
		case 9: return checkEmpty(matrix[2][2]);
		}
		return false;
	}
	
	private static boolean checkEmpty(char ch) {
		if(ch == ' ') {
			return true;
		}else {
			return false;
		}
	}

}
