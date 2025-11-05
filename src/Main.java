import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
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