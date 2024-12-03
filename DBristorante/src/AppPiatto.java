import java.util.Scanner;

public class AppPiatto 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea un nuovo piatto per il tuo ristorante!");
        
        System.out.println("Sezione nel menù: ");
        String sezioneMenù = sc.nextLine();
        
        System.out.println("Numero nel menù: ");
        Byte numeroMenù = sc.nextByte();
        
        sc.nextLine();
        
        System.out.println("Nome del piatto: ");
        String nome =sc.nextLine();
        
        System.out.println("Descrizione: ");
        String descrizione = sc.nextLine();

        System.out.println("Prezzo: ");
        Double prezzo = sc.nextDouble();

        System.out.println("Il piatto che hai creato:");

        System.out.println("Sezione nel menù: " + sezioneMenù);
        System.out.println("Numero nel menù: " + numeroMenù);
        System.out.println("Nome del piatto: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + "€");
        sc.close();
    }
}