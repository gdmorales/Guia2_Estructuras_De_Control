package guia2_estructuras_de_control;
import javax.swing.JOptionPane;
public class Sueldos {
    public static void main(String[]args)
    {
        // TODO code application logic here
        double sueldo=0, mayor=0,menor=10000;
        int i=1, contador=0, empleados=0;
        while(i<=5)
        {
            sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i));
            while(sueldo<=0)
            {
                sueldo= Double.parseDouble(JOptionPane.showInputDialog("Error, el salario debe de ser mayor a 0\n"
                        + "Ingrese el Sueldo del Empleado " +i));
            }
            if(sueldo>300)
                contador= contador + 1;
            if(sueldo>mayor)
                mayor=sueldo;
            if(sueldo<menor)
                menor=sueldo;
            i=i+1;
        }
        empleados= i-1;
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor + 
        "\n El sueldo Menor es de $: " + menor +
        "\n"+ contador + " Empleados tienen un sueldo mayor de $300");
        System.exit(0);
    }
}
