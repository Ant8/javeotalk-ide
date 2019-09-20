package abm.ant8.eu.shortcuts.refactor

// todo c1: optimise imports!
import abm.ant8.eu.shortcuts.warm.up.WarmUpDrill
import abm.ant8.eu.shortcuts.warm.up.WarmUpDrillImpl
import abm.ant8.eu.shortcuts.refactor.PileOfPoo

class RefactorShortcutsMadness {

    private fun beTooLongAndDoSomething() {
        // todo c2: extract that as class field and initialise in constructor, so that another methods can use it as well
        val warmUpDrill = WarmUpDrillImpl()
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise")
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 22)
        //        todo c3: that code need to be reformatted as well
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 2342, 132.1324)
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 2232)

    }

    private fun beTooLongAndDoSthDifferentAsNeighbour() {
        //        todo c3: extract flag to a method parametre
        val flag: Boolean
        //        todo c4: wrap below calls with an if using the flag parametre
        warmUpDrill.someOtherMethod("this should go second, actually - use ctrl+shift+up/down")
        warmUpDrill.someOtherMethod("this should go first, if I'm honest", 22)


        //        todo c5: you can easily erase these empty lines with ctrl+y
    }

    private fun beBrief() {
        warmUpDrill.someOtherMethod("I should be duplicated just right below but with another someInteger value", 22)
    }
}
