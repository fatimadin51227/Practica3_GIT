//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}