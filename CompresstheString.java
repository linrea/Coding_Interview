package leetcode2;
/*
 * Compress the string "aabccccaaa" to "a2b1c5a3".
 */
		
public class CompresstheString
{
	public static String compress(String s)
	{
		if(s==null) return null;
		String result="";
		int count=1;
		result+=s.charAt(0);
		for(int i=1;i<s.length();)
		{
			if(i<=s.length()-1&&s.charAt(i)!=s.charAt(i-1)) i++;
			while(i<=s.length()-1&&s.charAt(i)==s.charAt(i-1))
				{
				count++;
				i++;
				}
			result+=Integer.toString(count);
			if(i!=s.length())
				result+=s.charAt(i);
			count=1;

		}
		return result;
	}
	public static void main(String[] args)
	{
		String s="aabccccaaa";
		String result=compress(s);
		System.out.println(result);
	}

}
