
public class ValidIntegerInputTest {

    public static void main(String[] args) {
        String input;
        Integer value;
        do {
            input = Input.getString("Enter a whole number value: ");
            try {
                // convert the input String to a whole number
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, this is not a valid whole number");
            }
        } while (Repeat.repeat());
    }
}
