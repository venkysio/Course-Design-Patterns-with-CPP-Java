package org.designpattern.prototype;

public class TestingCloning {

    public  static  void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep(2);
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);

        System.out.println(clonedSheep);
        System.out.println("sally hash" + System.identityHashCode(sally));
        System.out.println("sally hash" + System.identityHashCode(clonedSheep));

    }
}

