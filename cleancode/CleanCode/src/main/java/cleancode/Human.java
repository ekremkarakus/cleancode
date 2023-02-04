package cleancode;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public abstract class Human {

    public String humanName;
    public Weapon weapon;

    /**
     * Human constructor method
     * @param humanName is name of Human
     * @param weapon is attribute of Humans weapon
     * @return Human.
     */
    public Human(String humanName, Weapon weapon) {
        this.humanName = humanName;
        this.weapon = weapon;
    }

    public String getHumanName() {
        return humanName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    //abstract kaldırıldı çünkü türetilen sınıflarda kullanılmadığı sınıf var ve gereksiz implemnte edilmek zorunda kalmakta idi
    // extend aldığı sınıflarda implemente edilmeyen methodlar kaldırıldı
    // memory performansı arttırıldı
    public void useWeapon() {

    }

    public void craftWeapon(WeaponType type) {

    }
}
