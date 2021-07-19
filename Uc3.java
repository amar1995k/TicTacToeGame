package workshop;

public class Uc3 {
	public static char[][] getLocationFromUserAndValue(char matrix[][], char value, int loc) {
		switch (loc) {
		case 1:matrix[0][0]=value;
		break;
		case 2:matrix[0][1]=value;
		break;
		case 3:matrix[0][2]=value;
		break;
		case 4:matrix[1][0]=value;
		break;
		case 5:matrix[1][1]=value;
		break;
		case 6:matrix[1][2]=value;
        break;
		case 7:matrix[2][0]=value;
		break;
		case 8:matrix[2][1]=value;
		break;
		case 9:matrix[2][2]=value;
		break;
		default:
			break;
		}
		return matrix;
	}

}
