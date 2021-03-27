package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.*;
import java.util.ArrayList;

/**
 * Utils class that saves and loads gladiators.
 */
public class GladiatorDatabase {
    private ArrayList<Gladiator> seznambojovniku = new ArrayList<Gladiator>();
    public GladiatorDatabase(){

    }
    /**
     * @param filename path to the gladiator file.
     * @return loaded Gladiator
     */
    public static Gladiator loadGladiator(String filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gladiator gladiator = new Gladiator();
        try {
            String radek = br.readLine();
            String[] polozky = radek.split(";");
            gladiator.setName(polozky[0]);
            gladiator.setZivoty(Integer.parseInt(polozky[1]));// pretipuje String na Int a zapise na index1
            gladiator.setMinidmg(Integer.parseInt(polozky[2]));
            gladiator.setMaxidmg(Integer.parseInt(polozky[3]));
            System.out.println("načten nový gladiátor: " + gladiator.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gladiator;
    }

    /**
     * Saves the gladiator.
     * @param filename path to save too.
     * @param gladiator Gladiator to save.
     */
    public static void saveGladiator(String filename, Gladiator gladiator) {
        // TODO:
        throw new UnsupportedOperationException();
    }

}
