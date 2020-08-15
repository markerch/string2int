//Author: Siwakorn Mosikanon
//to run this file, use your choice's Java compiler or online compiler

public class AppManChallenge{

     public static void main(String []args){
        String input ="9da8dsd029asd22";
        System.out.println("Before :  "+ input);
        //the output will become integer
        int output = stringToint( getNumberString(input));
        System.out.println("");
        System.out.println("After :  "+ output);
        System.out.println("");
     }
    
    //this method will filter out the non-nemeric character from the string input.
    public static String getNumberString(String str)
    {
        String numberString = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            //Filter out the non-numeric character by checking ASCII code.
            if(str.charAt(i) - '0' < 10)
            {
                numberString += str.charAt(i);
            }
        }
        return numberString;
    }
    
    //convert numeric string to integer by hand
     public static int stringToint( String str ){
        int i = 0, number = 0;
        int len = str.length();
        while( i < len ){
            //increase the length of integer. so, we can push the value just like String
            number *= 10;
            //get ASCII code of the String and append it to the output
            number += ( str.charAt(i++) - '0' );
        }

        return number;
    }   
}