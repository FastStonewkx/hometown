package com.test.operation;

public abstract class Operation {
     double NumberA;
     double NumberB;
     public double getNumberA(){
          return  NumberA;
     }

     public void setNumberA(double numberA) {
          NumberA = numberA;
     }

     public double getNumberB() {
          return NumberB;
     }

     public void setNumberB(double numberB) {
          NumberB = numberB;
     }

     public abstract double GetRsult();

}
