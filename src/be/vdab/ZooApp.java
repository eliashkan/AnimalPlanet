package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.zoo.BirdZoo;

import java.util.Arrays;

public class ZooApp {
    public static void main(String[] args) {
        BirdZoo paradisio = new BirdZoo();
        Cockatiel fatou = new Cockatiel();
        Cockatiel sdf = new Cockatiel();
        Cockatiel qs = new Cockatiel();
        Cockatiel g = new Cockatiel();

        fatou.setName("Fatou");

        paradisio.addAnimal(fatou);
        paradisio.addAnimal(sdf);
        paradisio.addAnimal(qs);
        paradisio.addAnimal(g);

        for (Cockatiel element : paradisio.getCockatiels()) {
            System.out.println(element);
        }
    }
}
