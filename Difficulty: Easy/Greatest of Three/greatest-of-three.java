// User function Template for Java
class Solution {

    public static int find_greatest_number(int a, int b, int c) {
        // Write your code here..
        int greatest;
        if(a>=b && a>=c){
            greatest=a;
        }
        else if(b>=a && b>=c){
            greatest=b;
        }
        else{
            greatest=c;
        }
        return greatest;
    }
}