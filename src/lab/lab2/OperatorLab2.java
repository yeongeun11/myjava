package lab.lab2;

class PermissionManager {
    // 권한 비트 위치 상수 정의
    static final int READ = 0; // 읽기 권한 비트 위치
    static final int WRITE = 1; // 쓰기 권한 비트 위치
    static final int EDIT = 2; // 수정 권한 비트 위치
    static final int DELETE = 3; // 삭제 권한 비트 위치

    private byte permissions = 0; // 초기 권한 설정은 모두 비활성화 (0)

    // 권한 설정 메서드
    void setPermission(int permission, boolean enable) {
        // enable이 true면 해당 권한을 켜고
        if (enable) {
            permissions |= (1 << permission); // 비트 설정
        } else {
            // enable이 false면 해당 권한을 끄기
            permissions &= ~(1 << permission); // 비트 해제
        }
    }

    // 권한 확인 메서드
    boolean checkPermission(int permission) {
        // 지정된 권한이 활성화되어 있는지 확인
        return (permissions & (1 << permission)) != 0; // permission 위치 비트가 1이면 true 그렇지 않으면 false 반환
    }

    // 모든 권한 초기화 메서드
    void removeAllPermissions() {
        permissions = 0; // permissions 값을 0으로 설정하여 모든 비트를 0으로 만듦
    }
}

// 예시 실행 클래스
public class OperatorLab2 {
    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();

        // 읽기, 쓰기, 삭제 권한 설정
        pm.setPermission(PermissionManager.READ, true);     // 읽기 권한 활성화
        pm.setPermission(PermissionManager.WRITE, true);    // 쓰기 권한 활성화
        pm.setPermission(PermissionManager.DELETE, true);   // 삭제 권한 활성화

        // 권한 확인
        System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));     // 출력: true
        System.out.println("쓰기 권한: " + pm.checkPermission(PermissionManager.WRITE));    // 출력: true
        System.out.println("수정 권한: " + pm.checkPermission(PermissionManager.EDIT));     // 출력: false
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE));   // 출력: true

        // 모든 권한 제거
        pm.removeAllPermissions();
        System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));   // 출력: false
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.WRITE));  // 출력: false
    }
}