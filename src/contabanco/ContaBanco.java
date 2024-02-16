
package contabanco;


public class ContaBanco {

    public static void main(String[] args) {
     contabanco2 p1 = new contabanco2();
     p1.setNumconta(1111);
     p1.setDono("josé");
     p1.setSaldo(0);
     p1.abrirconta("cc");
     p1.depositar(300);
     p1.sacar(350);
     p1.fecharconta();
     p1.estadoatual();
    
     
     contabanco2 p2= new contabanco2();
     p2.setNumconta(2222);
     p2.setDono("fernada");
     p2.setSaldo(0);
     p2.abrirconta("cp");
     p2.depositar(500);
     p2.sacar(250);
     p2.estadoatual();
     
     contabanco2 p3 = new contabanco2();
    
    }
    
}
