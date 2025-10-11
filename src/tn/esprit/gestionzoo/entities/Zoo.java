public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo(){

    }

    Zoo(String name,String city,int nbrCages){
        if (name==null){
            System.out.println("name supposed to be not null");
        }
        else {
            this.name = name;
        }
        this.city=city;
        this.nbrCages=nbrCages;
    }

    public void setanimals(Animal[] animals){
        this.animals=animals;
    }
    public Animal[] getanimals(){
        return this.animals;
    }
    public void setname(String name){
        this.name = name ;
    }

    public String getname () {
        return this.name;
    }

    public void setcity(String city){
        this.city = city;
    }

    public String getcity() {
        return this.city;
    }

    public int getNbrCages(){
        return this.nbrCages;
    }

    public void setNbrCages(int nbrCages){
        this.nbrCages = nbrCages;
    }

    public void displayZoo(){
        System.out.println(        "zoo name : "+this.name+"\nzoo city : "+ this.city + "\ncages number : "+this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean add_animal(Animal animal){
        //ajouter an animale dans le tableau animales dans la fin the table
       if(isZooFull()){
            System.out.println("Zoo is full");
        }
       else {
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                return true;
            }
        }
        }
        return false;

    }

    public void showAllAnimals(){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] != null) {
                System.out.println(this.animals[i].toString());
            } else {
                System.out.println("null");
            }
        }
    }
    public int searchAnimal(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i].getname() == animal.getname()){
                return i;
            }

        }
        return -1;

        }

    public void removeAnimal(Animal animal){
        int x = this.animals.length;
        int i = searchAnimal(animal);
        this.animals[i]=null;
    }

    public Zoo comarerZoo(Zoo zoo1 , Zoo zoo2){
        int z1NbrAnimals = 0,  z2NbrAnimals =0;
        for (int i = 0; i < this.animals.length; i++) {
            if (zoo1.animals[i] != null) {
                z1NbrAnimals ++;
            }
            if (zoo2.animals[i] != null) {
                z2NbrAnimals ++;
            }
        }
        if (z1NbrAnimals > z2NbrAnimals){
            return zoo1;
        }
        return zoo2;
        }
    public boolean isZooFull(){
        for (int i = 0; i < this.animals.length; i++){
            if (this.animals[i] == null) {
                return false;
            }
        }
        return true;
    }
}
