class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] charArray=str.toCharArray();
        int left=0,right=(str.length())-1;
        while(left<right){
            char temp=charArray[left];
            charArray[left++]=charArray[right];
            charArray[right--]=temp;
        }
        //System.out.println(charArray);
        
        return new String(charArray);
    }
}
