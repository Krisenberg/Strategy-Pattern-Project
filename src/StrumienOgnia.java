public class StrumienOgnia implements PrezentacjaBroni {
    private final int statystykaAtaku=20;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto moj strumien ognia, zabojcza bron razaca na szeroki obszar.";
    }

    public String typBroni() {
        return "Strumien ognia";
    }
}
