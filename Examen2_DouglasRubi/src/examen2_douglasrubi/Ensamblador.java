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
public class Ensamblador {

    String nombre;
    String genero;
    int Id; 
    int cant_vehiculos;
    int edad;
    File Archivo;

    public Ensamblador() {
    try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Ensambladores.txt");
        } catch (IOException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Ensamblador(String nombre, String genero, int Id, int cant_vehiculos, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.Id = Id;
        this.cant_vehiculos = cant_vehiculos;
        this.edad = edad;
        try {
            Archivo = new File(new File(".").getCanonicalPath() + "\\src\\Files\\" + "Ensambladores.txt");
        } catch (IOException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCant_vehiculos() {
        return cant_vehiculos;
    }

    public void setCant_vehiculos(int cant_vehiculos) {
        this.cant_vehiculos = cant_vehiculos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
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
     
     public ArrayList<Ensamblador> ReadFileScannerArrayList() {
        Scanner sc = null;//Hacemos lo mismo, leemos con el scanner
        ArrayList<Ensamblador> Ensambladores = new ArrayList<>();
        try {
            sc = new Scanner(Archivo);
            while (sc.hasNext()) {
                String temp = sc.nextLine();
                System.out.println(temp);
                System.out.println(temp.split(",").length);
                String[] next = temp.split(","); 
                Ensambladores.add(new Ensamblador(next[0], next[1], Integer.parseInt(next[2]), Integer.parseInt(next[3]),Integer.parseInt(next[4])));
                
                // .out.println(next);
               
            }
            return Ensambladores;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la lectura.");
            return Ensambladores;
        } finally {
             sc.close();
        }
        
    }
    
    public void WriteFile(String nombre, String genero, int Id, int cant_vehiculos, int edad) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(nombre + "," + genero + "," + Id + "," + cant_vehiculos + "," + edad);
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
            bw.write(nombre + "," + genero + "," + Id + "," + cant_vehiculos + "," + edad);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura.");
        }
    }
    
     public void WriteFileMod(ArrayList<Ensamblador> Ensambladores) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Ensamblador ensambladores : Ensambladores) {
            bw.write(ensambladores.getNombre()+ "," + ensambladores.getGenero()+ "," + ensambladores.getId()+ "," + ensambladores.getCant_vehiculos()+ "," + ensambladores.getEdad());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la escritura");
        }
    }
}
