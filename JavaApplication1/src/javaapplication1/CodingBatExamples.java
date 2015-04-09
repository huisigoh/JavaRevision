/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HuiSiGoh
 */
public class CodingBatExamples {
    //Constructor
    public CodingBatExamples()
    {
    }
    
    public String TestMethod(String input, int pos)
    {
        if(input.length() <= pos)
        {
            return "";
        }
        else
        {
            return input.substring(0, pos) + input.substring(pos+1, input.length());

        }
        
    }
    
    public String inverseString(String str)
    {
        char[] charArr = str.toCharArray();
        char[] frontBackArr = new char[str.length()];
        int count = 0;
        for(int i = str.length()-1; i >= 0 ; --i)
        {
            
            frontBackArr[count] = charArr[i];
            System.out.println(frontBackArr[count]);
            count++;
        }
        
        return new String(frontBackArr);
    }
    
    public String frontBack(String str)
    {
        if(str.length() <= 1)
        {
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
        
    }
    
    public String front3(String str)
    {
        if(str.length() <= 3)
        {
            return str + str + str;
        }
        else
        {
            String threeChar = str.substring(0, 3);
            return threeChar+threeChar+threeChar;
        }
    }
    
    public String backAround(String str)
    {
        if(str.length() < 1)
        {
            return str;
        }
        else
        {
            return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
        }
    }
    
    public boolean or35(int n)
    {
        return ((n%3==0 || n%5 ==0) ? true : false);
    }

    public String front22(String str)
    {
        String firstTwo;
        
        if(str.length() <= 2)
        {
            firstTwo = str;
        }
        else
        {
            firstTwo = str.substring(0, 2);
            
        }
        return firstTwo + str + firstTwo;
    }
    
    public boolean startHi(String str)
    {
        if(str.length()<2)
        {
            return false;
        }
        
        return str.substring(0, 2).equals("hi");
    }
    
    public boolean icyHot(int temp1, int temp2)
    {
        return ((temp1<0 && temp2>100) || (temp1>100 && temp2<0)? true: false);
    }
    
    public boolean in1020(int a, int b)
    {
        return ((a >= 10 && a <=20) || (b >=10 && b <=20) ? true : false);
    }
    
    public boolean hasTeen(int a,int b, int c)
    {
        return ((a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19) ? true : false);
    }
    
    public boolean loneTeen(int a, int b)
    {
        return (((a >= 13 && a <=19) && !(b >= 13 && b <=19)) ||
                ((b >= 13 && b <=19) && !(a >= 13 && a <=19)) ? true : false);
    }
    
    public String delDel(String str)
    {
        String subStr = "del";
        
        int pos = str.indexOf(subStr, 0);
        
        System.out.println(pos);
        
        if(pos == 1)
        {
            return str.charAt(0) + str.substring(subStr.length()+1, str.length());
        }
        
        return str;
    }
    
    public boolean mixStart(String str)
    {
        if(str.length() < 3)
        {
            return false;
        }
        
        return (str.substring(1, 3).equals("ix") ? true:false);
    }
    
    public String startOz(String str)
    {
        if(str.length() < 2)
        {
            return str;
        }
        
        if(str.indexOf("oz") == 0)
        {
            return "oz";
        }
        
        else if(str.charAt(0) == 'o')
        {
            return str.substring(0, 1);
        }
        
        else if(str.charAt(1) == 'z')
        {
            return str.substring(1,2);
        }
        else
        {
            return str.substring(0, 2);
        }
    }
    
    public int intMax(int a, int b, int c)
    {
        int max = a;
        
        if(b > a)
            max = b;
        
        if(c > max)
            max = c;
        
        return max;
    }
    
    public int intMax_Math(int a, int b, int c)
    {
        int max = Math.max(a, b);

        max = Math.max(max, c);
        
        return max;
    }
    
    public int close10(int a, int b)
    {
        final int TEN = 10;
        int diffA = Math.abs(TEN - a);
        int diffB = Math.abs(TEN - b);
        int diff = diffA-diffB;
        
        if(diff == 0) return diff;
        
        return (diff>0 ? b : a);
    }
    
    public boolean in3050(int a, int b)
    {
        return (((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50)));
    }
    
    public int max1020(int a, int b)
    {
        boolean inRangeA = a>=10 && a<=20;
        boolean inRangeB = b>=10 && b<=20; 
        
        if(inRangeA && inRangeB)
        {
            if (a > b) return a;
            else return b;         
        }
        else if (inRangeA)return a;
        else if (inRangeB)return b;
        else return 0;
    }
    
    public boolean stringE(String str)
    {
        int eCount = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) =='e')
                ++eCount;
        }
        
        return (eCount >= 1 && eCount <= 3 ? true : false);
    }
    
    public boolean lastDigit(int a, int b)
    {
        return (a%10 == b%10);
    }
    
    public String endUp(String str)
    {
        String retStr;
        
        if(str.length() < 3)
        {
            retStr = str.toUpperCase();
        }
        else
        {
            retStr = str.substring(0, str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
        }
        
        return retStr;
    }
    
    public String everyNth(String str, int n)
    {
        String retStr = "";
        
        if(str.length() == 0)
                return "";
        
        for(int i = 0; i < str.length(); i+=n)
        {
            retStr += str.substring(i, i+1);
        }
        
        return retStr;
    }
    
    public String stringTimes(String str, int n)
    {
        String retStr = "";
        for(int i = 0; i < n; i++)
        {
            retStr += str;
        }
        
        return retStr;
    }
    
    public String frontTimes(String str, int n)
    {
        String rptStr = "";
        String retStr = "";
        
        if(str.length() < 3)
            rptStr = str;
        else
            rptStr = str.substring(0,3);
        
        for(int i = 0; i < n; i++)
            retStr += rptStr;
        
        return retStr;
    }
    
    public int countXX(String str)
    {
        int[] countX = new int[str.length()];
        int count = 0;
        int countXX = 0;
        int arrIdx = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'x')
            {
                //System.out.print(str.charAt(i) + ",");
                countX[arrIdx] += 1;
                
            }
            else
            {
                count = 0;
                ++arrIdx;
            } 
        }
                    System.out.println();
        for(int i = 0; i < countX.length; i++)
        {

            System.out.print(countX[i] + ",");
            
            if(countX[i] >= 2)
                countXX += countX[i]-1;
        }
        
        return countXX;
    }
    
    public int countXX_1(String str)
    {
        if(str.length() < 2)
        {
            return 0;
        }
        
        int count = 0;
        
        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.substring(i, i+2).equals("xx"))
                ++count;
        }
        
        return count;
    }
    
    public String stringBits(String str)
    {
        String retStr = "";
        
        for(int i = 0; i < str.length(); i+=2)
        {
            retStr += str.substring(i, i+1);
        }
        
        return retStr;
    }
    
    public String stringSplosion(String str)
    {
        String retStr = "";
        
        for (int i = 0; i < str.length(); i++)
        {
            retStr += str.substring(0, i+1);
        }
        
        return retStr;
    }
    
    public int arrayCount9(int[] nums)
    {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++ )
        {
            if(nums[i] == 9)
                ++count;
        }
        return count;
    }
    
    public boolean arrayFront9(int[] nums)
    {
        int arraySize = nums.length;
        
        if(arraySize > 4)
            arraySize = 4;
        
        for(int i = 0; i < arraySize; i++)
        {
            
            
            if(nums[i] == 9)
                return true;
        }
        
        return false;
    }
    
    public boolean array123(int[] nums)
    {
        for(int i = 0; i < nums.length-2; i++)
        {
            if(nums[i] == 1 && nums[i+1] ==2 && nums[i+2] == 3)
                return true;
        }
        
        return false;
    }
    
    public int stringMatch(String a, String b)
    {
        int count = 0;
        int arraySize = a.length() > b.length() ? b.length():a.length();
        
        for(int i = 0; i < arraySize-1; i++)
        {
            if(b.substring(i, i+2).equals(a.substring(i, i+2)))
                ++count;
        }
        
        return count;
    }
    
    public String stringX(String str)
    {
        if(str.length() <= 1)
            return str;
        
        String retStr = "";
        String currChar = "";
        for(int i = 1; i < str.length()-1; i++)
        {
            currChar = str.substring(i, i+1);
            if(!currChar.equals("x"))
                retStr += currChar;
        }
        
        return str.substring(0, 1) + retStr + str.subSequence(str.length()-1, str.length());
    }
    
    public String altPairs(String str)
    {
        String retStr = "";
        
        if(str.length() < 2)
        {
            return str;
        }
        
        for(int i = 0; i < str.length(); i+=4)
        {
            if(i == str.length()-1)
                retStr += str.substring(i, i+1);
            else
                retStr += str.substring(i, i+2);
        }
        
        return retStr;
    }
    
    public String stringYak(String str)
    {
        if(str.length() < 3)
            return str;
        
        String retStr = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            if(i < str.length()-2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k')
                i+=2;
            else
                retStr += str.substring(i, i+1);
        }
        
        return retStr;
    }
    
    public int array667(int[] nums)
    {
        int count = 0;
        
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
                ++count;
        }
        
        return count;
    }
    
    public boolean noTriples(int[] nums)
    {
        if(nums.length < 3)
            return true;
        
        for(int i = 0; i < nums.length-2; i++)
        {
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2])
                return false;
        }
        
        return true;
    }
    
    public boolean has271(int[] nums)
    {   
        if(nums.length < 3)
            return false;
        
        for(int i = 0; i < nums.length-2; i++)
        {
            if(nums[i+1] == nums[i]+5 && (nums[i+2] < nums[i]+2 && nums[i+2] > nums[i]-2))
                return true;
        }
        
        return false;
    }
}
