package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		int ball = 0;
		int strike = 0;
		int ranNum1 = rd.nextInt(10) + 1;
		int ranNum2 = rd.nextInt(10) + 1;
		int ranNum3 = rd.nextInt(10) + 1;
		int[] nums = { ranNum1, ranNum2, ranNum3 };

		System.out.println("0~9 ���� ���ڸ� �Է��ϼ���.");
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String input1 = scan.nextLine();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		String input2 = scan.nextLine();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		String input3 = scan.nextLine();
		System.out.println("�Է��� ���� : " + input1 + input2 + input3);

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		int inputInt1 = Integer.parseInt(input1);
		int inputInt2 = Integer.parseInt(input2);
		int inputInt3 = Integer.parseInt(input3);

		if (inputInt1 == nums[0]) {
			strike++;
		} else if (inputInt1 == nums[1] || inputInt1 == nums[2]) {
			ball++;
		}
		if (inputInt2 == nums[1]) {
			strike++;
		} else if (inputInt2 == nums[0] || inputInt2 == nums[2]) {
			ball++;
		}
		if (inputInt3 == nums[2]) {
			strike++;
		} else if (inputInt3 == nums[0] || inputInt3 == nums[1]) {
			ball++;
		}
		
		System.out.println("�� : " + ball + "��Ʈ����ũ : " + strike);
	}

}
