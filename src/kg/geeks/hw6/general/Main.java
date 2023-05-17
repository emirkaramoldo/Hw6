package kg.geeks.hw6.general;
import kg.geeks.hw6.templates.*;

public class Main {
    public static void main(String[] args) {
        Boss boss= new Boss(700, 50, ,"Magical");



        Skeleton skeleton = new Skeleton(200,15, "" "Physical", 10);
        Skeleton skeleton1 = new Skeleton(150,10,"" ,"Magical", 8);
        System.out.println(boss.printinfo());
        System.out.println(skeleton.printinfo());
        System.out.println(skeleton1.printinfo());
    }
}