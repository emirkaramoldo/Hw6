package kg.geeks.hw6.templates;
public class Boss extends GameEntity {
    private String defenceType;
    public Boss(int health, int damage, WeaponType weaponType, String defenceType) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.setWeaponType(weaponType);
        this.defenceType = defenceType;
    }
    public String getDefenceType(){return this.defenceType;}
    public void setDefenceType(String DefenceType){
        if (DefenceType != null) {
            this.defenceType = DefenceType;
        } else {
            System.out.println("Can't be empty");
        }
    }
    @Override
    public String info() {
        return super.info() + " Defence Type: " + this.defenceType;
    }
}