import java.util.Scanner;

public class AppIngredienti 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Descrivi gli ingredienti del piatto");
        
        System.out.println("Composizione: ");
        String composizione = sc.nextLine();
        
        System.out.println("Indice glicemico: ");
        Byte indiceGlicemico = sc.nextByte();
        
        sc.nextLine();
        
        System.out.println("Presenza di allergeni: ");
        String allergeni =sc.nextLine();
        
        System.out.println("Scadenza: ");
        String scadenza = sc.nextLine();

        System.out.println("Tipo di dieta: ");
        Double dieta = sc.nextDouble();

        System.out.println("Il piatto che hai creato:");

        System.out.println("Composizione: " + composizione);
        System.out.println("Indice glicemico: " +indiceGlicemico);
        System.out.println("Presenza di allergeni: " + allergeni);
        System.out.println("Scadenza del prodotto: " + scadenza);
        System.out.println("Tipo di dieta: " + dieta);
        sc.close();
    }
} 