package isha.resume.annotations.constraints;


import isha.resume.valid.EnglishLanguageValid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;

@Documented
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EnglishLanguageValid.class})
public @interface EnglishLanguage {

    boolean withNumbers() default true;

    boolean withSymbols() default true;

    String message() default "Not english language";

    Class<? extends Payload>[] payload() default { };

    Class<?>[] groups() default { };

}
