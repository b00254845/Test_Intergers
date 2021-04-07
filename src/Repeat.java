public class Repeat {

    public static Boolean repeat() {
        Boolean result = false;
        Character response;
        response = Input.getCharacter("Would you like to continue(y/n)?  ");
        if ((response == 'y') || (response == 'Y')) {
            result = true;
        }
        return result;
    }
}
