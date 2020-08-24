package guia2_estructuras_de_control;
import javax.swing.JOptionPane;// Paquete de Java
public class DescuentoBolas {
    public static void main(String[] args)
    {
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio del pago"));
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero correspondiente a la bolita de su color\n"
                + "1 = Roja\n2 = Verde\n3 = Blanca\n"));
        switch(op)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Se le aplicó un descuento del 10%, su precio a pagar es: $" + precio*0.9f, "Fecicidades", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Se le aplicó un descuento del 5%, su precio a pagar es: $" + precio*0.95f, "Fecicidades", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Lastimosamente no se le aplico ningun descuento, su precio a pagar es: $" + precio, "Suerte a la próxima", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
}