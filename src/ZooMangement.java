public class ZooMangement {

    private int nbrCages =20;
    private String zooName = "my zoo";

    public ZooMangement() {}
    public ZooMangement(int nbrCages, String zooName) {}

    public int getNbrCages(){

        return this.nbrCages;
    }
    public void setNbrCages(int nbrCages){
        this.nbrCages = nbrCages;
    }

    public String getzooName (){
        return this.zooName;
    }

    public void setzooName(String zooName){
        this.zooName = zooName;
    }
}
