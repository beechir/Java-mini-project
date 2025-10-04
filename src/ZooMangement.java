public class ZooMangement {

    private int nbrCages =20;
    private String zooName = "my zoo";

    public ZooMangement() {}
    public ZooMangement(int nbrCages, String zooName) {}

    public int getNbrCages(){
        return nbrCages;
    }
    public void setNbrCages(int nbrCages){
        this.nbrCages = nbrCages;
    }

    public String getzooName (){
        return zooName;
    }

    public void setzooName(String zooName){
        this.zooName = zooName;
    }
}
