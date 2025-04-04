package lab7;

public class  NewIntCalculator extends ACalculator {
    void init(){

    }

    int state;
    public  NewIntCalculator(int state){
        this.state = state;
    }
    public  NewIntCalculator add(int nr){
        this.state=state+nr;
        return this;
    }
    public  NewIntCalculator subtract(int nr){
        this.state=state-nr;
        return this;
    }
    public  NewIntCalculator multiply(int nr){
        this.state=state*nr;
        return this;
    }
    public  NewIntCalculator divide(int nr){
        this.state=state/nr;
        return this;
    }
    public Integer result(){
        return state;

    }
}
