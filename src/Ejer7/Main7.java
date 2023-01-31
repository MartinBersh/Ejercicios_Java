package Ejer7;

public class Main7 {

    public static void main(String[] args) {
        ENvio eNvio = new ENvio();

        eNvio.numeroGuia = 7854;
        eNvio.setFecha("11/09/22");
        eNvio.setTipoEmbalaje("Caja");
        eNvio.cedulaCliente = 1119273;
        eNvio.setPeso(12);
        eNvio.setCiudadOrigen("Cali");
        eNvio.setCiudadDestino("Pereira");
        eNvio.setCosto(48000);
        eNvio.setEstadoEnvio("Enviado");

        System.out.println("El costo por kilo de su envio es de: " + eNvio.calcularCostoXKilo() + " ya que su paquete tiene un peso de: " + eNvio.getPeso() + "kg");

        System.out.println(eNvio.verificarEntrega());


    }
}
