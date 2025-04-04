package lab7;

public class DoubleCalculator extends ACalculator {
    void init(){

    }
    double state;
    public  DoubleCalculator (double state){
        this.state = state;
    }
    public DoubleCalculator add(double nr){
        this.state=state+nr;
        return this;
    }
    public DoubleCalculator subtract(double nr){
        this.state=state-nr;
        return this;
    }
    public DoubleCalculator multiply(double nr){
        this.state=state*nr;
        return this;
    }
    public DoubleCalculator divide(double nr){
        this.state=state/nr;
        return this;
    }
    public  Double result() {
        return state;
    }
}
