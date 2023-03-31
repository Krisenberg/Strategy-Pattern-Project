import java.util.Scanner;

public class MenuPostaci {

    private Postac postac;
    private boolean czyWyjsc=false;
    Scanner scan = new Scanner(System.in);

    public MenuPostaci(Postac postac){
        this.postac=postac;
    }

    public void naglowek(){
        System.out.println("Witaj w menu postaci " + postac.getImie());
        System.out.println();
    }

    public void wyswietlOpcje(){
        System.out.println("Wybierz co chcialbys zrobic z postacia:");
        System.out.println("[1] Przedstaw sie");
        System.out.println("[2] Prezentuj swoja bron");
        System.out.println("[3] Wykonaj ruch do przodu");
        System.out.println("[4] Podaj statystyke ataku");
        System.out.println("[5] Podaj statystyke obrony (pancerza)");
        System.out.println("[6] Wyrzuc bron");
        System.out.println("[7] Zdejmij pancerz");
        System.out.println("[8] Wrecz inna bron");
        System.out.println("[9] Zaloz inny pancerz");
        System.out.println("[10] Zmien imie postaci");
        System.out.println("[0] Wyjdz z menu postaci");
        System.out.println();
    }

    public void przedstawienieSiePostaci(){
        System.out.println("PRZEDSTAWIENIE SIE POSTACI");
        postac.przedstawSie();
    }
    public void prezentacjaBroni(){
        System.out.println("PREZENTACJA BRONI");
        postac.prezentujBron();
    }
    public void ruchDoPrzodu(){
        System.out.println("RUCH DO PRZODU");
        System.out.println("Wybrales opcje ruchu postacia do przodu");
        System.out.println("Podaj ile heksow do przodu postac ma sie poruszyc: ");
        int ruch = scan.nextInt();
        scan.nextLine();
        postac.idzDoPrzodu(ruch);
    }
    public void statystykaAtaku(){
        System.out.println("STATYSTYKA ATAKU");
        postac.statystykaAtaku();
    }
    public void statystykaObrony(){
        System.out.println("STATYSTYKA OBRONY (PANCERZA)");
        postac.statystykaPancerza();
    }
    public void wyrzucenieBroni(){
        System.out.println("WYRZUCENIE BRONI");
        if (postac.getAtak()==0){
            System.out.println("Postac nie miala zadnej broni do wyrzucenia");
        } else {
            System.out.println("Bron: " + postac.typBroni() + " postaci " + postac.getImie() + " zostala wyrzucona");
            postac.wyrzucBron();
        }
    }
    public void zdejmijPancerz(){
        System.out.println("ZDJECIE PANCERZA");
        if (postac.getPancerz()==0){
            System.out.println("Postac nie miala zadnego pancerza do zdjecia");
        } else {
            System.out.println("Pancerz: " + postac.typPancerza() + " postaci " + postac.getImie() + " zostal wyrzucony");
            postac.wyrzucPancerz();
        }
    }
    public void wreczenieBroni(){
        System.out.println("WRECZENIE BRONI");
        WyborBroni wybor = new WyborBroni(postac);
        wybor.wyborBroni();
    }
    public void zalozeniePancerza(){
        System.out.println("ZALOZENIE PANCERZA");
        WyborPancerza wybor = new WyborPancerza(postac);
        wybor.wyborPancerza();
    }
    public void zmianaImienia(){
        System.out.println("ZMIANA IMIENIA");
        System.out.println("Wybrales opcje zmiany imienia postaci");
        System.out.println("Podaj nowe imie postaci: ");
        String imie = scan.nextLine();
        if (imie!=""){
            postac.setImie(imie);
            System.out.println("Imie zostalo zmienione");
        } else {
            System.out.println("Blad, nie mozna zmienic imienia postaci na pusty napis");
            System.out.println("Imie nie zostalo zmienione");
        }
    }

    public void wybor(){
        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();
        switch (wybor){
            case 1: {
                przedstawienieSiePostaci();
                break;
            }
            case 2: {
                prezentacjaBroni();
                break;
            }
            case 3: {
                ruchDoPrzodu();
                break;
            }
            case 4: {
                statystykaAtaku();
                break;
            }
            case 5: {
                statystykaObrony();
                break;
            }
            case 6: {
                wyrzucenieBroni();
                break;
            }
            case 7: {
                zdejmijPancerz();
            }
            case 8: {
                wreczenieBroni();
                break;
            }
            case 9: {
                zalozeniePancerza();
                break;
            }
            case 10: {
                zmianaImienia();
                break;
            }
            case 0: {
                czyWyjsc =true;
                System.out.println("Koniec dzialan na danej postaci");
                break;
            }
            default: {
                System.out.println("Nie ma takiego numeru w menu postaci");
                break;
            }
        }
        System.out.println("-------------------------------");
    }

    public void zapytanie(){
        System.out.println("Czy chcesz wykonac dalsze akcje w menu postaci?");
        System.out.println("[1] Tak");
        System.out.println("[2] Nie");
        System.out.println("Kazdy wybor inny niz 1 bedzie skutkowal opuszczeniem menu postaci");
        System.out.println();
        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();
        if (wybor == 1){
            CzyszczenieKonsoli.wyczyscKonsole();
        } else {
            czyWyjsc=true;
        }
    }

    public void dzialanie(){
        naglowek();
        while (czyWyjsc ==false){
            wyswietlOpcje();
            wybor();
            if (czyWyjsc==true)
                break;
            else {
                zapytanie();
            }
        }
    }

}
