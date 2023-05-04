package br.senac.sp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.senac.sp.model.Etapa;
import br.senac.sp.model.PassagemAerea;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
    public void deveRetornar10PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.PESQUISANDO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 20);
    }

    @Test
    public void deveRetornar20PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.SELECIONANDO_VOO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 40);
    }

    @Test
    public void deveRetornar30PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.SELECIONANDO_ASSENTO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 60);
    }

    @Test
    public void deveRetornar40PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.RESERVANDO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 80);
    }

    @Test
    public void deveRetornar50PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.EMITINDO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 100);
    }

    @Test
    public void deveRetornar60PorcentoDeDesconto(){
        PassagemAerea passagem = new PassagemAerea();
        passagem.setEtapa(Etapa.PAGANDO);
        double desconto = passagem.calcularDesconto();
        assertTrue(desconto == 120);
    }

    
   
}
