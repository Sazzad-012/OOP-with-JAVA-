public class GameSystem {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragon", 1, 0);

        warrior.attack();
        warrior.gainExperience(40);
        System.out.println();

        warrior.defend();
        System.out.println();

        warrior.attack();
        warrior.gainExperience(60);
        System.out.println();

        System.out.println("Final Stats:");
        System.out.println("Name: " + warrior.name + " | Level: " + warrior.level + " | Experience: " + warrior.experience);
    }
}