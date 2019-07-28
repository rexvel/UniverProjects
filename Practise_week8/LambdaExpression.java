package Practise_week8;

public class LambdaExpression {
    public static void main(String args[]) {
    operationable  oper ;
    oper = ((x, y) -> x*y);
    int result = oper.calculate(10,20);
        System.out.println(result);

    }
}
     interface  operationable{
         int calculate (int x, int y);
     }


