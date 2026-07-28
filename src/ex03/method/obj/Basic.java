package ex03.method.obj;

public class Basic {

    public void info(String name, int age, double height) {
       
        // 숫자를 나타내는 타입
        // 정수형 - int
        // 실수형 - double
        // long l = 1100000000000000l;
        System.out.println("""
               이름 : %s
               나이 : %d
               키 : %f
               """.formatted(name, age, height));
    }

    public String getinfo(String name, int age, double height) {
        return "이름 : %s, 나이 : %d, 키 : %.2f".formatted(name, age, height);
    }

    // 실수 - m/kg
    public static double getBmi(double h, double w) {
        double bmi = 0.0;
        // 신체질량지수 (BMI)
        // bmi = 체중 / (신장(m)*신장(m))
        // 당신의 키, 몸무게, bmi, 정상입니다.
        bmi= w /(h*h);
        return bmi;
    }
    
    // 형변환 숫자->문자, 문자->숫자
    // 쿼리스트링으로 넘어온 데이터는 문자로 들어온다 !! -> 숫자로 바꿔서 사용
    // 정수 cm/kg
    public static String getBmiStr(int h, int w) {
        String bmiStr = "";
        double bmi = 0.0;
        // 신체질량지수 (BMI)
        // bmi = 체중 / (신장(m)*신장(m))
        // 당신의 키, 몸무게, bmi, 정상입니다.
        // 소수점 2자리까지 출력한다

        // 실수 - 문자
        String res = "";
        
        
        
        
        bmi= w /((double)h/100 * (double)h/100);
        bmiStr = """
            키 : %dcm, 몸무게 : %dkg, bmi : %f, %s입니다.
            """.formatted(h,w,bmi, "정상");
            return bmiStr;
        }
    /**
     * bmi를 매개변수로 받아서 문자로 변환
     * @param bmi
     */    
    // + bmiToStr(bmi:double):String
    public String bmiToStr(double bmi){
        // 변수 선언
        String str;
        // 변수 초기화
        // 변수를 초기화하지 않으면 사용불가
        str="";
        // 18.5 미만 저체중, 22.9 이하 정상, 24.9 이하 비만전단계, 나머지 비만
        if(bmi < 18.5){
            // 문장의 끝은 ;, 문자열은 ""로 감싼다
            str = "저체중";
        } else if(bmi <= 22.9){
            str = "정상";
        } else if(bmi <= 24.9){
            str = "비만전단계";
        } else {
            str = "비만";
        }



        // String str = ""; // 선언과 초기화를 동시에 진행
        //필드는 초기화하지 않은 경우 타입의 기본값(객체=null, 숫자=0)
        return str;
    }
    
   
    // static 키워드 : 프로그램 시작과 동시에 메모리에 올라간다 !!
    // 생성하지 않고 사용할 수 있다
    // 지들끼리 호출할 수 있다
    public static void main(String[] args) {
        double bmi = getBmi(1.63, 55.5);
        System.out.println(bmi);

        String bmiStr = getBmiStr(163, 55);
        System.out.println(bmiStr);

        // 정수의 연산 결과는 정수
        // 타입변환 (형변환) - 명시적 형변환 / 자동 형변환
        // 명시적 형변환 - (타입)을 앞에 붙여준다
        long l = 100; // 자동형변환
        System.out.println((double)100/3);
    }
    
}
