public class Smok extends Postac{
    public Smok (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Smok o imieniu " + getImie() + " przelecial do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Smok";
    }
}
