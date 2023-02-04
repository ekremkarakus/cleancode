package cleancode.weapon;

public enum WeaponType {
    // if else yapısından kurtarmak için gelen type a göre name alanının okunması gerçeklendi
    knife ("knife"),
    sword ("sword"),
    riffle ("riffle");

    private final String name;
    WeaponType(String name) {
        this.name = name;
    }
    private String getName() { return name; }

}
