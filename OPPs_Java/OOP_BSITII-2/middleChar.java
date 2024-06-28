/*
 *
 * @User:Jieya O. Lingaolingao
 * Yr. & Sec. : BSIT ll-2
 */

import java.util.Scanner; //Importing scanner to iteract user to input

public class middleChar
{

    public static void main(String[] args)
    {
        try (Scanner eya = new Scanner(System.in)) {
            // prompt user to input
            System.out.print("Input a String: ");
            String str = eya.nextLine();

            displayMid(str);  //Calling displayMid() method
        }
    }
        // Defined Method void without return value
    public static void displayMid(String s){   
        
        int pos,len; // declare pos and len in integer type
      
            // a. If the length of the string is odd there will be one middle chararacters.
		if (s.length() % 2 == 1)
		{
            pos = s.length() / 2;
			len = 1;
			
		}
           // b. If the length of the string is even there will be two middle chararacters.
		else
		{
		    pos = s.length() / 2 - 1;
			len = 2;
		}
		System.out.print("The middle character in the String : " + s.substring(pos, pos + len));
	}
}