import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static int saldo_inicial = 0;

    public static void main(String[] args) {
    }
    public static void Imposicion(){
        String imposiciones = JOptionPane.showInputDialog(null, "Ingrese de cuanto a sido la imposicion");
        String fecha_imposicion = JOptionPane.showInputDialog("Ingrese que dia a sido la imposicion(dd/mm/yyyy)");
        LocalDate fecha_imp = LocalDate.parse(fecha_imposicion, dtf);


        int imposicion = Integer.parseInt(imposiciones);
        saldo_inicial = saldo_inicial + imposicion;
        JOptionPane.showMessageDialog(null, imposicion + " imposicion "+ fecha_imp);
    }
}