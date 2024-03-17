import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CRIANDO UM SCANNER E UMA STRING PARA RECEBER A ENTRADA.
        Scanner scan = new Scanner(System.in);
        String [] texto;

        //COLETANDO A STRING
        texto = scan.nextLine().split("");

        //MOSTRANDO A STRING AO CONTRARIO:
        for (int i = texto.length -1; i >= 0; i--) {
            System.out.print(texto[i]);
        }
    }
}