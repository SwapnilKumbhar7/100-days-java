/*Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.*/
class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int n1=n;
        while(n1!=0){
            int digit=n1%10;
            if( digit!=0 && n%digit==0){
                count++;
            }
            n1=n1/10;
        }
        return count;
    }
  public static void main(String[] args) {

        int testNumber = 120; 
        int result = Solution.evenlyDivides(testNumber);
        System.out.println("The count of digits that evenly divide " + testNumber + " is: " + result);
    }
}
