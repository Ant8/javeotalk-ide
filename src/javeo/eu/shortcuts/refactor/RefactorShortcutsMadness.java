package javeo.eu.shortcuts.refactor;

// todo c1: optimise imports!
import javeo.eu.shortcuts.warm.up.WarmUpDrill;
import javeo.eu.shortcuts.warm.up.WarmUpDrillImpl;
import javeo.eu.shortcuts.warm.up.WarmUpDrillImpl;
import javeo.eu.shortcuts.refactor.PileOfPoo;

public class RefactorShortcutsMadness {

    private void beTooLongAndDoSomething() {
// todo c2: extract that as class field and initialise in constructor, so that another methods can use it as well
        WarmUpDrill warmUpDrill = new WarmUpDrillImpl();
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise");
        warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 22);
//        todo c3: that code need to be reformatted as well
warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 2342, 132.1324d);
    warmUpDrill.someOtherMethod("that text needs to be extracted to a constant, and after that, inlined again, for the sake of exercise", 2232);
        
    }

    private void beTooLongAndDoSthDifferentAsNeighbour() {
//        todo c3: extract flag to a method parametre
        boolean flag;
//        todo c4: wrap below calls with an if using the flag parametre
        warmUpDrill.someOtherMethod("this should go second, actually - use ctrl+shift+up/down");
        warmUpDrill.someOtherMethod("this should go first, if I'm honest", 22);



//        todo c5: you can easily erase these empty lines with ctrl+y
    }
    
    private void beBrief() {
        warmUpDrill.someOtherMethod("I should be duplicated just right below but with another someInteger value", 22);
    } 

    private void
}
