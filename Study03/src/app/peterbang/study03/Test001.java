package app.peterbang.study03;

import java.util.Scanner;

/*
 1. 게시판 페이징
13
A씨는 게시판 프로그램을 작성하고 있다.

A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수

A씨가 필요한 프로그램을 작성하시오.

예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.

m	n	출력
0	1	0
1	1	1
2	1	2
1	10	1
10	10	1
11	10	2

 */
public class Test001 {
	static Scanner scan = new Scanner(System.in);
	private static String inputSanner() {
		String message = "";
		message = scan.nextLine();
		return message;
	}
	
    public static void main(String[] args) {
    	
    	System.out.print("총건수 m :");
    	int m = Integer.parseInt(inputSanner());
    	System.out.print("한페이지에 보여줄 게시물수 n :");
    	int n = Integer.parseInt(inputSanner());
    	if (n >= 1) {
    		
    	}
    	
    	int p = (int)(m / n);
    	if (m % n > 0) {
    		p++;
    	}
    	System.out.println("출력 :" + p);
    	
    	
    }

}
