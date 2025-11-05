import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercio4 {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static LocalDate fecha_de_hoy = LocalDate.now();
    static int saldo_inicial;

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

        public static void Reintegro() {
            String reintegros = JOptionPane.showInputDialog(null, "Ingrese de cuánto a sido el reintegro");
            int reintegro = Integer.parseInt(reintegros);
            if (reintegro > saldo_inicial) {
                JOptionPane.showMessageDialog(null, "Error: saldo insuficiente");
            } else {
                saldo_inicial = saldo_inicial - reintegro;
            }
            String fecha_reintegro = JOptionPane.showInputDialog("Ingrese que dia a sido la imposicion(dd/mm/yyyy)");
            LocalDate fecha_rei = LocalDate.parse(fecha_reintegro, dtf);
            JOptionPane.showMessageDialog(null, reintegro + " imposicion "+ fecha_rei);
            saldo_inicial = saldo_inicial - reintegro;
        }
public static void movimientos(){
        String movimientos;
        do{
            movimientos = JOptionPane.showInputDialog(null, "Que tipo de movimiento a hecho?(Introduzca el numero) \n " +
                    "0. Ninguno\n" +
                    "1. Imposicion\n" +
                    "2. Reintegro");
            switch(movimientos){
                case "0":
                    JOptionPane.showMessageDialog(null, "0");
                    break;
                case "1":
                    Imposicion();
                    break;
                case "2":
                    Reintegro();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        }while(!movimientos.equalsIgnoreCase("0"));
    }

}

