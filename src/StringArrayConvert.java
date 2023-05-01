public class StringArrayConvert
{
    public static int[] func(String str)
    {
        int ret[] = new int[4];

        for(int i = 0;i < str.length();i++)
        {
            ret[i] = str.charAt(i) - '0';
        }
        return ret;
    }
}