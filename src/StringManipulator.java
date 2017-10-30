
public class StringManipulator
{

    public String trim(String str)
    {
        int start = -1, end = -1;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ')
            {
                if (start == -1)
                {
                    start = i;
                }
                end = i;
            }
        }
        return str.substring(start, end + 1);
    }

    public String trimAndConcat(String str1, String str2)
    {
        return trim(str1) + trim(str2);
    }

    public int getIndexOrNull(String str, char ch)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                return i;
            }
        }
        return -1;
    }
    public int getIndexOrNull(String str1, String str2)
    {
        return str1.indexOf(str2);
    }

    public String concatSubstring(String str1, int i, int j, String str2) 
    {
        return str1.substring(i, j) + str2;
    }

}
