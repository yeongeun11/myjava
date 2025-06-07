package oop;
import java.util.*;

public class MessageExample {
    public static void main(String[] args) {
        Locale locale = Locale.ENGLISH;

        ResourceBundle bundle = ResourceBundle.getBundle("oopver.multilanguage.resources.messages", locale);

        System.out.println(bundle.getString("greeting"));       // 인삿말 출력
        System.out.println(bundle.getString("login_failure"));  // 아이디 또는 비밀번호 오류
    }
}

