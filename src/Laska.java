public class Laska implements PrezentacjaBroni {
    private final int statystykaAtaku=25;

    public int statystykaAtaku(){
        return statystykaAtaku;
    }

    public String prezentujBron(){
        return "Oto magiczna laska, najpotezniejsza bron w grze. Jej uzycie wymaga wieloletniej nauki.";
    }

    public String typBroni() {
        return "Laska";
    }
}
