package ex06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Required {

}
