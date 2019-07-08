package entities;

public abstract class Character {
    private int id;
    private int hp;
    private String name;
    private Weapon currentWeapon;

    public Character(int id, String name, int hp) {
        this.id = id;
        this.hp = hp;
        this.name = name;
        this.currentWeapon = new Weapon(0, "Fist", 1, 1.0);
    }

    public Character(int id, String name, int hp, Weapon currentWeapon) {
        this.id = id;
        this.hp = hp;
        this.name = name;
        this.currentWeapon = currentWeapon;
    }

    public int getId() {
        return id;
    }
    public int getHp() {
        return hp;
    }
    public String getName() {
        return name;
    }
    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public String toString() {
        return "Character{" + id +
                ", name='" + name +
                ", hp=" + hp +
                "}";
    }

    public abstract void die();
}
