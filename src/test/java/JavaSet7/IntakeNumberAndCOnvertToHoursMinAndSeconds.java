package JavaSet7;

public class IntakeNumberAndCOnvertToHoursMinAndSeconds {

    public static void main(String[] args) {

        int num=5000;

        int Minutes=num/60;
        System.out.println("Total Minutes"+Minutes);
        int Seconds=num%60;
        System.out.println("Total Seconds"+Seconds);
        int Hours=Minutes/60;
        System.out.println("Total Hours"+Hours);
        int RemainingMinutes=Minutes%60;
        System.out.println("Total RemainingMinutes"+RemainingMinutes);

        System.out.println("Total Hours"+Hours +" " + RemainingMinutes + " " +Seconds);
    }
}
