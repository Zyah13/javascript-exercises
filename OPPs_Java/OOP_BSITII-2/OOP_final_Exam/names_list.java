/*
 * Problem: Write a program that add names in arrayList and then display it on the console
 * Name: Jieya O Lingaolingao
 * Grade&Sec.: BSIT 2-2
 * @names_list.java
 * #Add Names in ArrayList
 */

 import java.util.ArrayList;
class names_list
{
    
    public static void main(String args[])
    {
        ArrayList<String> names_list = new  ArrayList<String>(); // Create an ArrayList  to store the Names in the List of Arrays

        // add names in the Array List
        names_list.add("Jieya");
        names_list.add("Eyahh");
        names_list.add("Zia");
        names_list.add("Xandia");
        names_list.add("Yhang");

        //Display the name on the Console
        System.out.println("Names in the Array List :");
        for (String names : names_list)
        {
            System.out.println(names);
        }
    }
}

/*OUTPUT
Names in the Array List :
Jieya
Eyahh
Zia
Xandia
Yhang
*/
