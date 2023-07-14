package Practice.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Find_Age
{

    public static void getAge(String dob) {
        try
        {
            String datePattern = "yyyy/MM/dd";
            SimpleDateFormat date = new SimpleDateFormat(datePattern);

            Date givenDate = date.parse(dob);
            System.out.println(givenDate);
            LocalDate currentDate = LocalDate.now();
            String today = date.format(new Date());
            Date todaysDate = date.parse(today);
            long diffInMillies = Math.abs(givenDate.getYear() - todaysDate.getYear());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS)/365;

            System.out.println(diffInMillies);

        }
        catch (ParseException e)
        {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        getAge("12/02/1992");
    }
}
