/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            switch(i){
                case 0:
                case 3:
                case 6:
                    weight = 7;
                    break;
                case 1:
                case 4:
                case 7:
                    weight = 3;
                    break;
                case 2:
                case 5:
                case 8:
                    weight = 1;
                    break;
            }
            if(Character.isLetter(charArray[i])){
                number = (int) charArray[i] - 45; // A = 65 in ASCII. Check digit calc requires it to be 10.
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
