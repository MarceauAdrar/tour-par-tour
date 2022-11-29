package classes;

import java.util.List;

public class Character {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private boolean isDefending;
    private boolean isSpiritSpawned;
    private List<Object> objects;

    public Character(String name, int hp, int attack, int defense, boolean isDefending, boolean isSpiritSpawned, List<Object> objects) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.isDefending = isDefending;
        this.isSpiritSpawned = isSpiritSpawned;
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isDefending() {
        return isDefending;
    }

    public void setDefending(boolean defending) {
        isDefending = defending;
    }

    public boolean isSpiritSpawned() {
        return isSpiritSpawned;
    }

    public void setSpiritSpawned(boolean spiritSpawned) {
        isSpiritSpawned = spiritSpawned;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
