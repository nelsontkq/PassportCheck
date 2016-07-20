
import passportcheck.ChecksumCalculator;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntko
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstLine = "PGBR<ÞRæRAN<<NELßØN richard";
        char[] firstLineArray = firstLine.toCharArray();
        StringBuilder sb = new StringBuilder(firstLine);
        for(int i =0; i < firstLineArray.length; i++){
                if(sb.charAt(i) == 'æ' || sb.charAt(i) == 'Æ') {
                    sb.setCharAt(i, 'A');
                    sb.insert(i, 'E');
                }
                if(sb.charAt(i) == 'ø' || sb.charAt(i) == 'Ø' || sb.charAt(i) == 'œ'|| sb.charAt(i) == 'Œ' ) {
                    sb.setCharAt(i, 'O');
                    sb.insert(i, 'E');
                }
                if(sb.charAt(i) == 'ß') {
                    sb.setCharAt(i, 'S');
                    sb.insert(i, 'S');
                }
                if(sb.charAt(i) == 'þ' || sb.charAt(i) == 'Þ') {
                    sb.setCharAt(i, 'T');
                    sb.insert(i, 'H');
                }
                if(!Character.isDigit(sb.charAt(i)) && !Character.isLetter(sb.charAt(i))) {
                    sb.setCharAt(i, '<');
                }
                
        }
        int remainingChars = 44 - sb.length();
        if(sb.length() > 44){
                sb.delete(45, sb.length());
        }
        else {
            for(int i = 0; i < remainingChars; i++)
            sb.append('<');

        }
        StringBuilder pn = new StringBuilder("123456789qwert<<");
            if(pn.length() == 16){
                pn.delete(15, 16);
            }
        System.out.print(pn.toString());
    }  
}

