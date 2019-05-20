package Resources;

import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public String pedirAlUsuarioUnNumero() {
        System.out.print("Escriba un numero de 4 cifras: ");
        String numero = scanner.next();
        return numero;
    }

    public int pedirAlUsuarioCantidadDeCifrasRegulares() {
        System.out.print("Regular: ");
        int regular = scanner.nextInt();
        return regular;
    }

    public int pedirAlUsuarioCantidadDeCifrasBien() {
        System.out.print("Bien: ");
        int bien = scanner.nextInt();
        return bien;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int mostrarMenuDeJuegos(){
        System.out.println("1- Adivina el numero!");
        System.out.println("2- Adivinaré el numero que pienses!");
        System.out.print("--> ");
        return scanner.nextInt();
    }
}
