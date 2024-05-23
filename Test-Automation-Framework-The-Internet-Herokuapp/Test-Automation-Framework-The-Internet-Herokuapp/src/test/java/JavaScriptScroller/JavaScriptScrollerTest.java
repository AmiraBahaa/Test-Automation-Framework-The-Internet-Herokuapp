package JavaScriptScroller;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptScrollerTest extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickJavaScriptScrollingPage().scrollIntoTable();
    }

    @Test
    public void testScrollToFifthParagraph()
    {
        homePage.clickJavaScriptInfiniteScroller().scrollToParagraph(5);
    }}
