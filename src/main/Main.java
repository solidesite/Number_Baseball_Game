package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		int ball = 0;
		int strike = 0;
		int count = 8;

		int[] nums = new int[3];
		boolean[] numCheck = new boolean[9];

		for (int i = 0; i < nums.length; i++) {
			int ranNum = rd.nextInt(9);
			if (numCheck[ranNum] == false) {
				numCheck[ranNum] = true;
				nums[i] = ranNum + 1;
			} else {
				i--;
			}
		}

		while (true) {
			if (count == 0) {
				System.out.println("맞추지 못했습니다. 정답은");
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i]);
				}
				System.out.println("입니다.");
				break;
			}
			System.out.println("남은 기회 : " + count + "번");
			System.out.println("0~9 사이 숫자를 입력하세요.");
			System.out.println("첫번째 숫자를 입력하세요.");
			String input1 = scan.nextLine();
			System.out.println("두번째 숫자를 입력하세요.");
			String input2 = scan.nextLine();
			System.out.println("세번째 숫자를 입력하세요.");
			String input3 = scan.nextLine();
			System.out.println("입력한 숫자 : " + input1 + ", " + input2 + ", " + input3);

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

			System.out.println("볼 : " + ball + "스트라이크 : " + strike);
			if (inputInt1 == nums[0] && inputInt2 == nums[1] && inputInt3 == nums[2]) {
				System.out.println("축하합니다. 모두 맞췄습니다.");
				break;
			}
			ball = 0;
			strike = 0;
			count--;
		}

	}

}
