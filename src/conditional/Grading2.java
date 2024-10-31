package conditional;

public class Grading2 {
    public static void main(String[] args) {

        // 성적 [A, B, C] 출석 [PASS, FAIL]

        String grade = "A";
        String attendance = "PASS";

        String school = switch (grade) {
            case "A" -> {
                // 성적 A이고, 출석 PASS -> 전액 + 추가 장학금 출력
                // 성적 A이고, 출석 FAIL -> 전액
                if (attendance.equals("PASS")) { // yield은 화살촉 연산자랑 같다
                    yield "전액 + 추가 장학금 출력";
                } else {
                    yield "전액";
                }
            }
            case "B" -> {
                // 성적 B이고, 출석 PASS -> 반액
                if (attendance.equals("PASS")) {
                    yield "반액";
                } else {
                    yield "장학금 없음";
                }
            }
            case "C" -> "장학금 없음"; // 성적 C는 장학금 없음
            default -> "유효하지 않은 성적";
        };

        System.out.println(school); // 결과 출력
    }
}