package math.TestNGEx;

import math.App;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExample {

    @Test(testName = "addition verification")
    public void VerifyAddition(){
        App.Calculator calc = new App.Calculator();
        int actual = calc.Adder(4,5);
        Assert.assertEquals(actual,9);
    }

    @Test(enabled = false)
    public void VerifySubtraction(){
        App.Calculator calc = new App.Calculator();
        int actual = calc.Adder(4,5);
        Assert.assertEquals(actual,1);
    }
}
