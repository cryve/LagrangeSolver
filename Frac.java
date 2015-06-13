public class Frac{
    
    private int numerator;
    private int denominator;
    
    public Frac(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void reduce(){
        int ggt = GGT.calc(numerator, denominator);
        numerator = numerator / ggt;
        denominator = denominator / ggt;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;   
    }
    
    public String toString(){
        return "("+numerator+"/"+denominator+")";   
    }
    
    public void addFrac(Frac fracture){
        int num2 = fracture.getNumerator();
        int denom2 = fracture.getDenominator();
        numerator = numerator * denom2 + num2 * denominator;
        denominator = denominator * denom2;
        reduce();
    }
    
    public void addInt(int summand){
        numerator = numerator * 1 + summand * denominator;
        reduce();
    }
    
    public void multByFrac(Frac fracture){
        int num2 = fracture.getNumerator();
        int denom2 = fracture.getDenominator();
        numerator = numerator * num2;
        denominator = denominator * denom2;
        reduce();
    }
    
    public void multByInt(int factor){
        numerator = numerator * factor;
        reduce();
    }
}