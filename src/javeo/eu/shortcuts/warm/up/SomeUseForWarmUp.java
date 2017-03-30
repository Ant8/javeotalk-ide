package javeo.eu.shortcuts.warm.up;

public class SomeUseForWarmUp {
    WarmUpDrill warmUpDrill;

    public SomeUseForWarmUp() {
        warmUpDrill = new WarmUpDrillImpl();
        warmUpDrill.someOtherMethod("");
    }
}
