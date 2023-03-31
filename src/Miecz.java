public class Miecz implements PrezentacjaBroni {
    private final int statystykaAtaku=10;

    public int statystykaAtaku(){
        return 10;
    }

    public String prezentujBron(){
        return "Oto moj miecz ze stali twardej jak skala.";
    }

    public String typBroni() {
        return "Miecz";
    }
}
