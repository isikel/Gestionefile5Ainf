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
        Scanner ins = new Scanner(System.in);
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        lettore.start();
        //2)ELABORAZIONE
        System.out.println("inserisci username:");
        String userName = ins.nextLine();
        System.out.println("inserisci password:");
        String password = ins.nextLine();
        
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
        Scrittore.scriviPsv();
        FileInputStream inputStream = new FileInputStream(inFile);
        FileOutputStream outputStream = new FileInputStream(outFile);
        byte[] buffer = new byte[1024];
        int bytesLetti;
        while ((bytesLetti = inputStream.read(buffer)) != -1){
            outputStream.write(buffer, 0, bytesLetti);
        }
        inputSTream.close();
        
    }
    
}
