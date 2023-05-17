package kg.geeks.hw6.templates;
public class Boss extends GameEntity {
    private String defenceType;
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon, String defenceType) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.weapon = weapon;
        this.defenceType = defenceType;
    }
    public Weapon getWeapon(){return this.weapon;}
    public String getDefenceType(){return this.defenceType;}
    public void setWeapon(String newWeapon){this.weapon = weapon;}
    public void setDefenceType(String newDefenceType){
        if (newDefenceType != null) {
            this.defenceType = newDefenceType;
        } else {
            System.out.println("Can't be empty");
        }
    }
    @Override
    public String printinfo() {
        return super.printinfo() + " Defence Type: " + this.weapon.getWeaponName() + this.weapon.getWeaponType() + this.defenceType;
    }
}