package T5;

/*
        Complete the method/function so that it converts dash/underscore delimited words into camel casing.
        The first word within the output should be capitalized only if the original
        word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
        The next words should be always capitalized.

        Examples
        "the-stealth-warrior" gets converted to "theStealthWarrior"

        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

        "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/
import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        String ans = "";
        for (int i = 0; i < s.length();i++)
        {
            if (s.charAt(i) == '-' || s.charAt(i) == '_')
            {
                i++;
                ans += String.valueOf(s.charAt(i)).toUpperCase();
            }
            else
            {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
