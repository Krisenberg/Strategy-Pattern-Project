public class Galaz implements PrezentacjaBroni {
    private final int statystykaAtaku=3;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto galaz, wyglada niewinnie, ale potrafi mocno zranic.";
    }

    public String typBroni() {
        return "Galaz";
    }
}
