package simplefactory;

public abstract class Operations {
    private double _numberA = 0;
    private double _numherB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numherB() {
        return _numherB;
    }

    public void set_numherB(double _numherB) {
        this._numherB = _numherB;
    }

    abstract double getResult(double _numberA, double _numherB);
}
