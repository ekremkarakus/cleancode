package cleancode;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public class CraftsmanHuman extends Human {

    private int type;

    public CraftsmanHuman(String humanName) {
        super(humanName, null);
    }


    @Override
    public void craftWeapon(WeaponType type) {

        String weaponName = "undefined";
        //Enum sınıfında kurulan yapı ile if else bloğuna gerek kalmadı
        /*
        if (type == WeaponType.knife) {
            weaponName = "knife";
        } else if (type == WeaponType.riffle) {
            weaponName = "riffle";
        } else if (type == WeaponType.sword) {
            weaponName = "sword";
        }
        */
        weapon = new Weapon(type);
        weaponName = weapon.getWeaponName();
        System.out.println(weaponName + " is created by " + getHumanName());
    }
}
