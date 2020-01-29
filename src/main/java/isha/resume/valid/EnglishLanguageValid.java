package isha.resume.valid;

import isha.resume.annotations.constraints.EnglishLanguage;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnglishLanguageValid implements ConstraintValidator<EnglishLanguage,String> {

    private boolean withNumbers;

    private boolean withSymbols;


    @Override
    public boolean isValid(String engLang, ConstraintValidatorContext constraintValidatorContext) {

        return engLang.matches(getValidTamplate());
    }

    @Override
    public void initialize(EnglishLanguage el) {
        this.withNumbers = el.withNumbers();
        this.withSymbols = el.withSymbols();
    }

    private String getValidTamplate() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (withNumbers) {
            stringBuilder.append("0-9");
        }
        if (withSymbols) {
            stringBuilder.append("\\W");
        }
        return "^[a-zA-Z"+stringBuilder.toString()+"]*$";
    }

    public boolean isWithNumbers() {
        return withNumbers;
    }

    public void setWithNumbers(boolean withNumbers) {
        this.withNumbers = withNumbers;
    }

    public boolean isWithSymbols() {
        return withSymbols;
    }

    public void setWithSymbols(boolean withSymbols) {
        this.withSymbols = withSymbols;
    }
}
