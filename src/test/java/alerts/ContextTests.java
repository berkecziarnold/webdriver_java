package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextTests extends BaseTests {

    @Test
    public void testContext(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String msg = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(msg, "You selected a context menu", "Result text incorrect");
    }

}
