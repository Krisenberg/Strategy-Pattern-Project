import java.util.Scanner;

public class WyborPancerza {
    private Postac postac;
    Scanner scan = new Scanner(System.in);
    public WyborPancerza(Postac postac){
        this.postac=postac;
    }

    public void wyswietlPancerze(){
        System.out.println("Wybierz jaki pancerz ma teraz chronic postac:");
        System.out.println("[1] Pancerz ciezki");
        System.out.println("[2] Pancerz lekki");
        System.out.println("[3] Pancerz z mithrilu");
        System.out.println("[4] Pancerz skorzany");
        System.out.println("[5] Pancerz ze zlota");
        System.out.println("Wybor liczby spoza zakresu [1,5] bedzie skutkowal brakiem zalozenia nowego pancerza");
        System.out.println();
    }

    public void ustawPancerzCiezki(){
        PancerzCiezki pancerzC = new PancerzCiezki();
        postac.setRodzajPancerza(pancerzC);
        System.out.println("Postac od teraz bedzie chroniona przez pancerz ciezki");
    }
    public void ustawPancerzLekki(){
        PancerzLekki pancerzL = new PancerzLekki();
        postac.setRodzajPancerza(pancerzL);
        System.out.println("Postac od teraz bedzie chroniona przez pancerz lekki");
    }
    public void ustawPancerzMithrilowy(){
        PancerzMithrilowy pancerzM = new PancerzMithrilowy();
        postac.setRodzajPancerza(pancerzM);
        System.out.println("Postac od teraz bedzie chroniona przez pancerz z mithrilu");
    }
    public void ustawPancerzSkorzany(){
        PancerzSkorzany pancerzS = new PancerzSkorzany();
        postac.setRodzajPancerza(pancerzS);
        System.out.println("Postac od teraz bedzie chroniona przez pancerz ze skory");
    }
    public void ustawPancerzZloty(){
        PancerzZloty pancerzZ = new PancerzZloty();
        postac.setRodzajPancerza(pancerzZ);
        System.out.println("Postac od teraz bedzie chroniona przez pancerz ze zlota");
    }

    public void wyborPancerza(){
        wyswietlPancerze();
        System.out.println("Twoj wybor: ");
        int wybor = scan.nextInt();
        scan.nextLine();
        switch (wybor){
            case 1: {
                ustawPancerzCiezki();
                break;
            }
            case 2: {
                ustawPancerzLekki();
                break;
            }
            case 3: {
                ustawPancerzMithrilowy();
                break;
            }
            case 4: {
                ustawPancerzSkorzany();
                break;
            }
            case 5: {
                ustawPancerzZloty();
                break;
            }
            default: {
                System.out.println("Pancerz nie zostal zalozony");
                break;
            }
        }
    }
}
