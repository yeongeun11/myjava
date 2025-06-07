package oop;

class SubjectInfo {
    String title;
    int score;
    SubjectInfo(String argTitle, int argScore) {
        title = argTitle;
        score = argScore;
    }
    SubjectInfo() {}
}

class Student2 {
    int id;
    String name;
    private static String university = "영진";
    SubjectInfo[] subList;
    int sum;
    float avg;

    Student2(int subNum, String argName, int argId) {
        subList = new SubjectInfo[subNum];
        for(int i = 0; i < subNum; i++) {
            subList[i] = new SubjectInfo();
        }

        name = argName;
        id = argId;
    }
    int getSum(){
        for(SubjectInfo temp : subList) {
            sum += temp.score;
        }
        return sum;
    }
    float getAvg() { avg = getSum()/2.0f; return avg; }
    static void prtUniversity() { System.out.println(university); }
    void setName(String argName) { name = argName; }
}

public class Bar4 {
    public static void main(String[] args) {

    }
}
