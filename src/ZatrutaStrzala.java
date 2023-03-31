public class ZatrutaStrzala implements PrezentacjaBroni {
    private final int statystykaAtaku=15;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto zatruta strzala, zawiera w swoim grocie smiercionosny jad.";
    }

    public String typBroni() {
        return "Zatruta strzala";
    }
}