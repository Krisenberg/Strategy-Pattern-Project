public class Widly implements PrezentacjaBroni{
    private final int statystykaAtaku=1;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto moje widly, ktore zabrałem ze stodoly.";
    }

    public String typBroni() {
        return "Widly";
    }
}
