public class LagrangeSolver {
	
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    Frac factP1;
    Frac factP2;
    Frac factP3;
    
    public LagrangeSolver(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;        
    }
    
    private Frac coeff1() {        
        factP1 = new Frac(y1, ((x1-x2) * (x1-x3)));        
        factP2 = new Frac(y2, ((x2-x1) * (x2-x3)));        
        factP3 = new Frac(y3, ((x3-x1) * (x3-x2)));
        Frac coeff1 = new Frac(factP1.getNumerator(), factP1.getDenominator());
        coeff1.addFrac(factP2);
        coeff1.addFrac(factP3);
        return coeff1;
    }
    
    private Frac coeff2() {
        Frac temp = new Frac(factP1.getNumerator(), factP1.getDenominator());
        temp.multByInt((-x2-x3));
        Frac coeff2 = new Frac(temp.getNumerator(), temp.getDenominator());
        
        temp = new Frac(factP2.getNumerator(), factP2.getDenominator());
        temp.multByInt((-x1-x3));
        coeff2.addFrac(temp);
        
        temp = new Frac(factP3.getNumerator(), factP3.getDenominator());
        temp.multByInt((-x1-x2));
        coeff2.addFrac(temp);
            
        return coeff2;
    }
    
    private Frac coeff3() {
        Frac temp = new Frac(factP1.getNumerator(), factP1.getDenominator());
        temp.multByInt((x2*x3));
        Frac coeff3 = new Frac(temp.getNumerator(), temp.getDenominator());
        
        temp = new Frac(factP2.getNumerator(), factP2.getDenominator());
        temp.multByInt((x1*x3));
        coeff3.addFrac(temp);
        
        temp = new Frac(factP3.getNumerator(), factP3.getDenominator());
        temp.multByInt((x1*x2));
        coeff3.addFrac(temp);
        
        return coeff3;
    }
    
    public String toString() {
        return "p(x) = "+coeff1()+"x^2 + "+coeff2()+"x + "+coeff3();
    }
}