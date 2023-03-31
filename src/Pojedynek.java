public class Pojedynek {
    private Postac postac1;
    private Postac postac2;

    public Pojedynek (Postac postac1, Postac postac2){
        this.postac1=postac1;
        this.postac2=postac2;
    }

    public void wstep (){
        System.out.println("A wiec czas na pojedynek. Oko w oko staja ze soba:");
        System.out.println(postac1.typPostaci() + " o imieniu " + postac1.getImie() + " i " + postac2.typPostaci() + " o imieniu " + postac2.getImie());
        System.out.println();
    }

    public void statystyki(){
        System.out.println("Statystyki postaci " + postac1.typPostaci() + " " + postac1.getImie() + " to:");
        System.out.println("Atak: " + postac1.getAtak() + " (" + postac1.typBroni() + ")");
        System.out.println("Pancerz: " + postac1.getPancerz() + " (" + postac1.typPancerza() + ")");
        System.out.println();
        System.out.println("Statystyki postaci " + postac2.typPostaci() + " " + postac2.getImie() + " to:");
        System.out.println("Atak: " + postac2.getAtak() + " (" + postac2.typBroni() + ")");
        System.out.println("Pancerz: " + postac2.getPancerz() + " (" + postac2.typPancerza() + ")");
    }

    public void przebiegPojedynku(){
        System.out.println();
        int obrazeniaZadanePrzezP1;
        int obrazeniaZadanePrzezP2;
        System.out.println("Dochodzi do starcia i... BUM");
        obrazeniaZadanePrzezP1=Math.max(0,(postac1.getAtak()-postac2.getPancerz()));
        obrazeniaZadanePrzezP2=Math.max(0,(postac2.getAtak()-postac1.getPancerz()));

        System.out.print(postac1.typPostaci() + " " + postac1.getImie() + " zadal/a rywalowi ");
        System.out.println(obrazeniaZadanePrzezP1 + " punkty/punktow obrazen");

        System.out.print(postac2.typPostaci() + " " + postac2.getImie() + " zadal/a rywalowi ");
        System.out.println(obrazeniaZadanePrzezP2 + " punkty/punktow obrazen");

        System.out.print("Zwyciezca pojedynku jest wiec: ");
        if (obrazeniaZadanePrzezP1>obrazeniaZadanePrzezP2){
            System.out.println(postac1.typPostaci() + " " + postac1.getImie());
        } else{
            if (obrazeniaZadanePrzezP1<obrazeniaZadanePrzezP2){
                System.out.println(postac2.typPostaci() + " " + postac2.getImie());
            }
            else {
                System.out.println("Nikt... pojedynek zakonczyl sie remisem");
            }
        }

    }

    public void dzialanie(){
        wstep();
        statystyki();
        przebiegPojedynku();
    }
}
