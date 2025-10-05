public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo(){

    }

    Zoo(String name,String city,int nbrCages){
        this.name=name;
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

}
