/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author crazyiot
 */
public class CSVLogic {
    //CAMBIAR PATH PARA QUE SIRVA EL PROGRAMA, SINO VA A TIRAR EXCEPCION

    String csvFile = "INSERTE PATH A CSV AQUI";
    BufferedReader br = null;
    String line = "";
    String SplitBy = ",";
    private boolean SignedIn = false;
    private boolean Authenticating = false;

    public void Reader(String a, String b) {
        try {
            Authenticating = true;
            br = new BufferedReader(new FileReader(csvFile));
            while (((line = br.readLine()) != null) && !SignedIn) {

                // use comma as separator
                String[] eachUser = line.split(SplitBy);

                String userTemp = eachUser[0];
                String passTemp = eachUser[1];

                if ((a.equalsIgnoreCase(eachUser[0])) && b.equalsIgnoreCase(eachUser[1])) {  
                    JOptionPane.showMessageDialog(null, "Usuario aceptado");
                    SignedIn = true;
                    
                }

            }
            Authenticating = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "En este momento no podemos atender la solicitud");
        } finally {
            if (!SignedIn && !Authenticating) {
                JOptionPane.showMessageDialog(null, "El usuario o la clave estan equivocadas.");
            }
           
        }
    }


}
