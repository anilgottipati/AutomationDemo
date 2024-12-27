package JavaSet7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeInDifferentFormat {

    public static void main(String[] args) {

        SimpleDateFormat sd = new SimpleDateFormat("YYYMMdd");

        Date d = new Date();

        sd.format(d);

        System.out.println(sd.format(d));


    }
}
