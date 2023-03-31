public class Krol extends Postac{
    public Krol (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Krol o imieniu " + getImie() + " przeszedl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Krol";
    }
}
