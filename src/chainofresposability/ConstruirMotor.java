package chainofresposability;
public class ConstruirMotor extends CarroChain{

    public ConstruirMotor(){
        super(IDFaseCarro.faseMotor);
    }
    
    @Override
    protected void construirCarro() {
        System.out.println("Motor esta pronto.");
    }
    
}
