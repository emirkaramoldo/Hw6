package kg.geeks.hw6.templates;

public class Weapon {
    private String weaponName;
    private WeaponType weaponType;

    public String getWeaponName(){return weaponName;}
    public WeaponType getWeaponType() {return weaponType;}
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public void setWeaponType(WeaponType weaponType) {this.weaponType = weaponType;}
}
