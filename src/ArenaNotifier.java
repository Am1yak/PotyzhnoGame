import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ArenaNotifier {
    private List<Character> observers = new ArrayList<Character>();

    public void addObserver(Character observer) {
        observers.add(observer);
    }

    public void removeObserver(Character observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Character observer : observers) {
            System.out.println(observer.name + ": Battle begins on arena!");
        }
    }
}
