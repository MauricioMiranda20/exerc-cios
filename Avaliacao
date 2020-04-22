
public class Avaliacao {
    private float peso;
    private float altura;
    private float indice;
    
    public Avaliacao(float peso,float altura){
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso = peso;
        
    }
    public float getAltura(){
        return this.altura = altura;
    }
    
    public float indice(){
        return this.indice = this.peso / (this.altura * this.altura);
    }
    
    public String classificacao(){
        String pes;
        if(this.indice < 18){
            return "MAGRO";
        }
        if(this.indice >= 18 && this.indice <= 30){
            return "EQUILIBRADO";
        }
        if(this.indice > 30){
           return "OBESO";
        }
        return null;
    }
    
}
