public class Krasnolud extends Postac{
    public Krasnolud (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Krasnolud o imieniu " + getImie() + " przebiegl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Krasnolud";
    }
}