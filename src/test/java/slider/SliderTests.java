package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.enterRange(value);
        assertEquals(sliderPage.getRange(), value, "Slider value is incorrect");
    }
}
