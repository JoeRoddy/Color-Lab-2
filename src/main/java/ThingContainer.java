import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Joe on 1/20/16.
 */
public class ThingContainer {
    int arraySize;
    ColorfulThing[] colorfulThingsArray;

    ThingContainer(int x) {
        arraySize = x;
        colorfulThingsArray = new ColorfulThing[arraySize];
    }

    ThingContainer(ColorfulThing[] ctArrayArg){
        colorfulThingsArray=ctArrayArg;
    }

    private int tracker = 0;

    //adds a ColorfulThing object to the container's array
    public void add(ColorfulThing cToAdd) {
        if (tracker < this.colorfulThingsArray.length) {
            colorfulThingsArray[tracker] = cToAdd;
            tracker++;
        } else {
            System.out.println("ThingContainer is full");
        }
    }

    //prints the contents of the container's array
    public void printThings() {
        for (int y = 0; y < colorfulThingsArray.length; y++) {
            System.out.println(colorfulThingsArray[y].getColor());
        }
    }

    //removes the last CT element of the array and returns it
    public ColorfulThing pop() {
        ColorfulThing toReturn = this.colorfulThingsArray[colorfulThingsArray.length - 1];
        colorfulThingsArray = Arrays.copyOf(colorfulThingsArray, colorfulThingsArray.length - 1);
        return toReturn;
    }

    //removes the first instance of a COLOR from the container's array and returns the obj it belongs to
    public ColorfulThing remove(ColorfulThing.Colors color) {
        ElementRemover er = new ElementRemover(colorfulThingsArray, color);
        if (er.firstColorMatchIndex() >= 0) {
            ColorfulThing ctToReturn = colorfulThingsArray[er.firstColorMatchIndex()];
            colorfulThingsArray = er.colorRemover();
            return ctToReturn;
        }
        colorfulThingsArray = er.colorRemover();
        return null;
    }

    //removes the first instance of a CT obj in the conatiner's array and returns it
    public ColorfulThing remove(ColorfulThing ctObj){
        ElementRemover er = new ElementRemover(colorfulThingsArray, ctObj);
        if(er.firstCTMatchIndex() >=0){
            ColorfulThing ctToReturn = colorfulThingsArray[er.firstCTMatchIndex()];
            colorfulThingsArray = er.ctRemover();
            return ctToReturn;
        }
        colorfulThingsArray=er.ctRemover();
        return null;
    }

}

    /*public ColorfulThing remove(ColorfulThing ctArg){
        for (int z = 0; z < colorfulThingsArray.length; z++) {
            if (colorfulThingsArray[z]==ctArg) { //if same reference

                //creates a temporary array to add all the elements we want to keep from colorfulThingsArray
                ColorfulThing[] tempArray = new ColorfulThing[colorfulThingsArray.length - 1];
                int h = 0;
                for (int i = 0; i < colorfulThingsArray.length; i++) {
                    if (i != z) {
                        tempArray[h] = colorfulThingsArray[i];
                        h++;
                    }
                }

                colorfulThingsArray = tempArray;
                return colorfulThingsArray[z];
            }
        }
        return null;
    }  */


