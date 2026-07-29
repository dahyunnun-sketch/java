package ex03.method;

import java.util.Scanner;

import ex03.method.obj.Basic;

public class MenuApp {
    public static void main(String[] args) {

        // 사용자의 입력을 받아오는 객체
        Scanner scan = new Scanner(System.in);

        while (true) {
            // 1. 메뉴 출력
            Basic.printMenu();

            // 2. 사용자 입력받기
            int menu = scan.nextInt();
            System.out.println("menu : " + menu);
            
            // 3. 입력에 따라 메서드 실행
            if (menu == 1) {
                // bmi
                // 키, 몸무게
                System.out.println("키를 입력해주세요.");
                System.out.println("몸무게를 입력해주세요.");
            } else if (menu == 2) {
                // lotto
                Basic.getLotto();
            } else if (9 == menu) {
                // 프로그램 종료
                System.exit(0);
            } else {
                System.out.println("메뉴를 확인해주세요.");
            }
        }

    }
}
