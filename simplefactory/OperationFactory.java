package simplefactory;

public class OperationFactory {
    public static Operations createOperate(String operate){
        Operations oper=null;
        switch (operate)
        {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;

        }
        return oper;
    }
}
