package com.company;

public class Farm {
    private String adres;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String ownerName;

    public Farm(String adres, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.adres = adres;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{\n"  +
                "\nCows:" + java.util.Arrays.toString(cows) +
                "\nSheeps:" + java.util.Arrays.toString(sheeps) +
                "\nHorses:" + java.util.Arrays.toString(horses) +
                "\nAdres=" + adres +
                "\nOwnerName:" + ownerName;
    }
}
