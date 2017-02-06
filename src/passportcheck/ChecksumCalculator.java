package passportcheck;

/**
 *
 * @author ntko
 */
public class ChecksumCalculator {
    public int Checksum(String input) {
        String upperCaseInput = input.toUpperCase();
        Character[] charArray = upperCaseInput.chars()
                                 .mapToObj(c -> (char)c)
                                 .toArray(Character[]::new);
        int weight = 0;
        int number = 0;
        int digit = 0;
        for(int i = 0; i < charArray.length; i++){
            switch (i % 3) {
                case 0:
                    weight = 7;
                    break;
                case 1:
                    weight = 3;
                    break;
                case 2:
                    weight = 1;
                    break;
                default:
                    break;
            }
            if(Character.isLetter(charArray[i])){
                number = (int) charArray[i] - 45; // A = 65 in ASCII/Unicode. Check digit calc requires it to be 10.
            }
            else if(charArray[i] == '<'){
                number = 0;
            }
            else {
                number = Character.getNumericValue(charArray[i]);
            }
            digit += (number * weight);
        }
        int remainder = digit % 10;
        return remainder;
    }
}
