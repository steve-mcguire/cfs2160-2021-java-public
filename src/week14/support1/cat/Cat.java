package week14.support1.cat;

public class Cat {
    private int mood = 50;
    private int hungry = 50;
    private int energy = 50;

    private int legs;
    private String name;

    public void sleep() {
        System.out.println("Sleep ...");
        energy++;
        hungry++;
    }

    public void play() {
        System.out.println("Play ...");
        mood++;
        energy--;
        hungry++;
        meow();
    }

    public void feed() {
        System.out.println("Feed ...");
        hungry--;
        mood++;
        energy++;
        meow();
    }

    private void meow() {
        System.out.println("Meow!");
    }

    public int getMood() {
        return mood;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }

}
