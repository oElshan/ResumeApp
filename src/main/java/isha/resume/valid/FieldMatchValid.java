package isha.resume.valid;

import isha.resume.annotations.constraints.FieldMatch;
import org.springframework.beans.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldMatchValid implements ConstraintValidator<FieldMatch,Object> {


    private String firstFieldName;

    private String secondFieldName;

    @Override
    public boolean isValid  (final Object value, final ConstraintValidatorContext constraintValidatorContext) {

        try {
            Object firstValue = BeanUtils.getPropertyDescriptor(value.getClass(), firstFieldName).getReadMethod().invoke(value);
            Object secondValue = BeanUtils.getPropertyDescriptor(value.getClass(), secondFieldName).getReadMethod().invoke(value);
            return (firstValue == null && secondValue == null) || (firstValue != null && firstValue.equals(secondValue));

        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        this.firstFieldName = constraintAnnotation.first();
        this.secondFieldName = constraintAnnotation.second();

    }
}
