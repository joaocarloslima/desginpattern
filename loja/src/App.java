import model.Produto;
import service.DescontoService;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {
        var produto = new Produto(1, "Televisão", "Smart 55", 4_000.0, 0);
        var service = new DescontoService();
        test(service, produto, 0, 0);
        test(service, produto, 4, 0);
        test(service, produto, 5, 0);
        test(service, produto, 6, 200);
        test(service, produto, 9, 200);
        test(service, produto, 10, 200);
        test(service, produto, 11, 400);
        test(service, produto, 20, 400);
    }

    private static void test(DescontoService service, Produto produto, int quantidade, double descontoEsperado) {
        produto.setQuantidade(quantidade);
        var desconto = service.calcularDesconto(produto);
        if (desconto == descontoEsperado) {
            System.out.println(String.format("V qtde=%d, desconto=%.2f", quantidade, desconto));
            return;
        } 
        System.err.println(String.format("X qtde=%d, desconto=%.2f", quantidade, desconto));

    }




}
