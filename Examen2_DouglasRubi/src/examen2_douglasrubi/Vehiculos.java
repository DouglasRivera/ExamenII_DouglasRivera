/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrubi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author river
 */
public class Vehiculos {
    String VIN;
    String Color;
    Bateria Bateria ;
    String Carroceria;
    Infoentretenimiento Info;
    Interior Interior;
    File Archivo;
    public Vehiculos() {
    try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Vehiculos.txt");
        } catch (IOException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Vehiculos(String VIN, String Color, Bateria Bateria, String Carroceria, Infoentretenimiento Info, Interior Interior) {
        this.VIN = VIN;
        this.Color = Color;
        this.Bateria = Bateria;
        this.Carroceria = Carroceria;
        this.Info = Info;
        this.Interior = Interior;
        try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Vehiculos.txt");
        } catch (IOException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCarroceria() {
        return Carroceria;
    }

    public void setCarroceria(String Carroceria) {
        this.Carroceria = Carroceria;
    }

    public Bateria getBateria() {
        return Bateria;
    }

    public void setBateria(Bateria Bateria) {
        this.Bateria = Bateria;
    }

    public Infoentretenimiento getInfo() {
        return Info;
    }

    public void setInfo(Infoentretenimiento Info) {
        this.Info = Info;
    }

    public Interior getInterior() {
        return Interior;
    }

    public void setInterior(Interior Interior) {
        this.Interior = Interior;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    public String toString() {
        return VIN + " - : " + Carroceria;
    }
    public void ReadFileScanner(File archivo) {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
    
    
     public void ReadFileScanner() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
        }
        sc.close();
    }
     
     public ArrayList<Vehiculos> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<Vehiculos> vehiculos = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                System.out.println(temp);
                System.out.println(temp.split(",").length);
                String[] next = temp.split(","); 
                vehiculos.add(new Vehiculos(next[3], next[2], Bateria, next[1], Info, Interior));
                
                // .out.println(next);
               
            }
            return vehiculos;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return vehiculos;
        } finally {
             sc.close();
        }
        
    }
    
    public void WriteFile(String VIN, String Color, Bateria Bateria, String Carroceria, Infoentretenimiento Info, Interior Interior) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(VIN + "," + Color + "," + Bateria + "," + Carroceria + "," + Info + "," + Interior);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
    public void WriteFile() {
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(VIN + "," + Color + "," + Bateria + "," + Carroceria + "," + Info + "," + Interior);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<Vehiculos> vehiculos) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Vehiculos vehiculo : vehiculos) {
            bw.write(vehiculo.getVIN()+ "," + vehiculo.getColor()+ "," + vehiculo.getBateria() + "," + vehiculo.getCarroceria()+ "," + vehiculo.getInfo()+ "," + vehiculo.getInterior());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
    
    
}
