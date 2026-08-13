package ex07.chainning;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        // 메서드 체이닝
        // 여러 메서드를 마침표(.)로 연결하여 연속적으로 호출하는 프로그래밍 패턴

        // String 객체의 메서드를 이용해서 공백을 제거하고 대문자로 변환
        String str = "         user123 ";
        // 공백 제거된 값을 반환 - String 타입을 반환
        // 자기자신을 직접 변환, 값을 만들어서 반환
        // str = str.trim();
        // toUpperCase() : 모두 대문자로 바꿔주는 메서드
        // str = str.toUpperCase();

        // 위 두개를 합침
        str = str.trim().toUpperCase();
        System.out.println(str);
        
        // 공백제거, [Error] -> 🧨, 10글자만 출력
        String str1 = "            [Error] Connection Failde !      [Error]  ";
        /*
        str1 = str1.trim();
        str1 = str1.replace("[Error]", "E");
        str1 = str1.substring(0,10);
        System.out.println(str1);
        */

        str1 = str1.trim()
                .replace("[Error]", "d")
                .substring(0, 10);

                System.out.println(str1);





        double a = 0.1;
        double b = 0.2;

        // 정밀한 연산이 필요한 경우, double, float 방식을 사용하면 안 됨
        System.out.println(a + b);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        // 실수의 연산
        System.out.println(bd1.add(bd2));

        // 날짜/시간 다루기
        // 현재 날짜
        LocalDate today = LocalDate.now();
        LocalDate hireDate = LocalDate.of(2010, 10, 14);
        System.out.println(today);
        System.out.println(hireDate);

        System.out.println("plusDays : " + today.plusDays(10));
        System.out.println("minusDays : " + today.minusDays(10));

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        
        // 출력형식을 지정하여 출력하기
        // mm - 시간
        // MM - 월
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(formatter));

        // 현재 시간
        System.out.println(LocalTime.now());
        // 현재 시간, 날짜
        System.out.println(LocalDateTime.now());

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년MM월dd a hh:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("오늘은 E요일 입니다.");

        System.out.println(now.format(formatter3));

    
    }

    
}
