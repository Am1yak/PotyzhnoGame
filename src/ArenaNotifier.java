import java.util.ArrayList;
import java.util.List;

public class ArenaNotifier {
    private List<ConcreteCharacter> observers = new ArrayList<ConcreteCharacter>();

    public void addObserver(ConcreteCharacter observer) {
        observers.add(observer);
    }

    public void removeObserver(ConcreteCharacter observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ConcreteCharacter observer : observers) {
            System.out.println(observer.name + ": Battle begins on arena!");
        }
    }
}
