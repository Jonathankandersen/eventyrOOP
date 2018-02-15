import java.util.ArrayList;

public class Eventyr
{
	public static void main(String[] arg)
	{
                java.util.Scanner tastatur = new java.util.Scanner(System.in);
                //String s1;
                System.out.println("Indtast personers navne: ");
                String person1 = tastatur.toString();
                String s1 = tastatur.next();
                
                
		ArrayList<String> personer = new ArrayList<String>(); // liste af strenge
		personer.add(" "+ s1);
		personer.add("Henning");
		personer.add("Troels");

		ArrayList<String> handlinger = new ArrayList<String>();
		handlinger.add("slikker sig om munden");
		handlinger.add("får en idé!");
		handlinger.add("gemmer sig i skoven");
                handlinger.add("har det skidt");
                handlinger.add("får det for vildt!");
                handlinger.add("er ensom");

		for (int i=0; i<5; i++) {
			int antalPersoner = personer.size(); // antal personer i listen, dvs 3
			int personNummer = (int) (Math.random()*antalPersoner); // giver 0-2
			String person = personer.get( personNummer );
			String handling = handlinger.get( (int)(Math.random()*handlinger.size()));
			System.out.println(person + " " + handling);
    }
  }
}