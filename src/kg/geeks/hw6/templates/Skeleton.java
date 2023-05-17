package kg.geeks.hw6.templates;

public class Skeleton extends Boss {
    private int arrowQuantity;
    public Skeleton(int health, int damage, Weapon weapon, String defenceType, int arrowQuantity) {
        super(health, damage, weapon,defenceType);
        this.arrowQuantity = arrowQuantity;
    }

    public int getArrowQuantity() {
        return arrowQuantity;
    }
    public void setArrowQuantity(int newArrowQuantity){
        if (newArrowQuantity >= 0) {
            this.arrowQuantity = newArrowQuantity;
        } else{
            System.out.println("Can't be lower than zero");
        }
    }
    @Override
    public String printinfo() {
        return super.printinfo() + " Arrow Quantity: " + this.arrowQuantity;
    }
}
