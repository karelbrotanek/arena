package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String name;
    private int zivoty;
    private int startzivoty;
    private int minidmg;
    private int maxidmg;

    public Gladiator(){
        name = " ";
        zivoty = 10;
        startzivoty = 10;
        minidmg = 1;
        maxidmg = 5;
    }

    public int getMaxidmg() {
        return maxidmg;
    }

    public int getMinidmg() {
        return minidmg;
    }

    public int getStartzivoty() {//zjistime hodnotu stat zivotu
        return startzivoty;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setMaxidmg(int maxidmg) {
        this.maxidmg = maxidmg;
    }

    public void setMinidmg(int minidmg) {
        this.minidmg = minidmg;
    }

    public void setStartzivoty(int startzivoty) {
        this.startzivoty = startzivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }

    /**
     * @return true if hp is <= 0, else false
     */
    public boolean isDead() {
        if (zivoty <= 0){
            return true;
        }
        return false;
    }

    /**
     * Generates a random value between min. damage and max. damage and deals it to the enemy.
     * @param enemy Enemy gladiator
     */
    public void dealDamage(Gladiator enemy) {
        Random r = new Random();
        int dmg = r.nextInt(maxidmg - minidmg) + minidmg;//vygeneruje nahodfny cislo v rozsahu
        enemy.setZivoty(enemy.getZivoty() - dmg);//odebira zivoty
        System.out.println(name + " útočí s úderem za " + dmg + " hp");

    }
    public String toString() {
        String str = name + " [";
        for (int i = 0; i < zivoty; i++) {
            str = str + "#";
        }
        for (int i = zivoty; i < startzivoty; i++) {
            str = str+" ";//pridave k jmenu mezeru
        }
        str = str+"]";
        return str;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
