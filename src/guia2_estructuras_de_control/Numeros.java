package guia2_estructuras_de_control;
import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args)
    {
        int nNum, mayor=0, menor=0;
        nNum = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos numeros desea ingresar"));
        while(nNum<=0)
        {
            nNum = Integer.parseInt(JOptionPane.showInputDialog("Error, el numero debe de ser mayor a 0\n"
                                    + "Digite cuantos numeros desea ingresar"));
        }
        int [] num = new int[nNum];
        int cont=0, i=1;
        int pares=0;
        while(cont<nNum)
        {
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i));
            while(num[cont]<=0)
            {
                num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Error, el numero debe de ser mayor a 0\n"
                        + "Ingrese el numero " + i));
            }
            if(num[cont]>mayor)
            {
                mayor = num[cont];
            }
            if(menor==0)
            {
                menor=num[cont];
            }
            else
            {
                if(num[cont]<menor)
                {
                    menor = num[cont];
                }
            }
            if(num[cont]%2==0)
            {
                pares++;
            }
            cont++;
            i++;
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es " + mayor
        + "\nEl numero menor es " + menor + "\nEl numero de pares es " + pares);
        System.exit(0);
    }
}
