public class Rycerz extends Postac{
    public Rycerz (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Rycerz o imieniu " + getImie() + " przejechal na koniu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Rycerz";
    }
}
