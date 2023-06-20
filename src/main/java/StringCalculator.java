public class StringCalculator {
    public static int add(String numbers) {
        if(numbers.contains("-")){
            throw new IllegalArgumentException("Negatives not allowed.");
        }
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int toBeAdded = Integer.parseInt(number.trim());// If it is not a number, parseInt will throw an exception
                    if(toBeAdded < 1000) { //will ignore numbers greater than or equal to 1000
                        returnValue+=toBeAdded;
                    }
                }
            }
        }
        return returnValue;

    }
}
