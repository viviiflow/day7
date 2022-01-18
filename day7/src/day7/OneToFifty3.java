package day7;

import java.util.Scanner;
import java.util.Random;

public class OneToFifty3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		final int size = 9;

		int[] front = new int[size];
		int[] back = new int[size];
		int[] check1 = new int[size];
		int[] check2 = new int[size];
		int x = 0, n1 = 0, n2 = 0;
		int[] idx1 = new int[size];
		int[] idx2 = new int[size];
		int idxf = 1, idxb = 0;

		while (true) {
			n1 = ran.nextInt(9) + 1;

			if (check1[n1 - 1] == 0) {
				check1[n1 - 1] = 1;
				front[x] = n1;
				x++;
			} else {
				continue;
			}
			if (x == 9) {
				break;
			}
		}

		while (idxf < 10) {
			for (int n = 0; n < size; n++) {
				if (front[n] == idxf) {
					idx1[idxf - 1] = n;
					idxf++;
				}
			}
		}

		x = 0;

		while (true) {
			n2 = ran.nextInt(9) + 10;

			if (check2[n2 - 10] == 0) {
				check2[n2 - 10] = 1;
				back[x] = n2;
				x++;
			} else {
				continue;
			}
			if (x == 9) {
				break;
			}
		}

		while (idxb < 9) {
			for (int h = 0; h < size; h++) {
				if (back[h]-10 == idxb) {
					idx2[idxb] = h;
					idxb++;
				}
			}
		}

		int gn = 1;
		while (gn < 10) {

			System.out.println(gn + "[" + idx1[gn - 1] + "]");

			for (int j = 0; j < size; j++) {
				System.out.print(front[j] + "     ");
				if (j == 2 || j == 5) {
					System.out.println("");
					System.out.println("");
				}
			}
			System.out.println("");
			System.out.println("[" + gn + "]의 인덱스 입력 : ");
			int pn = sc.nextInt();
			System.out.println("");

			if (pn == idx1[gn - 1]) {
				front[pn] = back[pn];
				gn++;
			}

		}

		while (gn >= 10 && gn <= 18) {

			System.out.println(gn + "[" + idx2[gn - 10] + "]");

			for (int j = 0; j < size; j++) {
				System.out.print(back[j] + "     ");
				if (j == 2 || j == 5) {
					System.out.println("");
					System.out.println("");
				}
			}
			System.out.println("");
			System.out.println("[" + gn + "]의 인덱스 입력 : ");
			int pn = sc.nextInt();
			System.out.println("");

			if (pn == idx2[gn - 10]) {
				back[pn] = 0;
				gn++;
			}

		}

		System.out.println("게임 종료");

	}
}
