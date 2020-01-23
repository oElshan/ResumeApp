package isha.resume.annotations.constraints;

import isha.resume.valid.FieldMatchValid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;

@Documented
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)

@Constraint(validatedBy = FieldMatchValid.class)
public @interface FieldMatch {

    String first();

    String second();

    String message() default "";

    Class<? extends Payload>[] payload() default { };

    Class<?>[] groups() default { };


}
