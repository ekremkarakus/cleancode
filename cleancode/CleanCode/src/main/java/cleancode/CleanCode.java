package cleancode;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public class CleanCode {

    public static void main(String[] args) {

        /*
           craftsmanHuman and warriorHuman objects are loosely coupled.
           It means Human is an abstract and we can inject any of the implemented classes at run time (Dependency Injection)
         */
        Human craftsmanHuman = new CraftsmanHuman("Craftsman");

        craftsmanHuman.craftWeapon(WeaponType.knife);

        Weapon weapon = craftsmanHuman.getWeapon();

        Human warriorHuman = new WarriorHuman("Warrior", weapon);

        warriorHuman.useWeapon();
    }

}
