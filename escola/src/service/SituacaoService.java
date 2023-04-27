package service;

import model.Aluno;

public class SituacaoService {
    public String processarSituacao(Aluno aluno){
        var frequencia = aluno.getFrequencia();
        var nota = aluno.getNota();
        if (frequencia < 75) {
            return "Reprovado por falta";
        }
        if (nota < 4) {
            return "Reprovado por nota";
        }
        if (nota < 7) {
            return "Exame";
        }
        return "Aprovado";
    }
}
