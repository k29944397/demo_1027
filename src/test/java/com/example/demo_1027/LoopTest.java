package com.example.demo_1027;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.util.Random;

public class LoopTest {

	@Test
	public void loopTest() {
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					break a;
				}
				System.out.printf("%d * %d = %2D", i, j, i * j);
			}
			System.out.println("");
		}
	}

	@Test
	public void guessTest() {
		// ����:(�϶��W���� - �϶��U���� + 1) + �϶��U����
		// 20~90
		int ansNumber = (int) (Math.random() * ((99 - 1 + 1) + 1));
		int max = 99;
		int min = 1;
		Random ran = new Random();
		System.out.println("�q1~99:");
		Scanner input = new Scanner(System.in);
		int gusNumber = input.nextInt();
		while (gusNumber != ansNumber) {
			if (gusNumber >= max || gusNumber <= min) {
				System.out.println("�W�X�d��");
				System.out.println("�п�J" + min + "��" + max);
				gusNumber = input.nextInt();
			} else if (gusNumber > ansNumber) {
				max = gusNumber;
				System.out.println(min + "��" + max);
				gusNumber = input.nextInt();
			} else if (gusNumber < ansNumber) {
				min = gusNumber;
				System.out.println(min + "��" + max);
				gusNumber = input.nextInt();
			}
		}
		System.out.println("����F�I���׬O'" + ansNumber+"'�I");
	}
	
	

}
