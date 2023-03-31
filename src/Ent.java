public class Ent extends Postac{
    public Ent (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Ent o imieniu " + getImie() + " kroczyl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Ent";
    }
}
