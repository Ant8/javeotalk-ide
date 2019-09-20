package javeo.eu.shortcuts.warm.up

class SomeUseForWarmUp {
    internal var warmUpDrill: WarmUpDrill

    init {
        warmUpDrill = WarmUpDrillImpl()
        warmUpDrill.someOtherMethod("")
    }
}
