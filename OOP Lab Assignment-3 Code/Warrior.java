public class Warrior extends GameCharacter {

    public Warrior(String name, int level, int experience) {
        super(name, level, experience);
        System.out.println("Character Created: " + name);
        showStats();
        System.out.println();
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks fiercely with a sword!");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends with a shield!");
    }

    @Override
    public void gainExperience(int points) {
        System.out.println("Experience gained: " + points);
        this.experience += points;

        // Check for level up
        if (experience >= 100) {
            level++;
            System.out.println("Level up! " + name + " reached Level " + level);
            experience = experience - 100; // Subtract 100, don't reset to 0
        }
    }
}