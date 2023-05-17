package kg.geeks.hw6.templates;
public class GameEntity {
    private int health;
    private int damage;;
    private WeaponType weaponType;
    private Weapon weaponName;
    public int getHealth() {
        return health;
    }
    public int getDamage() {return damage;}

    public void setHealth(int newHealth){
        if (newHealth > 0) {
            this.health = newHealth;
        } else {
            System.out.println("Can't be zero or lower");
        }
    }
    public void setDamage(int newDamage){
        if (newDamage > 0) {
            this.damage = newDamage;
        } else {
            System.out.println("Can't be zero or lower");
        }
    }
    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
    public String info() {
        return "Health: " + this.health + "Damage: " + this.damage + " Weapon Type: "
                + this.weaponType.getCode();
    }
}