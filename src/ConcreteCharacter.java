public class ConcreteCharacter extends Character {
    int health;
    int atack;
    int maxHealth;
    public String name;

    public ConcreteCharacter(CharacterType type) {
        maxHealth = type.maxHealth;
        atack = type.damage;
        name = type.name;
    }

    @Override
    void heal(){
        health = maxHealth;
    }

    @Override
    void takeDamage(int damage) {
        health -= damage;
    }
}
