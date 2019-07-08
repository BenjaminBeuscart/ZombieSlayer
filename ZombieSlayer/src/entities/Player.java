package entities;

import java.util.Random;

public class Player extends Character {

    public Player(int id, String name, int hp) {
        super(id, name, hp);
    }

    public void attack(Enemy enemy) {
        Random random = new Random();
        double hit = random.nextDouble();
        if (hit <= this.getCurrentWeapon().getAccuracy()) {
            if (enemy.getHp() >= this.getCurrentWeapon().getDamage()) {
                enemy.setHp(enemy.getHp() - this.getCurrentWeapon().getDamage());
                System.out.println(this.getName() + " attacks " + enemy.getName() +" : Hit ! (-" + this.getCurrentWeapon().getDamage() + " hp)");
            }
            else {
                int tmpHp = enemy.getHp();
                enemy.setHp(0);
                System.out.println(this.getName() + " attacks " + enemy.getName() +" : Hit ! (-" + tmpHp + " hp)");
                enemy.die();
            }
        }
        else {
            System.out.println(this.getName() + " attacks " + enemy.getName() + " : Miss !");
        }
    }

    @Override
    public void die() {
        this.setHp(0);
        System.out.println("You died !");
    }
}
