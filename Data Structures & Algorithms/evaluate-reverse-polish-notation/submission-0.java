class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stc = new Stack();
       for(String s:tokens)
       {
        if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/"))
        {
            stc.push(Integer.valueOf(s));
        }
        else{
            int secondOperand = stc.pop();
            int firstOperand = stc.pop();
             int calculation=0;
            if(s.equals("+"))
            calculation = firstOperand + secondOperand;
            else if(s.equals("-"))
            calculation = firstOperand - secondOperand;
            else if(s.equals("*"))
            calculation = firstOperand * secondOperand;
            else if(s.equals("/"))
            calculation = firstOperand / secondOperand;
            stc.push(calculation); 
        }
       }
       return stc.pop();
    }
}
