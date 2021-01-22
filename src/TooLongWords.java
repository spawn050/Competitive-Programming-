import java.util.Scanner;

public class TooLongWords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int noOfWords = input.nextInt();
        String[] words = new String[noOfWords];

        for (int i = 0; i < noOfWords; i++)
        {
            words[i] = input.next();

            int len = words[i].length();

            if (len > 10)
            {
                words[i] = "" + words[i].charAt(0) + (len - 2) + words[i].charAt(len - 1);
                System.out.println(words[i]);
            }
            else
            {
                System.out.println(words[i]);
            }
        }
    }
}
