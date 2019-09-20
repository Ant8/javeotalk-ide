package abm.ant8.eu.shortcuts.refactor

import abm.ant8.eu.ClassToMove

// todo b6: navigate between errors using f2, then take action (alt+enter)
// todo b7: replace someMethodWithSoManyParametresYou... call with someUsefulMethod call, using ctrl+space and tab; see the difference between tab and enter
// todo b8: navigate between changes in current file with ctrl+alt+shift+up/down
// todo b9: move to version control panel and see local changes using ctrl+d on file; navigate between changes using [shift] + f7

class PileOfPoo : PileOfFoo() {

    @Override
    fun someOherMethod(parametre: String, someInteger: Int) {
        val classToMove = ClassToMove()
        classToMove.someMethodWithSoManyParametresYouNeedToLookUpEveryTimeAndTheNameItselfIsPrettyBadTooSoRenameIt(parametre, "", "", "", "", "", "", "some")
    }

    @Override
    fun someOtherMethod(parametre: String, someInteger: Int, anotherMeaninglessParametre: Double) {

    }


}
