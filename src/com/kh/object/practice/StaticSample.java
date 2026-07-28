// 패키지 선언부
package com.kh.object.practice;

// 클래스 선언부
public class StaticSample {
    // 필드
    // 외부에 노출 x = 외부에서 접근 불가
    // 일반, 고속
    private String value;

    // 생성자를 만들지 않으면 컴파일러에 의해서 기본 생성자가 만들어짐
    // 생성자/메서드의 오버로딩 - 메서드의 이름은 같은데 매개변수의 갯수나 타입이 다른 경우
    // 생성자/메서드의 선언부는 중복될 수 x
    public StaticSample(){
        value="";
    }
    
    public StaticSample(String value){
        // 필드명과 매개변수명이 같을 경우 필드에 접근하기 위해서 this 키워드를 붙여줌
        // 이 경우 매개변수가 우선
        this.value = value;
    }
    

    // setter, getter 메서드
    // 필드의 접근 제한자가 private인 경우, 메서드를 통해서 접근
    // setter, getter 메서드를 통해 필드의 값을 변경하거나 가지고 갈 수 있도록 해준다
    // set 필드명, get 필드명

    /**
     * StaticSample의 value 속성을 매개변수로 받아온 값으로 설정한다
     * @param value
     */
    public void setValue(String value) {
        // 외부에서 입력된 값이 변경 가능한 값인지 체크
        if(value.equals("일반")||value.equals("고속")){
            this.value = value;
        }
    }
    /**
     * StaticSample의 value 속성
     * @return
     */
    public String getValue() {
        return value;
    }

    // 메서드
    public void toUpper(){

    }
    public void setChar(int index, char c){

    }
    public int valueLength(){
        return 0;
    }

    // 반환타입을 지정하면 return 문장이 있어야 한다 !!
    public String valueConcat(String str){
        return "";
    }
    
    // 메서드 재정의 - 부모가 가진 메서드를 자식이 다시 정의한 것
    // 메서드의 선언부는 바뀌지 않음
    @Override
    public String toString() {
        return "등급 : " + value;
    }

}
