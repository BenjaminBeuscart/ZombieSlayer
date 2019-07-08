package entities;

public class Weapon {
	private int id;
    private String name;
    private int damage;
    private double accuracy;

    public Weapon(int id, String name, int damage, double accuracy) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int getId() {
        return id;
    }
    private String getName() { return name; }
    public int getDamage() {
        return damage;
    }
    public double getAccuracy() {
        return accuracy;
    }

    @Override
    public String toString() {
        return "weapon{" + id +
                " name=" + name +
                ", damage=" + damage +
                ", accuracy=" + accuracy +
                "}";
    }
}
