package br.senac.sp.model;

public class PassagemAerea {
    
    private Etapa etapa = Etapa.PESQUISANDO;
    private double valor = 200;

    public double calcularDesconto(){
        if (etapa == Etapa.PESQUISANDO){
            return valor * 0.1;
        } else if (etapa == Etapa.SELECIONANDO_VOO){
            return valor * 0.2;
        } else if (etapa == Etapa.SELECIONANDO_ASSENTO){
            return valor * 0.3;
        } else if (etapa == Etapa.RESERVANDO){
            return valor * 0.4;
        } else if (etapa == Etapa.EMITINDO){
            return valor * 0.5;
        } else if (etapa == Etapa.PAGANDO){
            return valor * 0.6;
        }
        return 0;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    


}
