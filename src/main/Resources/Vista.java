package Resources;

import javax.swing.*;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public void mensajeIngresoDeDtos() {
        String seleccion = JOptionPane.showInputDialog(
                "Input dialog",
                JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante

        System.out.println("El usuario ha escrito " + seleccion);
    }

    public static int ingresaUsuario(Scanner scanner) {
        System.out.print("probables: ");
        int probable = scanner.nextInt();
        System.out.print("bien: ");
        int bien = scanner.nextInt();
        int coincidentes = probable + bien;
        return coincidentes;
    }

    public String pedirNumero() {
        System.out.print("Escriba un numero de 4 cifras: ");
        String numero = scanner.next();
        return numero;
    }
    public int pedirCifrasRegulares(){
        System.out.print("Regular: ");
        int regular = scanner.nextInt();
        return regular;
    }
    public int pedirCifrasBien(){
        System.out.print("Bien: ");
        int bien = scanner.nextInt();
        return bien;
    }
}
