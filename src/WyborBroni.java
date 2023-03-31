import java.util.Scanner;

public class WyborBroni {
    private Postac postac;
    Scanner scan = new Scanner(System.in);
    public WyborBroni(Postac postac){
        this.postac=postac;
    }

    public void wyswietlBronie(){
        System.out.println("Wybierz jaka bronia ma teraz walczyc postac:");
        System.out.println("[1] Miecz");
        System.out.println("[2] Widly");
        System.out.println("[3] Luk");
        System.out.println("[4] Topor");
        System.out.println("[5] Strumien ognia");
        System.out.println("[6] Zatruta strzala");
        System.out.println("[7] Laska");
        System.out.println("[8] Galaz");
        System.out.println("Wybor liczby spoza zakresu [1,8] bedzie skutkowal brakiem wreczenia broni postaci");
        System.out.println();
    }

    public void ustawMiecz(){
        Miecz miecz = new Miecz();
        postac.setRodzajBroni(miecz);
        System.out.println("Postac od teraz bedzie walczyc mieczem");
    }
    public void ustawWidly(){
        Widly widly = new Widly();
        postac.setRodzajBroni(widly);
        System.out.println("Postac od teraz bedzie walczyc widlami");
    }
    public void ustawLuk(){
        Luk luk = new Luk();
        postac.setRodzajBroni(luk);
        System.out.println("Postac od teraz bedzie walczyc lukiem");
    }
    public void ustawTopor(){
        Topor topor = new Topor();
        postac.setRodzajBroni(topor);
        System.out.println("Postac od teraz bedzie walczyc toporem");
    }
    public void ustawStrumienOgnia(){
        StrumienOgnia strumien = new StrumienOgnia();
        postac.setRodzajBroni(strumien);
        System.out.println("Postac od teraz bedzie walczyc strumieniem ognia");
    }
    public void ustawZatrutaStrzala(){
        ZatrutaStrzala zatrutaStrzala = new ZatrutaStrzala();
        postac.setRodzajBroni(zatrutaStrzala);
        System.out.println("Postac od teraz bedzie walczyc zatruta strzala");
    }
    public void ustawLaska(){
        Laska laska = new Laska();
        postac.setRodzajBroni(laska);
        System.out.println("Postac od teraz bedzie walczyc laska");
    }
    public void ustawGalaz(){
        Galaz galaz = new Galaz();
        postac.setRodzajBroni(galaz);
        System.out.println("Postac od teraz bedzie walczyc galezia");
    }

    public void wyborBroni(){
        wyswietlBronie();
        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();
        switch (wybor){
            case 1: {
                ustawMiecz();
                break;
            }
            case 2: {
                ustawWidly();
                break;
            }
            case 3: {
                ustawLuk();
                break;
            }
            case 4: {
                ustawTopor();
                break;
            }
            case 5: {
                ustawStrumienOgnia();
                break;
            }
            case 6: {
                ustawZatrutaStrzala();
                break;
            }
            case 7: {
                ustawLaska();
                break;
            }
            case 8: {
                ustawGalaz();
                break;
            }
            default: {
                System.out.println("Bron nie zostala wreczona postaci");
                break;
            }
        }
    }
}
