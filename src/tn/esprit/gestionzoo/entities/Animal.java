public class Animal {
private String family;
private String name;
private int age ;
private boolean isMammal;

Animal(){

}

Animal(String family, String name, int age , boolean isMammal){
    this.family = family;
    this.name = name;
    if(age<0){
        System.out.println("age supposed to be positive");
    }
    else {
        this.age = age;
    }

    this.isMammal = isMammal;
    }



public String getfamily(){
    return this.family;
}

public void setfamily(String family){
    this.family = family ;
}

public String getFamily(){
    return this.family;
}

public void setname(String name){
    this.name =name ;
}

public String getname(){
    return this.name;
}

public void setage(int age){
    this.age = age ;
}

public int getage(){
    return this.age;
}

public boolean ismammal(){
    return this.isMammal;
}
public void setmammal(boolean ismammal){
    this.isMammal = ismammal;
}

@Override
public String toString() {
    return "Animal{" +
            "family='" + family + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", isMammal=" + isMammal +
            '}';
}



}
