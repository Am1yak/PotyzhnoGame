public class ConcreteArena {
    private ArenaNotifier arenaNotifier;

    public void proccessFight(Character rival1, ConcreteCharacter rival2){
        arenaNotifier.notifyObservers();
        while (rival1.health >= 0 || rival2.health >= 0){
            rival1.health -= rival2.atack;
            rival2.health -= rival1.atack;
        }
        if (rival1.health >= 0){
            System.out.println("Wins " + rival1.name);
        } else {
            System.out.println("Wins " + rival2.name);
        }
    }
}
