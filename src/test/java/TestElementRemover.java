import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Joe on 1/21/16.
 */
public class TestElementRemover {

    @Test
    public void testTCont() {

        ThingContainer tcTestObj = new ThingContainer(3);
        ColorfulThing ctColor1 = new ColorfulThing(ColorfulThing.Colors.BLUE);
        ColorfulThing ctColor2 = new ColorfulThing(ColorfulThing.Colors.RED);
        ColorfulThing ctColor3 = new ColorfulThing(ColorfulThing.Colors.YELLOW);
        tcTestObj.add(ctColor1);
        tcTestObj.add(ctColor2);
        tcTestObj.add(ctColor3);

        //Testing colorRemover()
        ElementRemover er = new ElementRemover(tcTestObj.colorfulThingsArray, ColorfulThing.Colors.RED);
        ColorfulThing[] newArray = er.colorRemover();
        assertTrue("Error, color not removed from the array. ", newArray[1].getColor() != ColorfulThing.Colors.RED);
        System.out.println("colorRemover() test passed.  RED element removed from the array.");

        //Testing ctRemover()
        ElementRemover er2 = new ElementRemover(tcTestObj.colorfulThingsArray,ctColor3);
        ColorfulThing[] newTestArray2 = er.colorRemover();
        assertTrue("Error, ctObj not removed from the array", newTestArray2.length<3);
        System.out.println("ctRemover() test passed.  ctColor3 obj removed from the array.");

    }
}