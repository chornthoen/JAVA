package Function_2;

public class Application1 {
    public static void main(String[] args) {

        String text = "hfertu34";


        //boolean valid = validateLength("");
        //System.out.println(valid);




        //boolean help = hasAtLeast2Digit(text);
        //System.out.println(help);

        boolean valid = validatePassword(text);
        System.out.println(valid);


    }
    public static boolean validatePassword( String password){
        boolean valid ;
        valid = validateLength(password,8) &&
                hasCharacterAndDigit(password) &&
                hasAtLeastNDigit(password,2);

        return valid;
    }


    public static boolean hasAtLeastNDigit(String text, int numberOfDigit){

        int digitCount = 0;
        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (Character.isDigit(ch)){
                digitCount++;
            }
        }
        return digitCount>=2;
    }

    public static boolean validateLength(String password,int length){
        return password.length()>=length;
    }



    public static boolean hasCharacterAndDigit(String password){
        boolean character= false;
        boolean digit = false;
        for (int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if (Character.isAlphabetic(ch)&& !character){
                character = true;
            }
            if(Character.isDigit(ch) && !digit){
                digit =true;
            }
        }
        return character && digit;
    }
}
