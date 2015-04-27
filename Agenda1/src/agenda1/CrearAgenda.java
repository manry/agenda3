package agenda1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CrearAgenda {

    public static void main(String[] args) {
        final int SI = 0;
        final int NO = 1;
        String fileName = "agenda.txt";
        File fichero = new File(fileName);
        BufferedWriter agenda;
        try {
            if (fichero.exists()) {
                int sino = JOptionPane.showConfirmDialog(null, "El fichero ya existe, ¿desea sobreescribirlo?", "Fichero existe", JOptionPane.WARNING_MESSAGE);
                if (sino == SI) {
                    agenda = new BufferedWriter(new FileWriter(fichero));
                } else {
                    //Añadir elementos al final
                    agenda = new BufferedWriter(new FileWriter(fichero, true));
                }
            } else {
                //Crear el fichero y añadir entradas
                agenda=new BufferedWriter(new FileWriter(fichero));
            }
            agenda.write("IES Galileo");
            agenda.newLine();
            agenda.write("c/ Villabañez s/n");
            agenda.newLine();
            agenda.write("983251436");
            agenda.newLine();
            
            agenda.close();
            
        } catch (IOException e) {

        }
    }
}
