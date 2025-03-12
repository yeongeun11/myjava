package oop;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class HttpBuffer {
    private char[] buffer;

    HttpBuffer(int size) {
        buffer = new char[size];
    }

    void setBuffer(String argMsg) {
        buffer = argMsg.toCharArray();
    }

    String encode() {
        try {
            return URLEncoder.encode(new String(buffer), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 인코딩을 지원하지 않습니다.", e);
        }
    }
}

public class M250312 { // ✅ 'public'을 유지하려면 파일명을 'MainTest.java'로 변경
    public static void main(String[] args) {
        HttpBuffer test = new HttpBuffer(1024);
        test.setBuffer("https://www.naver.com/?name='정영철'"); // ✅ HTTP → HTTPS 변경

        System.out.println(test.encode());
    }
}


    // 틀
    // 클래스 : 데이터 + 함수

    // 생성자 (Constructor)
    // 객체 생성 시 초기화 작업을 실행

    // 멤버들 -> 멤버 변수, 멤버 메서드

    // 초기화 블록

