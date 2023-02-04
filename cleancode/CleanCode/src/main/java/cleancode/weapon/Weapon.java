package cleancode.weapon;

/**
 *  A <code>Weapon</code> is a weapon.
 * This class simulates a weapon. It has a default constructor that creates a wepaon
 * and usage Human types
 * <p>
 * This class has methods to get weapon name and weapon type
 *
 * @author Ekrem Karakus
 * @version 1.0.1
 * @since 1.0.1
 */
public class Weapon {

    String weaponName;
    WeaponType type;

    public Weapon( WeaponType type) {
        // if else yapısından kurtarmak için gelen type a göre name alanının okunması
        this.weaponName = type.name();
        //this.weaponName = weaponName;
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
