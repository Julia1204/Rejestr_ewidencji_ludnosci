package testyfitnesse;
import fit.Fixture;
import system.SystemEwidencjiLudnosci;

public class SetUp extends Fixture{
    static SystemEwidencjiLudnosci systemEwidencjiLudnosci;
    public SetUp() {
        systemEwidencjiLudnosci = new SystemEwidencjiLudnosci();
        }

}

