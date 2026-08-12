package ex05.dto;


import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @AllArgsConstructor
@NoArgsConstructor

public class EmpDTO {
    String empId;
    String empName;
    int salary;
    String empNo;
    // 날짜
    // 마이바티스는 객체를 자동으로 생성
    // 컬럼이름 - 소문자로 + 카멜표기법
    LocalDate hirDate;
    String entDate;
    
    public EmpDTO(String empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "%s %s %s %s".formatted(empId, empName, salary, empNo);
    }
    
    
    
}
