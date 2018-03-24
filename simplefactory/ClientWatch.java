package simplefactory;

public class ClientWatch {
    public  static  void  main(String[] args){
        Operations oper;
        oper = OperationFactory.createOperate("-");
        double result=oper.getResult(15,4);
        System.out.println(result);
    }
}
