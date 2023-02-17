import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;
        int media = 0;
                
        int i = 0;
        do{
            System.out.println("Valor:");

            valor = scan.nextInt();
            media = media + valor;

            i ++;
        } while(i<5);

        System.out.println("A média é de: " + (media/5));
    }
    
}
