package gestionefile;

/**
 *
 * @author MC
 * @version 12/01/23
 */
import java.util.Scanner;
public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner o = new Scanner(System.in);
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        System.out.println("Inserire username:");
        String userName = o.nextLine();
        System.out.println("\n Inserire password:");
        String passKey = o.nextLine();
        lettore.start();
        //2)ELABORAZIONE
        //inserire username e password
        
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
    }
    
}
