public class Chlop extends Postac{
    public Chlop (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Chlop o imieniu " + getImie() + " przeszedl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Chlop";
    }
}