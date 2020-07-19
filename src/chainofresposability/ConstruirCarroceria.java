package chainofresposability;
public class ConstruirCarroceria extends CarroChain{
 
    public ConstruirCarroceria(){
        super(IDFaseCarro.faseCarroceria);
    }
    
    @Override
    protected void construirCarro() {
        System.out.println("Carroceria esta pronta.");
    }
}
