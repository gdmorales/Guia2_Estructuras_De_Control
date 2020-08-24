package guia2_estructuras_de_control;
import javax.swing.JOptionPane;// Paquete de Java
public class Alumno {
    public static void main(String[] args)
    {
        float nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del alumno"));
        if(nota>=7)
        {
            JOptionPane.showMessageDialog(null,"El alumno APROBÓ la materia", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(nota>=6.5 && nota<=6.99)
            {
                JOptionPane.showMessageDialog(null,"El alumno está reprobado, PERO PUEDE HACER EXAMEN DE RECUPERACION", "Cuidado", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El alumno esta REPROBADO", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        System.exit(0);
    }
}
