public class Czarodziej extends Postac{
    public Czarodziej (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Czarodziej o imieniu " + getImie() + " przeszedl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Czarodziej";
    }
}
