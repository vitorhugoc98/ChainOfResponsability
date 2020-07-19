package chainofresposability;
public abstract class CarroChain {
    protected CarroChain next; 
    protected IDFaseCarro identificadorCarro;
    
    public CarroChain(IDFaseCarro id){
        next = null; 
        identificadorCarro = id; 
    }
    
    public enum IDFaseCarro{
        faseMotor,
        faseCarroceria, 
        faseInterior;
    }
    
    public void setNext(CarroChain proximo){
        if(next == null){
            next = proximo; 
        }else{
            next.setNext(proximo);
        }
    }
    
    public void montarCarro(IDFaseCarro id) throws Exception{
        if(podeMontarCarro(id)){
            construirCarro();
        }else{
            if(next == null){
                throw new Exception("Impossivel montar o carro, verifique a linha de montagem."); 
            }
            next.montarCarro(id);
        }
    }
    
    private boolean podeMontarCarro(IDFaseCarro id){
        if(identificadorCarro == id){
            return true; 
        }
        return false; 
    }
    
    protected abstract void construirCarro(); 
}
