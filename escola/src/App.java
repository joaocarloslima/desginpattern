import model.Aluno;
import service.SituacaoService;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {
        var aluno = new Aluno(1, "João", "A", 0, 0);
        var service = new SituacaoService();
        test(service, aluno, 0, 74, "Reprovado por falta");
        test(service, aluno, 0, 75, "Reprovado por nota");
        test(service, aluno, 3.9, 75, "Reprovado por nota");
        test(service, aluno, 4, 75, "Exame");
        test(service, aluno, 6.9, 75, "Exame");
        test(service, aluno, 7, 75, "Aprovado");
        test(service, aluno, 10, 75, "Aprovado");
    }

    private static void test(SituacaoService service, Aluno aluno, double nota, int frequencia, String situacaoEsperada) {
        aluno.setNota(nota);
        aluno.setFrequencia(frequencia);
        var situacao = service.processarSituacao(aluno);
        if (situacao.equals(situacaoEsperada)) {
            System.out.println(String.format("V nota=%.2f, freq=%d, sit=%s", nota, frequencia, situacao));
            return;
        }
        System.err.println(String.format("X nota=%.2f, freq=%d, sit=%s", nota, frequencia, situacao));

    }




}
