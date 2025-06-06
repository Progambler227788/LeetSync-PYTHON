class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for(String token : tokens) {

            
            if ( token.equals("+")  || token.equals("-") || token.equals("*") || token.equals("/")  ){
                int b = stack.pop();
                int a = stack.pop();

                if ( token.equals("+") ){
                    stack.push(a+b);
                }
                else if (token.equals("*")){
                    stack.push(a*b);
                }
                else if (token.equals("/") ){
                    stack.push(a/b);
                }
                else if (token.equals("-") ){
                    stack.push(a-b);
                }
                
            }

            else {
                stack.push(  Integer.valueOf(token) );
                

            }

        }

        return stack.peek();
        
    }


}