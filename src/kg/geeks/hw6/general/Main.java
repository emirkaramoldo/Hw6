package kg.geeks.hw6.general;
import kg.geeks.hw6.templates.Hero;
import kg.geeks.hw6.templates.Boss;
import kg.geeks.hw6.templates.WeaponType;

public class Main {
    public static void main(String[] args) {
        Boss boss= new Boss(700,50, WeaponType.MAGICAL, "Physical");
        System.out.println(boss.info());
//        Boss firstBoss = new Boss();
//        firstBoss.setHealth(700);
//        firstBoss.setDamage(50);
//        firstBoss.setDefenceType("Magical");
//        System.out.println("Boss health: " + firstBoss.getHealth() + " Boss damage: " + firstBoss.getDamage() +
//                " Boss defence type: " + firstBoss.getDefenceType());
    }
}