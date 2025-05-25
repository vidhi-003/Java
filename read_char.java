// Read the Character from keybord, and print space

class program10
{
    public static void main(String a[])
    throws java.io.IOException
    {
        char ch;
        int spaces = 0;

        System.out.println("Enter a character");

        do
        {
            ch = (char) System.in.read();
            if (ch == ' ')
            spaces ++;
        } while(ch != '.');

        System.out.println("Total Spaces: " + spaces);

    }
}