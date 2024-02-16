
package contabanco;


public class contabanco2 {
 public int numconta;
 protected String tipo;
 private String dono;
 private float saldo;
 private boolean status;
 
 
 void estadoatual(){
     System.out.println("---------------------------");
     System.out.println("conta "+this.getNumconta()); 
     System.out.println("dono: "+ this.getDono());
     System.out.println("tipo: "+this.getTipo());
     System.out.println("saldo: "+this.getSaldo());
     System.out.println("status: "+this.getStatus());
     System.out.println("---------------------------");
 }
 
  void abrirconta(String t){
    this.setTipo(t);
    this.setStatus(true);
      if (t == "cc") {
          this.setSaldo(50);
          
      } else if (t=="cp") {
          this.setSaldo(150);
      }
      System.out.println("conta aberta com sucesso");
 }
 void fecharconta(){
     if(this.getSaldo()> 0){
         System.out.println("conta nao pode ser fechada ainda tem dinheiro");
     } else if(this.getSaldo()<0){
         System.out.println("conta nao pode ser fechada falta dinheiro");
     } else {
         this.setStatus(false);
         System.out.println("conta fechada com sucesso");
     }
         
 }
 void depositar(float v){
     if (this.getStatus()){
       this.setSaldo(this.getSaldo()+v);
         System.out.println("deposito realizado  na conta de "+ this.getDono());
     }else {
         System.out.println("nao foi possivel depositar");
     }
 }
 void sacar(float v){
     if (this.getStatus()){
        if(this.getSaldo()>= v){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("saque realizado na conta"+this.getDono());
        }else {
            System.out.println("nao tem saldo");
        }
     }else {
         System.out.println("essa conta nao existe");
     }
     
 }
 void pagamentomensal(){
   int v=0;
   if(this.getTipo()=="cc"){
       v=12;
   }else if(this.getTipo()=="cp"){
       v=20;
   } if (this.getStatus()){
       this.setSaldo(this.getSaldo()-v);
       System.out.println("mensalidade paga com sucesso pela conta "+this.getDono() );
   }else {
       System.out.println("impossivel pagar essa conta");
   }
 }

    public contabanco2() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
