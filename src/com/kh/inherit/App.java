package com.kh.inherit;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;
import com.kh.util.inputUtil;

public class App {
    public static void main(String[] args) {
        // 3명의 학생정보를 기록할 수 있는 배열을 생성
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경역학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        for(Student s:students){
            // toString() 실행결과 반환받은 문자열을 반환받은 문자열을 출력
            System.out.println(s);
        }

        // 2명의 사원정보를 기록할 수 있는 배열을 생성
        
        


        // 10명의 사원정보를 기록할 수 있는 배열을 생성
        // [] 방의 갯수 = 배열의 길이
        // 10개, 인덱스는 0-9까지, 0~(n-1)
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("박보검", 28, 180.3, 72.0, 100000000, "영업부");
        employees[1] = new Employee("강동원", 40, 182.0, 76.0, 200000000, "기획부");
        System.out.println(employees[1]);
    
        // 인덱스로 수정 = 무한반복함
        int index = 0;
        while (true) {
            
            // 키보드로부터 사원의 정보를 입력받아 배열에 저장합니다.
            String name = inputUtil.getString("이름 : ");
            int age = inputUtil.getInt("나이 : ");
            int salary = inputUtil.getInt("급여 : ");
            String dept = inputUtil.getString("부서 : ");
            double height = inputUtil.getDouble("키 : ");
            double weight = inputUtil.getDouble("몸무게 : ");
    
            // System.out.println("name : " + name);
            // System.out.println("age : " + age);
    
            
            // 사용자의 입력값을 변수로 저장해두었다가 객체를 생성할 때 사용
            employees[index] = new Employee(name, age,0, 0, salary, dept);
            System.out.println(employees[index]);
            
            String res = inputUtil.getString("계속 사원을 등록하시겠습니까 ?(Y/N)");
            // Y가 아니면 반복문 탈출
            if(!res.equalsIgnoreCase("Y")){
                break;
            }

            // 반복문이 돌 때마다 인덱스를 증가 (무한반복)
            index ++;
        }

    }
}
