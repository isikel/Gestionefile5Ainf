package gestionefile;

/**
 *
 * @author kelvin isibor
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
       try{
          lettore join();
       } catch (interruptedException ex) {
            Logger.getLogger(GrstioneFile.class.getName());
            }
        //2)ELABORAZIONE
       Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci username:");
        String userName = scanner.nextLine();
        System.out.println("inserisci password:");
        String password = scanner.nextLine().toupperCase();
        
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
        inputStream.close();
        
    }
    
}
