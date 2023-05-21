package kg.geeks.hw6.templates;
public class Boss extends GameEntity {
    private String defenceType;
    private final Weapon weapon = new Weapon();

    public Boss(int health, int damage, String defenceType) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.defenceType = defenceType;
    }
    public Weapon getWeapon(){return this.weapon;}
    public String getDefenceType(){return this.defenceType;}
    public void setWeapon(String weapon){weapon = weapon;}
    public void setDefenceType(String newDefenceType){
        if (newDefenceType != null) {
            this.defenceType = newDefenceType;
        } else {
            System.out.println("Can't be empty");
        }
    }
    @Override
    public String printinfo() {
        return super.printinfo() + " Defence Type: " + this.defenceType + this.weapon.getWeaponType();
    }
}