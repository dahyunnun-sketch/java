package ex03.method;

import ex03.method.obj.Basic;

/*
정적 메서드 / 필드
프로그램이 시작할 때 메모리에 미리 올라가며, 생성하지 않고 사용
사용방법 : 클래스명.메서드명, 클래스명.필드명
 */

public class StaticBmiApp {
    // 정적메서드에서는 정적메서드만 호출가능 !!!
    public static void main(String[] args) {
        // 생성하지 않고 사용할 수 있다
        double bmi = Basic.getBmi(1.67, 55);
        String bmiStr = Basic.bmiToStr(bmi);
        System.out.println(bmi);
        System.out.println(bmiStr);

        // + getLotto() - 1-46까지 임의의 숫자를 뽑아서 배열에 담아서 반환

        // 0-1미만의 임의의 실수를 만들어 주는 기능 (로또)
        // 유틸리티
        double random = Math.random() * 46 + 1;
        // 형변환
        // double 타입 -> int 타입으로
        int num = (int)random;

        System.out.println(random);
        System.out.println(num);
    }
}
