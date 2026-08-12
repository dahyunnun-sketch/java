package ex07.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data // setter/getter
@AllArgsConstructor
@NoArgsConstructor // 기본생성자
@Builder
public class DeptDto {
    // 필드
    private String deptId;
    private String deptCode;
    @NonNull
    private String locationId;


}
