public abstract class GameCharacter implements CharacterActions {
    protected String name;
    protected int level;
    protected int experience;

    // Constructor
    public GameCharacter(String name, int level, int experience) {
        this.name = name;
        this.level = level;
        this.experience = experience;
    }

    // Concrete method to show stats
    public void showStats() {
        System.out.println("Level: " + level + " | Experience: " + experience);
    }

    // Abstract methods to be implemented by subclasses
    public abstract void attack();
    public abstract void defend();
}