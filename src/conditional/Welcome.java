package conditional;

import java.util.Date;

public class Welcome {
    public static void main(String[] args) {

        Date date = new Date();
        int currentHour = date.getHours();

        System.out.println("현재시간은 " + date);
        if (currentHour < 11) {
            System.out.println("Good Morning");
        } else if (currentHour < 15) {
            System.out.println("Good Afternoon");
        } else if (currentHour < 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
