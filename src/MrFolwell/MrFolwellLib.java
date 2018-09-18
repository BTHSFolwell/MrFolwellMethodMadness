package MrFolwell;

/**
 * Created by Teacher on 9/18/2018.
 */
public class MrFolwellLib {
    public static String reverse(String input)
    {
        String output = "";
        int i = input.length() - 1;
        while (i >=0) {
            output = output + input.substring(i,i+1);
            i--;
        }
        return output;
    }

}
