import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Joe on 1/21/16.
 */
public class TestThingContainer {

    @Test
    public void testTCont() {
        ThingContainer containerTest1 = new ThingContainer(3);
        ColorfulThing ctColor1 = new ColorfulThing(ColorfulThing.Colors.BLUE);
        ColorfulThing ctColor2 = new ColorfulThing(ColorfulThing.Colors.RED);
        ColorfulThing ctColor3 = new ColorfulThing(ColorfulThing.Colors.YELLOW);
        containerTest1.add(ctColor1);
        containerTest1.add(ctColor2);
        containerTest1.add(ctColor3);

        //Testing ThingContainer.add()
        assertTrue("Error, CT object not added to the array. ", containerTest1.colorfulThingsArray[0].getColor().equals(ColorfulThing.Colors.BLUE));

        System.out.println("add() passed.  Array after calling .add() 3 times:  ");
        containerTest1.printThings();

        //Testing ThingContainer.pop()
        int testSize = containerTest1.colorfulThingsArray.length;
        containerTest1.pop();
        System.out.println("prepop size: "+testSize+" post pop size: "+containerTest1.colorfulThingsArray.length);
        assertTrue("Error, pop did not remove last element.",containerTest1.colorfulThingsArray.length<testSize);
        System.out.println("pop() passed. Last element removed." );

        //Testing ThingContainer.remove()
        System.out.println("Array before .remove(): ");
        containerTest1.printThings();
        containerTest1.pop();
        System.out.println("Array after .remove(): ");
        containerTest1.printThings();
        assertTrue("Error. Red element not removed. ",containerTest1.colorfulThingsArray.length==1);
    }
}
