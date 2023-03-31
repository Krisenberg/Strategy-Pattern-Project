public class Elf extends Postac{
    public Elf (String imie){
        super(imie);
    }

    public void idzDoPrzodu(int liczbaHeksow){
        System.out.println("Elf o imieniu " + getImie() + " przeskoczyl do przodu " + liczbaHeksow + " heksy/heksow.");
    }
    public String typPostaci(){
        return "Elf";
    }
}
