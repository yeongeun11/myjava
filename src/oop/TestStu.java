package oop;

import java.io.IOException;

public class TestStu {
    public static void main(String[] args) {
        // try-catch-finally 구조 동작 원리
        try {
            // 위험한 코드
        } catch (IOException e) {
            // 예외 처리
        } catch (Exception e) {
            // 그 외 예외
        } finally {
            // 항상 실행되는 코드
        }
    }
}

