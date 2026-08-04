package com.kh.practice2.model;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class App {
    public static void main(String[] args) {
        // 추상 클래스는 생성이 불가능 하다
        // Dog dog = new Dog();
        
        // 패키지가 다르면 import
        // 추상 클래스는 생성이 불가능 하다
        // new Animal();

        // 1. Animal 타입의 객체 배열 생성 [방의 갯수]
        // 변수명은 소문자로 시작
        Animal[] animals = new Animal[5];

        // 2. 각 인덱스에 무작위로 dog, cat을 생성해서 넣기
        // 객체 생성
        Dog dog1 = new Dog("멍멍이", "dog", 15);
        // 부모타입으로 자동형변환
        // 다형성 : 여러가지 형태를 가질 수 있는 성질
        // 자식객체가 재정의한 메서드가 실행되어지므로 다양한 기능을 구현할 수 있다
        animals[0] = dog1;

        animals[1] = new Cat("야옹이", "cat", "서울", "노랑");
        animals[2] = new Dog("몽이", "dog", 5);
        animals[3] = new Cat("냥이", "cat", "서울", "노랑");
        animals[4] = new Dog("뭉이", "dog", 3);

        // 3. 배열의 요소를 순회하며 toString을 출력
        // 타입 변수명 : 배열/리스트
        for(Animal a : animals){
            // toString 메서드는 출력하는 메서드가 아님
            // System.out.println를 통해서 출력을 해줘야 함
            System.out.println(a.toString());
            // 객체를 출력하면 객체의 toString메서드가 호출됨
            System.out.println(a);
            System.out.println("------------------");
            a.speak();
        }
    }
}
