import java.util.ArrayList;
import java.util.Scanner;

public class MenuGlowne {
    private ArrayList<Postac> listaPostaci;
    private boolean czyWyjsc=false;
    Scanner scan = new Scanner(System.in);
    private int liczbaStworzonychPostaci = 0;
    Postac postac;

    public MenuGlowne(){
        listaPostaci = new ArrayList<>();
    }

    public void przywitanie(){
        System.out.println("Witaj w grze Cien Srodziemia...");
    }

    public void wyswietlPostaci(){
        System.out.println("Oto kreator postaci, wybierz najpierw jaka postac chcesz stworzyc:");
        System.out.println("[1] Krol");
        System.out.println("[2] Rycerz");
        System.out.println("[3] Chlop");
        System.out.println("[4] Elf");
        System.out.println("[5] Krasnolud");
        System.out.println("[6] Smok");
        System.out.println("[7] Ork");
        System.out.println("[8] Czarodziej");
        System.out.println("[9] Ent");
        System.out.println("Wybor liczby spoza zakresu [1,9] bedzie skutkowal brakiem wreczenia broni postaci");
        System.out.println();
    }

    public void stworzKrola(String imie){
        postac = new Krol(imie);
        System.out.println("Pomyslnie utworzono krola o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzRycerza(String imie){
        postac = new Rycerz(imie);
        System.out.println("Pomyslnie utworzono rycerza o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzChlopa(String imie){
        postac = new Chlop(imie);
        System.out.println("Pomyslnie utworzono chlopa o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void swtorzElfa(String imie){
        postac = new Elf(imie);
        System.out.println("Pomyslnie utworzono elfa o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzKrasnoluda(String imie){
        postac = new Krasnolud(imie);
        System.out.println("Pomyslnie utworzono krasnoluda o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzSmoka(String imie){
        postac = new Smok(imie);
        System.out.println("Pomyslnie utworzono smoka o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzOrka(String imie){
        postac = new Ork(imie);
        System.out.println("Pomyslnie utworzono orka o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzCzarodzieja(String imie){
        postac = new Czarodziej(imie);
        System.out.println("Pomyslnie utworzono czarodzieja o imieniu " + imie);
        listaPostaci.add(postac);
    }
    public void stworzEnta(String imie){
        postac = new Ent(imie);
        System.out.println("Pomyslnie utworzono enta o imieniu " + imie);
        listaPostaci.add(postac);
    }

    public void stworzPostac(){
        wyswietlPostaci();

        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();

        System.out.println("Nadaj imie wybranej postaci: ");
        String imie = scan.nextLine();

        int czyStworzona = 1;
        switch (wybor){
            case 1: {
                stworzKrola(imie);
                break;
            }
            case 2: {
                stworzRycerza(imie);
                break;
            }
            case 3: {
                stworzChlopa(imie);
                break;
            }
            case 4: {
                swtorzElfa(imie);
                break;
            }
            case 5: {
                stworzKrasnoluda(imie);
                break;
            }
            case 6: {
                stworzSmoka(imie);
                break;
            }
            case 7: {
                stworzOrka(imie);
                break;
            }
            case 8: {
                stworzCzarodzieja(imie);
                break;
            }
            case 9: {
                stworzEnta(imie);
                break;
            }
            default: {
                System.out.println("Postac nie zostala utworzona");
                czyStworzona=0;
                break;
            }
        }
        if (czyStworzona==1){
            liczbaStworzonychPostaci++;
            System.out.println("Czy chcesz wreczyc utworzonej postaci bron?");
            System.out.println("[1] Tak");
            System.out.println("[2] Nie");
            System.out.println("Kazdy wybor inny niz 1 oznacza brak wreczenia broni danej postaci");
            System.out.println("Twoj wybor: ");
            int czyWyborBroni = scan.nextInt();
            scan.nextLine();
            if (czyWyborBroni==1){
                System.out.println("WRECZENIE BRONI");
                WyborBroni wybranaBron = new WyborBroni(postac);
                wybranaBron.wyborBroni();
            }
            else{
                System.out.println("Bron nie zostala wreczona");
            }
            System.out.println();
            System.out.println("Czy chcesz aby utworzona postac zalozyla pancerz?");
            System.out.println("[1] Tak");
            System.out.println("[2] Nie");
            System.out.println("Kazdy wybor inny niz 1 oznacza brak zalozenia pancerza postaci");
            System.out.println("Twoj wybor: ");
            int czyWyborPancerza = scan.nextInt();
            scan.nextLine();
            if (czyWyborPancerza==1){
                System.out.println("ZALOZENIE PANCERZA");
                WyborPancerza wybranyPancerz = new WyborPancerza(postac);
                wybranyPancerz.wyborPancerza();
            }
            else{
                System.out.println("Pancerz nie zostal zalozony");
            }
        }
    }
//    public void wyswietlWszystkiePostaci(){
//        System.out.println("LISTA STWORZONYCH POSTACI");
//        System.out.print("      Typ postaci        ");
//        System.out.println("Imie postaci");
//        int i=0;
//        int index=0;
//        while (i<liczbaStworzonychPostaci){
//            if (listaPostaci.get(index) != null){
//                int indeksDoWypisania = i+1;
//                System.out.println(" (" + indeksDoWypisania + ")      " + listaPostaci.get(index).typPostaci()+ "           " + listaPostaci.get(index).getImie());
//                i++;
//            }
//            index++;
//        }
//    }
    public void wyswietlWszystkiePostaci(){
        System.out.println("LISTA STWORZONYCH POSTACI");
        System.out.print("      Typ postaci        ");
        System.out.println("Imie postaci");
        for(int i=0; i<listaPostaci.size(); i++){
            if (listaPostaci.get(i) != null){
                int indeksDoWypisania = i+1;
                System.out.println(" (" + indeksDoWypisania + ")      " + listaPostaci.get(i).typPostaci()+ "           " + listaPostaci.get(i).getImie());
            }
        }
    }

    public void wyswietlOpcje(){
        System.out.println("...oto co mozesz zrobic w grze:");
        System.out.println("[1] Stworz postac");
        System.out.println("[2] Usun postac");
        System.out.println("[3] Wyswietl liste stworzonych postaci i przejdz do Menu Postaci");
        System.out.println("[4] Pojedynek miedzy dwoma postaciami");
        System.out.println("[0] Zakoncz gre");
    }
    public int indexPostaci(int numerPostaci){
        int index = 0;
        int minietePostaci = 0;
        while(minietePostaci!=numerPostaci-1){
            if(listaPostaci.get(index)!=null){
                minietePostaci++;
            }
            index++;
        }
        return index;
    }
//    public void usunPostac(int numerPostaci){
//        listaPostaci.remove(indexPostaci(numerPostaci));
//        liczbaStworzonychPostaci--;
//    }
    public void usunPostac(int numerPostaci){
        listaPostaci.remove(numerPostaci-1);
        liczbaStworzonychPostaci--;
    }

    public void wybor(){
        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();
        switch(wybor){
            case 1: {
                stworzPostac();
                break;
            }
            case 2: {
                System.out.println("Wybierz ktora postac chcesz usunac:");
                wyswietlWszystkiePostaci();
                System.out.println("Twoj wybor: ");
                int wyborPostaci = scan.nextInt();
                scan.nextLine();
                usunPostac(wyborPostaci);
                break;
            }
            case 3: {
                wyswietlWszystkiePostaci();
                System.out.println("Wybierz postac, na ktorej chcesz wykonac dzialanie: ");
                int wyborPostaci = scan.nextInt();
                scan.nextLine();
                MenuPostaci menu = new MenuPostaci(listaPostaci.get(indexPostaci(wyborPostaci)));
                CzyszczenieKonsoli.wyczyscKonsole();
                menu.dzialanie();
                break;
            }
            case 4: {
                if (liczbaStworzonychPostaci>=2){
                    wyswietlWszystkiePostaci();
                    System.out.println("Wybierz dwie postaci, ktore stana do walki");
                    System.out.println("Postac 1: ");
                    int wyborPostaci1 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Postac 2: ");
                    int wyborPostaci2 = scan.nextInt();
                    scan.nextLine();
                    if (wyborPostaci1<=liczbaStworzonychPostaci && wyborPostaci2<=liczbaStworzonychPostaci){
                        if (wyborPostaci1!=wyborPostaci2){
                            Postac postac1 = listaPostaci.get(indexPostaci(wyborPostaci1));
                            Postac postac2 = listaPostaci.get(indexPostaci(wyborPostaci2));
                            Pojedynek pojedynek = new Pojedynek(postac1,postac2);
                            pojedynek.dzialanie();
                        }
                        else{
                            System.out.println("Postac nie moze walczyc sama ze soba");
                        }
                    } else {
                        System.out.println("Blad, postaci o podanych numerach nie istnieja");
                    }

                } else {
                    System.out.print("Do przeprowadzenia pojedunku wymagane sa dwie utworzone postaci, ");
                    System.out.println("a obecnie utworzonych postaci jest: " + liczbaStworzonychPostaci);
                }
                break;
            }
            case 0: {
                czyWyjsc =true;
                System.out.println("Koniec gry");
                break;
            }
            default: {
                System.out.println("Nie ma takiego numeru w menu gry");
                break;
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public void graj(){
        CzyszczenieKonsoli.wyczyscKonsole();
        przywitanie();
        while (czyWyjsc ==false){
            wyswietlOpcje();
            wybor();
        }
    }
}
