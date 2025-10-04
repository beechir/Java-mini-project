import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooMangement z1 = new ZooMangement();
        Scanner input = new Scanner(System.in);
        System.out.println("Saisir le nom de zoo");
        String zooName = input.nextLine();
        System.out.println("Saisir le nobre de cages de zoo");
        int nbrCage = input.nextInt();
        z1.setzooName(zooName);
        z1.setNbrCages(nbrCage);
        System.out.printf(z1.getzooName()+" comporte "+z1.getNbrCages()+" cages");


    }
}