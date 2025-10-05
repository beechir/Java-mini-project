import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Création d'une objet zooMangement
      /*  ZooMangement z1 = new ZooMangement();
        Scanner input = new Scanner(System.in);
        System.out.println("Saisir le nom de zoo");
        String zooName = input.nextLine();
        System.out.println("Saisir le nobre de cages de zoo");
        int nbrCage = input.nextInt();
        z1.setzooName(zooName);
        z1.setNbrCages(nbrCage);
        System.out.printf(z1.getzooName()+" comporte "+z1.getNbrCages()+" cages");*/

        //Création des objets Animal et Zoo
        Animal animal =new Animal();
        animal.setfamily("lion");
        animal.setname("samir");
        animal.setage(10);
        animal.setmammal(true);
        Animal[] animals=new Animal[1];
        animals[0]=animal;

        Zoo zoo =new Zoo();
        zoo.setanimals(animals);
        zoo.setname("my zoo");
        zoo.setcity("mallesin");
        zoo.setNbrCages(20);

        Animal[] animals1=new Animal[1];


        Animal animal1 =new Animal("lion","samir",10,true);
        Animal animal2 =new Animal("lion","samir",10,true);
        Animal animal3 =new Animal("lion","samir",10,true);
        Zoo zoo1 =new Zoo("belveder","kabereya",20);
        zoo1.setanimals(animals1);

        //zoo.displayZoo();
       // zoo1.displayZoo();
        System.out.println(zoo.toString());
        System.out.println(animal1.toString());

    }
}