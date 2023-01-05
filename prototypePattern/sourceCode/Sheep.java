package org.designpattern.prototype;

public class Sheep implements Animal {

    int j =1;

    public Sheep(int j) {
        this.j = j;
        System.out.println("Sheep is made");
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public Animal makecopy()  {
        System.out.println("Sheep is made");
        Sheep sheepobj = null;
        try {
            sheepobj = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheepobj;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "j=" + j +
                '}';
    }
}
