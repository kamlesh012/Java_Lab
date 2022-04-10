//Third
//Find saddle point in a matrix;
//A Saddle point is an element of a matrix which is minimum in its row & maximum in its column.

import java.util.*;
public class third {
	public static void main(String [] args) {

		int n, m;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Rows & Columns of Matrix");
		n = scn.nextInt();
		m = scn.nextInt();

		int a[][] = new int[n][m];

		System.out.println("Enter" + (n * m) + " Elements of Matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scn.nextInt();
			}
		}

		int mn, mni, mx, saddle = -1;
		for (int i = 0; i < n; i++) {
			mn = 999999;      //Set mn as infinitely large value
			mni = 0;
			mx = -999999;     //Set mx as infinitely small value
			for (int j = 0; j < m; j++) {
				if (a[i][j] < mn) {
					mn = a[i][j];
					mni = j;
				}
			}

			for (int k = 0; k < n; k++) {
				if (a[k][mni] > mx) {
					mx = a[k][mni];
				}
			}
			if (mn == mx) {
				saddle = mn;
				break;
			}
		}
		if (saddle == -1)System.out.println("Saddle Point Not Found");
		else System.out.println("Saddle Point is" + saddle);
	}
}
