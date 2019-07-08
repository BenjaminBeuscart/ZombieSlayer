package entities;

import java.util.Random;


public class Enemy extends Character {

    public Enemy(int id, String name, int hp) {
        super(id, name, hp);
    }

    public void attack(Player player) {
        Random random = new Random();
        double hit = random.nextDouble();
        if (hit <= this.getCurrentWeapon().getAccuracy()) {
            if (player.getHp() >= this.getCurrentWeapon().getDamage()) {
                player.setHp(player.getHp() - this.getCurrentWeapon().getDamage());
                System.out.println(this.getName() + " attacks " + player.getName() +" : Hit ! (-" + this.getCurrentWeapon().getDamage() + " hp)");
            }
            else {
                int tmpHp = player.getHp();
                player.setHp(0);
                System.out.println(this.getName() + " attacks " + player.getName() +" : Hit ! (-" + tmpHp + " hp)");
                player.die();
            }
        }
        else {
            System.out.println(this.getName() + " attacks " + player.getName() + " : Miss !");
        }
    }

    @Override
    public void die() {
        this.setHp(0);
        System.out.println(this.getName() + " dies.");
    }
}
