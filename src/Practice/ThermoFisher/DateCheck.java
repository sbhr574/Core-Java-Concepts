package Practice.ThermoFisher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateCheck
{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        LocalDate date1 = LocalDate.parse(date, formatter);

        Date date2 = dateFormat.parse(date);
//        System.out.println(date1);
        dateFormat.applyPattern("dd/MM/yyyy");
        System.out.println(dateFormat.format(date2));
    }
}
