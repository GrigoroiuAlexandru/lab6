public class IntCalculator {
    int state;

    IntCalculator(int nr){
        this.state=nr;
    }
    public IntCalculator add(int nr1){
        this.state=nr1+state;
        return this;
    }
    public IntCalculator subtract(int nr2){
        this.state=state-nr2;
        return this;
    }
    public IntCalculator multiply(int nr3){
        this.state=state*nr3;
        return this;
    }
    public int result(){
        return state;
    }
}
