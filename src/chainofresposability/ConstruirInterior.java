package chainofresposability;
public class ConstruirInterior extends CarroChain{
    
    public ConstruirInterior(){
        super(IDFaseCarro.faseInterior);
    }
    
    @Override
    protected void construirCarro() {
        System.out.println("Interior esta pronto.");
    }
}
