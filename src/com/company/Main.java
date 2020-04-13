package com.company;

public class Main {

    public static void main(String[] args) {
	Boss b = new Boss();
	Weapon weapon = new Weapon();
	b.setDamage(50.6);
	b.setHealth(300);
	b.setSuperAbility(" Superpowers ");
	weapon.setTypeWeapon("Cold Weapon");
	weapon.setWeapon( "Knife ");
	b.setWeapon(weapon);
        System.out.println(b.getDamage() + " " + b.getHealth() + " " + b.getSuperAbility() + " " + weapon.getTypeWeapon() + " " + weapon.getWeapon()
                + " " + b.getWeapon());
    }
}
