package T4;

        /*
        This time no story, no theory. The examples below show you how to write function accum:

        Examples:
        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"
        The parameter of accum is a string which includes only letters from a..z and A..Z.
        */
public class Accumul {

    public static String accum(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++)
        {
            ans += String.format("%S",s.charAt(i));

            for (int j = 1; j <= i ; j++)
            {
                if (j != 0)
                    ans += String.valueOf(s.charAt(i)).toLowerCase();
            }
            ans += "-";

        }

        return ans.substring(0,ans.length()-1);
    }
}
