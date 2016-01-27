/**
 * Created by Joe on 1/20/16.
 */
public class ElementRemover {
    ColorfulThing[] arrayToChange;
    ColorfulThing.Colors valueToRemove;
    ColorfulThing ctToRemove;

    public ElementRemover(ColorfulThing[] arrayToChange, ColorfulThing.Colors valueToRemove) {
        this.arrayToChange = arrayToChange;
        this.valueToRemove = valueToRemove;
    }

    public ElementRemover(ColorfulThing[] arrayToChange, ColorfulThing ctToRemove){
        this.arrayToChange=arrayToChange;
        this.ctToRemove=ctToRemove;
    }

    //removes the first instance of a CT obj from an array w/ a specified color property
    public ColorfulThing[] colorRemover() {
        for (int z = 0; z < arrayToChange.length; z++) {
            if (arrayToChange[z].equals(valueToRemove)) {
            }
            //creates an array to add all the elements we want to keep from arrayToChange
            ColorfulThing[] tempArray = new ColorfulThing[arrayToChange.length - 1];
            int iOfTempArray = 0;
            for (int i = 0; i < arrayToChange.length; i++) {
                if (i != z) {
                    tempArray[iOfTempArray] = arrayToChange[i];
                    iOfTempArray++;
                }
            }
            return tempArray;
        }
        return arrayToChange; // only executes if valueToRemove was not found
    }

    //identifies the index of the first instance of a CTobj with a specified color property
    public int firstColorMatchIndex() {  //returns -1 if no element found
        for (int z = 0; z < arrayToChange.length; z++) {
            if (arrayToChange[z].equals(valueToRemove)) {
                return z;
            }
        }
        return -1;
    }

    //removes the first instance of a specified CT obj from a CT array
    public ColorfulThing[] ctRemover(){
        for (int z = 0; z < arrayToChange.length; z++) {
            if (arrayToChange[z]==(ctToRemove)) {
            }
            //creates an array to add all the elements we want to keep from arrayToChange
            ColorfulThing[] tempArray = new ColorfulThing[arrayToChange.length - 1];
            int iOfTempArray = 0;
            for (int i = 0; i < arrayToChange.length; i++) {
                if (i != z) {
                    tempArray[iOfTempArray] = arrayToChange[i];
                    iOfTempArray++;
                }
            }
            return tempArray;
        }
        return arrayToChange; // only executes if valueToRemove was not found
    }

    //identifies the index of the first instance of a specified CTobj in an array
    public int firstCTMatchIndex(){
        for (int z = 0; z < arrayToChange.length; z++) {
            if (arrayToChange[z].equals(ctToRemove)) {
                return z;
            }
        }
        return -1;
    }

}
