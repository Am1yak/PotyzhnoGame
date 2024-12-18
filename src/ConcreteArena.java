public class ConcreteArena {
    private ArenaNotifier arenaNotifier;

    public ConcreteArena(ArenaNotifier arenaNotifier) {
        this.arenaNotifier = arenaNotifier;
    }

    public void proccessFight(ConcreteCharacter rival1, ConcreteCharacter rival2){
        arenaNotifier.notifyObservers();
        while (rival1.health >= 0 || rival2.health >= 0){
            rival1.takeDamage(rival2.atack);
            rival2.takeDamage(rival1.atack);
        }
        if (rival1.health >= 0){
            System.out.println("Wins " + rival1.name);
        } else {
            System.out.println("Wins " + rival2.name);
        }
        rival1.heal();
        rival2.heal();
    }
}
