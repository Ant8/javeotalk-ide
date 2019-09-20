package abm.ant8.eu.shortcuts.warm.up

class SomeUseForWarmUp {
    internal var warmUpDrill: WarmUpDrill

    init {
        warmUpDrill = WarmUpDrillImpl()
        warmUpDrill.someOtherMethod("")
    }
}
