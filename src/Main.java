public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        ConcreteCharacter mage = new ConcreteCharacter(factory.getCharacterType("Mage", 75, 30));
        ConcreteCharacter warrior = new ConcreteCharacter(factory.getCharacterType("Warrior", 100, 20));

        ArenaNotifier notifier = new ArenaNotifier();
        notifier.addObserver(mage);
        notifier.addObserver(warrior);

        ConcreteArena arena = new ConcreteArena(notifier);
        arena.proccessFight(mage, warrior);
    }
}