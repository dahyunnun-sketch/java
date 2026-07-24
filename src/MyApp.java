
// 클래스 선언부
// 코드블록 { }
// 접근제한자 class 클래스명 { }

import java.util.Scanner;

public class MyApp {

    // 속성 = 필드
    // 타입 변수명 = 값

    // 기능 = 메서드
    // 메서드 선언부
    // ❗ 접근제한자 반환타입 메서드이름(매개변수타입 매개변수이름){} ❗
    // void : 반환타입이 없으면 적어주는 키워드

    public static void main(String[] args) {

        // 변수 선언
        // 변수타입 변수명 = 값(리터럴);
        // int(변수저장), double, string
        String name = "dahyun";
        int age = 27;

        System.out.println(name);
        System.out.println(age);

        // a=1,b=2 변수를 선언하고 두 변수의 콘솔창에 합을 출력해보자
        int a = 1, b = 2;
        int res = a + b;
        System.out.print("두 수의 합 : "); // 줄바꿈 없이 출력
        System.out.println(res); // 출력 후 줄바꿈

        // 하나의 문자를 작은 따옴표로 감싼 것
        char var = 'A';
        char var1 = 65;

        // + 연산자는 문자열을 연결
        System.out.println("var : " + var);
        System.out.println("var1 : " + var1);

        // int 타입의 허용 범위를 넘어서는 경우
        // 리터럴이 들어오면 기본타입으로 변경
        // 정수는 int형, 실수는 double형
        // long(l,L), float(f,F)같은 경우, 리터럴 뒤에 타입을 적는다
        long num = 220000000000l;
        double num2 = 1.2;
        float num3 = 1.2f;

        // 변수명을 작성 할 때
        // 이미 선언된 변수명은 사용 x
        // 예약어(키워드) 사용 x
        // 숫자가 앞에 올 수 x
        // 소문자로 작성(단, 상수는 모두 대문자)
        // _, $ 사용가능
        // 여러개의 단어가 합쳐질 경우 카멜표기법을 사용
        boolean trueVar = true;
        boolean result = num2> num3;

        if(!result){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 이스케이프 문자
        // 정해진 역할이 있는 문자들을 출력할 때 \를 붙여준다
        // ex) ", ',\
        System.out.println("\"");
        System.out.println("\"오늘도 수고 많으심\"");

        // 자동형변환이 가능한 경우
        // 값의 허용범위가 작은 타입이 큰 타입으로 대입될 때
        byte n = 127; // -128 ~ 127

        // 💢 n++, ++n
        System.out.println("127++ :" +n++);
        System.out.println(n);

        int i = n;

        // 강제형변환 -> 값이 왜곡될 수 있음
        System.out.println((byte)1000);

        // 입력을 받기위해 사용하는 객체
        // 변수타입 : 객체는 타입으로 사용할 수 있다
        // 입력받기 위해서 입력을 받을 수 있는 스캐너 객체를 생성
        Scanner scan = new Scanner(System.in);
        // 콘솔창에서 입력을 대기하고 있다가
        // 엔터키가 눌러지면 사용자의 입력을 받아서 반환
        String str = scan.next();
        System.out.println("사용자의 입력값 : " + str);

        // 출력 - 정해진 형식에 맞게 출력

    }
}
