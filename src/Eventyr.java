import java.util.ArrayList;

public class Eventyr
{
	public static void main(String[] arg)
	{
                java.util.Scanner tastatur = new java.util.Scanner(System.in);
                System.out.println("indtast antal personer i historier:");
                
                
                System.out.println("Indtast persons navn: ");
                String s1 = tastatur.next();
                System.out.println("Indtast persons navn: ");
                String s2 = tastatur.next();
                System.out.println("Indtast persons navn: ");
                String s3 = tastatur.next();
                
                
		ArrayList<String> personer = new ArrayList<String>(); // liste af strenge
		personer.add(""+ s1);                                // Uses string to store name given by user.
		personer.add(""+ s2);
		personer.add(""+ s3);
                
                System.out.println("Navne du har indtastet: "+personer.toString());

		ArrayList<String> handlinger = new ArrayList<String>();
		handlinger.add("slikker sig om munden");
		handlinger.add("får en idé!");
		handlinger.add("gemmer sig i skoven");
                handlinger.add("har det skidt");
                handlinger.add("får det for vildt!");
                handlinger.add("er ensom");
                handlinger.add("er meget træt");
                handlinger.add("vil ikke mere");
                handlinger.add("siger goddag til dig");
                handlinger.add("viser sine malerier af graveballemanden frem");
                handlinger.add("har mistet sin sans for humor");
                handlinger.add("tror på Spaggetti Monster");

		for (int i=0; i<5; i++) {
			int antalPersoner = personer.size(); // antal personer i listen, dvs 3
			int personNummer = (int) (Math.random()*antalPersoner); // giver 0-2
			String person = personer.get( personNummer );
			String handling = handlinger.get( (int)(Math.random()*handlinger.size()));
			System.out.println(person + " " + handling);
    }
  }
}