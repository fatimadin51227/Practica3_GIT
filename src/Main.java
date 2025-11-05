//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static void mostrarResumen(String nombre, String numeroCuenta, int saldoFinal) {
        String resumen = "📋 RESUMEN DE CUENTA\n\n" +
                "Cliente: " + nombre + "\n" +
                "Número de cuenta: " + numeroCuenta + "\n" +
                "Fecha actual: " + fecha_de_hoy.format(dtf) + "\n" +
                "Saldo actual: " + saldoFinal + " €";
        JOptionPane.showMessageDialog(null, resumen, "Resumen de Cuenta", JOptionPane.INFORMATION_MESSAGE);
    }
}
