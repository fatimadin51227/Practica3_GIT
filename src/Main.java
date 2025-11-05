import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercio4 {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static LocalDate fecha_de_hoy = LocalDate.now();
    static int saldo_inicial;

    public static void main(String[] args) {
        String cuentas;
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");

        do {
            String numero_cuenta = JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta");
            Pattern pat = Pattern.compile("^[0-9]{7}$");
            Matcher mat = pat.matcher(numero_cuenta);
            if (!mat.matches()) {
                JOptionPane.showMessageDialog((Component)null, "El numero de cuenta es incorrecto");
                break;
            } else {
                JOptionPane.showMessageDialog((Component)null, "El numero de cuenta es correcto");
            }
            String saldo = JOptionPane.showInputDialog(null, "Ingrese el saldo");
            saldo_inicial= Integer.parseInt(saldo);
            movimientos();

            JOptionPane.showMessageDialog((Component)null, "Saldo actualizado de la cuenta "+ numero_cuenta+" del cliente " +nombre +" el dia " + fecha_de_hoy + " es de "+ saldo_inicial);


            cuentas=JOptionPane.showInputDialog("Tienes mas cuentas?");
            cuentas.toLowerCase();


        }while(!cuentas.equalsIgnoreCase("no"));
    }
