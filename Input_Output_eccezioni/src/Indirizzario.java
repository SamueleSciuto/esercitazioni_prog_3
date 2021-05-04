import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Indirizzario {
    public static void main(String[] args) {
    Scanner scExt = null;
        Indirizzo[] rubrica=new Indirizzo[50];
        int i=0;
    try{
        scExt =new Scanner(new File("indirizziPerRubrica.txt"));
        while(scExt.hasNextLine()){
            String line = scExt.nextLine();
            Scanner lineScanner = new Scanner(line); // analizza il contenuto della riga (stringa) corrente
            lineScanner.useDelimiter("\\s*;\\s*");
            String name = lineScanner.next();
            String surname = lineScanner.next();
            String street = lineScanner.next();
            int civic = lineScanner.nextInt();
            String town = lineScanner.next();

            rubrica[i] = new Indirizzo (name, surname, street, civic, town);;
            i++;
            lineScanner.close();

        }
    }catch (IOException e){
        System.out.println(e.getMessage());//file da leggere sbagliato o inesistente
    }catch (InputMismatchException e)
    {System.out.println("Errore nell'input! " + e.getMessage());}//formattazione dei dati dentro il file sbagliata
    finally {if (scExt!=null)
        scExt.close();}
    }
}
