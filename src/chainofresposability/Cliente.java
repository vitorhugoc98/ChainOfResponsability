package chainofresposability;
public class Cliente {
    public static void main(String[] args) {
        CarroChain carro = new ConstruirMotor(); 
        carro.setNext(new ConstruirCarroceria());
        carro.setNext(new ConstruirInterior());
        
        try{
            carro.montarCarro(CarroChain.IDFaseCarro.faseMotor);
            carro.montarCarro(CarroChain.IDFaseCarro.faseCarroceria);
            carro.montarCarro(CarroChain.IDFaseCarro.faseInterior);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
