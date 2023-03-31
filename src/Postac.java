public abstract class Postac implements PoruszanieSie, TypPostaci {
    private String imie;
    private PrezentacjaBroni rodzajBroni;
    private Pancerz rodzajPancerza;
    private int atak;
    private int pancerz;

    public Postac(String imie) {
        this.imie = imie;
        this.rodzajBroni = null;
        this.getClass().getName();
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String noweImie) {
        imie = noweImie;
    }

    public int getAtak(){
        return atak;
    }
    public int getPancerz(){
        return pancerz;
    }

    public void przedstawSie() {
        System.out.println("Czesc, jestem " + imie);
    }

    public void setRodzajBroni(PrezentacjaBroni nowaBron){
        rodzajBroni=nowaBron;
        atak= rodzajBroni.statystykaAtaku();
    }
    public void setRodzajPancerza(Pancerz nowyPancerz){
        rodzajPancerza=nowyPancerz;
        pancerz=rodzajPancerza.statystykaPancerza();
    }

    public void wyrzucBron(){
        rodzajBroni=null;
        atak=0;
    }
    public void wyrzucPancerz(){
        rodzajPancerza=null;
        pancerz=0;
    }

    public String typBroni(){
        if (rodzajBroni!=null)
            return rodzajBroni.typBroni();
        return "Gola piesc";
    }
    public String typPancerza(){
        if (rodzajPancerza!=null)
            return rodzajPancerza.typPancerza();
        return "Gole cialo";
    }

    public void statystykaAtaku(){
        if(rodzajBroni!=null){
            System.out.println(imie + " mowi: moja aktualna bron atakuje z siłą: " + atak);
        }
        else{
            System.out.println(imie + " mowi: nie mam broni, wiec atakuje z sila 0");
        }
    }
    public void statystykaPancerza(){
        if(rodzajPancerza!=null){
            System.out.println(imie + " mowi: moj aktualny pancerz chroni mnie z sila: " + rodzajPancerza.statystykaPancerza());
        }
        else {
            System.out.println(imie + " mowi: nie mam pancerza, wiec nic mnie nie chroni");
        }
    }

    public void prezentujBron() {
        if(rodzajBroni!=null){
            System.out.println(imie + " mowi: " + rodzajBroni.prezentujBron());
        }
        else{
            System.out.println(imie + " mowi: Nie mam obecnie zadnej broni");
        }
    }
}

