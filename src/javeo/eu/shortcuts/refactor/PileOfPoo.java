package javeo.eu.shortcuts.refactor;

import javeo.eu.ClassToMove;

// todo b6: navigate between errors using f2, then take action (alt+enter)
// todo b7: replace someMethodWithSoManyParametresYou... call with someUsefulMethod call, using ctrl+space and tab; see the difference between tab and enter
// todo b8: navigate between changes in current file with ctrl+alt+shift+up/down
// todo b9: move to version control panel and see local changes using ctrl+d on file; navigate between changes using [shift] + f7

public class PileOfPoo extends PileOfFoo {

    @Override
    public void someOherMethod(String parametre, int someInteger) {
        ClassToMove classToMove = new ClassToMove();
        classToMove.someMethodWithSoManyParametresYouNeedToLookUpEveryTimeAndTheNameItselfIsPrettyBadTooSoRenameIt(parametre, "", "", "", "", "", "", "some");
    }

    @Override
    public void someOtherMethod(String parametre, int someInteger, double anotherMeaninglessParametre) {

    }


}
