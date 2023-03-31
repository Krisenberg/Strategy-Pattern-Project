public class Ork extends Postac{
    public Ork (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Ork o imieniu " + getImie() + " przemaszerowal do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Ork";
    }
}
