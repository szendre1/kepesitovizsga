package hu.nive.ujratervezes.kepesitovizsga.addDigits;

public class AddDigits {

    public int addDigits(String input){
        if (input==null){
            return -1;
        }
        if (input.equals("")){
            return -1;
        }
        int result = 0;
        for(int i=0; i < input.length(); i++) {
            Boolean flag = Character.isDigit(input.charAt(i));
            if(flag) {
                result += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return result;
    }

}
