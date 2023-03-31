public class Topor implements PrezentacjaBroni {
    private final int statystykaAtaku=12;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto moj topor - ciezka, ale silna bron.";
    }

    public String typBroni() {
        return "Topor";
    }
}
