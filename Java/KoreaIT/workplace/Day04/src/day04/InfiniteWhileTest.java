package day04;

import java.util.Scanner;

public class InfiniteWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) { //정답일때만 탈출하는 프로그램. 초기값을 잘 생각해줘야함. 아무실행 없이 끝나는 실수를 할 수 있음
			System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
			System.out.println("1. C언어\n2. Java\n3. 망둥어\n4. 파이썬");
			choice=sc.nextInt();
			if (choice==0) {
				System.out.println("안녕히 가세요");
			}
			if (choice==3) {
				System.out.println("정답입니다.");
			} else if(choice==1 || choice==2 || choice==4) {
				System.out.println("오답입니다.");
			} else{
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}