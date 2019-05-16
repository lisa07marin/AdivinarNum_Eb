import javax.swing.*;

public class Vista {
    public void mensajeIngresoDeDtos(){
        String seleccion = JOptionPane.showInputDialog(
                "Input dialog",
                JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante

        System.out.println("El usuario ha escrito "+seleccion);
    }
}
