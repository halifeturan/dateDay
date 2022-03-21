import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class dateDay {
    public static void main(String[] args) {

        while(true)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int yil=sc.nextInt();
        System.out.println("Doğum ayınızı giriniz:");
        int ay=sc.nextInt();
        System.out.println("Doğum gününüzü giriniz:");
        int gun=sc.nextInt();

        SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd, E");	
		
	  Calendar takvim = new GregorianCalendar(yil,ay-1,gun);
	System.out.println("Doğum gününüz:"+format.format(takvim.getTime()));

        }
    }
}