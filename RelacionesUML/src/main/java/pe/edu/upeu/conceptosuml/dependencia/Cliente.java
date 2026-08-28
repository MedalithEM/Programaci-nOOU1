package pe.edu.upeu.conceptosuml.dependencia;

public class Cliente {
    //parametros de entrada: paypal
    public void realizarPago(Paypal paypal, double monto){
        paypal.pagar(monto);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Paypal paypal = new Paypal();
        cliente.realizarPago(paypal, 1000);
    }
}
