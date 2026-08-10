package ex05.dto;


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
