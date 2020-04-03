package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOptiom() {
        var dropDownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}