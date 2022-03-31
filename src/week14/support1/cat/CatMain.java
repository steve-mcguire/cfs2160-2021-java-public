package week14.support1.cat;

public class CatMain {
    public static void main(String[] args) {

        Cat harry = new Cat();


        System.out.println("Starting values");
        System.out.println("Energy: " + harry.getEnergy());
        System.out.println("Mood: " + harry.getMood());
        System.out.println("Hungry: " + harry.getHungry());

        System.out.println("\nCat feeds");
        harry.feed();
        System.out.println("Energy: " + harry.getEnergy());
        System.out.println("Mood: " + harry.getMood());
        System.out.println("Hungry: " + harry.getHungry());

        System.out.println("\nCat plays");
        harry.play();
        System.out.println("Energy: " + harry.getEnergy());
        System.out.println("Mood: " + harry.getMood());
        System.out.println("Hungry: " + harry.getHungry());

        System.out.println("\nCat feeds");
        harry.feed();
        System.out.println("Energy: " + harry.getEnergy());
        System.out.println("Mood: " + harry.getMood());
        System.out.println("Hungry: " + harry.getHungry());

        System.out.println("\nCat sleeps");
        harry.sleep();
        System.out.println("Energy: " + harry.getEnergy());
        System.out.println("Mood: " + harry.getMood());
        System.out.println("Hungry: " + harry.getHungry());

    }

}
