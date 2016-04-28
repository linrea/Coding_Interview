package leetcode2;

/*
 * Given input->"I have 36 books, 40 pens2.->" I evah 36 skoob, 40 2snep."(Ebay interview)
 */
public class Reverse_ebay
{
	public static String reverse(String s)
	{
		if(s==null)
			return null;
		String[] str=s.split(" ");
		String result="";
		int m,j=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].charAt(0)>'a'&&str[i].charAt(0)<'z')
			{
				if(str[i].charAt(str[i].length()-1)==','||str[i].charAt(str[i].length()-1)=='.')
				{
					m=str[i].length()-j-2;

				}else
					m=str[i].length()-j-1;
				for(;j<m;j++,m--)
				{

					str[i]=str[i].substring(0,j)+str[i].charAt(m)+str[i].substring(j+1,m)+str[i].charAt(j)
							+str[i].substring(m+1);

				}

			}
			result+=str[i]+" ";

		}
		return result;

	}

	public static void main(String[] args)
	{
		String s="I have 36 books, 40 pens2.";
		String result=reverse(s);
		System.out.println(result);
	}

}
