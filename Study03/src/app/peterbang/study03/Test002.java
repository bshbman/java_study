package app.peterbang.study03;

import java.util.Scanner;

/*
 2. 사이냅소프트 면접문제

주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌

김씨와 이씨는 각각 몇 명 인가요?
"이재영"이란 이름이 몇 번 반복되나요?
중복을 제거한 이름을 출력하세요.
중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.


 */
public class Test002 {
	static Scanner scan = new Scanner(System.in);
	private static String inputSanner() {
		String message = "";
		message = scan.nextLine();
		return message;
	}
	
    public static void main(String[] args) {
    	
    	//System.out.print("총건수 m :");
    	String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";//inputSanner();

    	String[] names = input.split(",");
    	
    	int value  = 0, value_1 = 0,value_2 = 0;
    	
    	
    	for (String name : names) {
    		if (name.startsWith("김")) {
    			value++;
    		}
    		
    		if (name.startsWith("이")) {
    			value_1++;
    		}
    		
    		if (name.equals("이재영")) {
    			value_2++;
    		}
    	}
    	System.out.println("김씨와 이씨는 각각 몇 명 인가요? 김씨 > " + value + "명 / 이씨 > " +  + value_1 + "명");
    	System.out.println("\"이재영\"이란 이름이 몇 번 반복되나요? " + value_2 + "번");
    	
    	
    }

}
