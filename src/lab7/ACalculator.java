package lab7;

abstract class ACalculator{
    protected Object state;

    public Object result() {
        return state;
    }
    public ACalculator clear() {
        this.init();
        return this;
    }
    abstract void init();


}
