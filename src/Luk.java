public class Luk implements PrezentacjaBroni {
    private final int statystykaAtaku=7;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto moj luk, najbardziej precyzyjna bron dlugodystansowa.";
    }

    public String typBroni() {
        return "Luk";
    }
}
