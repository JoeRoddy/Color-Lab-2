/**
 * Created by Joe on 1/20/16.
 */
public class InitializationLab2 {

    public static void main(String[] args) {
        ThingContainer thing1 = new ThingContainer(5);

        ColorfulThing cs1 = new ColorfulThing(ColorfulThing.Colors.BLUE);
        ColorfulThing cs2= new ColorfulThing(ColorfulThing.Colors.YELLOW);
        ColorfulThing cs3 = new ColorfulThing(ColorfulThing.Colors.RED);
        ColorfulThing cs4 = new ColorfulThing(ColorfulThing.Colors.BLUE);
        ColorfulThing[] ctToPass={cs3,cs2,cs1};
        ThingContainer thing2 = new ThingContainer(ctToPass);

        thing1.add(cs4);
        thing1.add(cs2);
        thing1.add(cs3);
        thing1.add(cs1);
        thing1.add(cs1);
        System.out.println("Original Array: ");
        thing1.printThings();
        //thingx.remove (color or CTobj)
        thing1.remove(cs1);
        thing1.remove(ColorfulThing.Colors.YELLOW);
        thing1.pop();
        System.out.println("After cutting first cs1 obj && first YELLOW && calling pop(): ");
        thing1.printThings();
        System.out.println("Containter made by passing the array: ");
        thing2.printThings();

    }
}
