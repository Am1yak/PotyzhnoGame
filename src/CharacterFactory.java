import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, CharacterType> characters = new HashMap<String, CharacterType>();

    public CharacterType getCharacterType(String name, int health, int attack) {
        CharacterType character = characters.get(name);
        if (character == null) {
            character = new CharacterType(name, health, attack);
            characters.put(name, character);
        }
        return character;
    }
}
