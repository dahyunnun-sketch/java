package ex06.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.kh.inherit.practice.Employee;


public class App {
    public static void main(String[] args) {
        // 클래스 -> new 클래스 -> 객체
        // 1. 객체로 부터 클래스의 정보를 조사
        Employee emp = new Employee("다현", 22, 170, 55, 100000, "ㅇㅇ");
        
        // Class의 정보를 얻어오는 2가지 방법
        Class<?> clazz1 = Employee.class; // 클래스로부터 직접 정보를 얻어오기
        Class<?> clazz = emp.getClass(); // 객체의 메서드로 부터 클래스 객체 얻어오기

        System.out.println("clazz1 == clazz : " + (clazz1 == clazz));

        // 선언된 필드의 목록을 조회
        // getDeclaredFields() : private 필드에 접근하기 위해서 (private 선언되어있는 필드도 가져올 수 있음)
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            // 접근제한자 -> 숫자에서 문자로
            String modifier = Modifier.toString(field.getModifiers()); // 정수를 "private"같은 문자열로 반환
            // 필드 선언부
            System.out.println("필드 선언부 : " + modifier + " " + field.getType() + " " + field.getName());
        
            // 어노테이션이 붙어있는지 확인
            if(field.isAnnotationPresent(Required.class)){
            System.out.println("Required 어노테이션이 붙어있는 필드");
            System.out.println("필수 입력 입니다.");
            }
        }

        System.out.println("=== 검증기를 통해 검증하기");
    
        try {
            validation.검증(new Employee());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
