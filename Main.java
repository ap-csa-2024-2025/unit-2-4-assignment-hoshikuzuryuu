public class Main
{
  public static void main(String[] args)
  {
    System.out.println(lastFirstN("cream", "butter", 3));
    System.out.println(stringManip("hello", "eVERYONE"));
  }
  public static String lastFirstN(String s1, String s2, int n)
  {
    String output = new String();
    int indexOfNthToLast = s1.length() - n;
    String firstN = s1.substring(indexOfNthToLast);
    String lastN = s2.substring(0, n);
    output = firstN+lastN;
    return output;
  }
  public static String stringManip(String s1, String s2)
  {
    String output = new String();
    String upper = s1.toUpperCase();
    int len = s2.length();
    String lower = s2.substring(0,1).toUpperCase()+s2.substring(1,len).toLowerCase();
    output = upper + "\n" + lower;
    return output;
  }
}
