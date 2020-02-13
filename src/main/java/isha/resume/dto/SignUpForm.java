package isha.resume.dto;

import isha.resume.annotations.constraints.EnglishLanguage;
import isha.resume.annotations.constraints.FieldMatch;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;


@FieldMatch(first = "password",second = "repeatPassword",message = "пароли не совпадают")
public class SignUpForm implements Serializable {
    @NotNull
    @Size(max = 100)
    @EnglishLanguage(withSymbols = false,withNumbers = false,message = "Неверное имя пользвателя")
    private String name;
    @NotNull
    @EnglishLanguage(withSymbols = false,withNumbers = false,message = "Неверное имя пользвателя")
    private String secondName;
    @NotNull
    @Email
    private String email;
    @NotNull
//    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,14})|((?=.*\\d)(?=.*[а-я])(?=.*[А-Я]).{8,14})")
    private String password;

    private String repeatPassword;

    public SignUpForm() {
    }

    public SignUpForm(@NotNull @Size(max = 100) String name, @NotNull String secondName, @NotNull @Email String email, @NotNull String password, String repeatPassword) {
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    @Override
    public String toString() {
        return "SignUpForm{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", repeatPassword='" + repeatPassword + '\'' +
                '}';
    }
}
