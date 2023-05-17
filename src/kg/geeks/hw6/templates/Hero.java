package kg.geeks.hw6.templates;
public class Hero extends GameEntity {
    private String ultimate;

    public Hero(int health, int damage) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
    }
    public String getUltimate(){return this.ultimate;}
}