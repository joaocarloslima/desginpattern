package br.senac.sp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.senac.sp.model.Estado;
import br.senac.sp.model.Maquina;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void deveZerarOSaldoAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        maquina.cancelar();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveZerarOSaldoAoSolicitarCafe()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00);
        maquina.solicitarCafe();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveRetornarCreditoInsuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        assertTrue(maquina.getEstado() == Estado.CREDITO_INSUFICIENTE);
    }

    @Test
    public void deveRetornarCreditoSuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00);
        assertTrue(maquina.getEstado() == Estado.CREDITO_SUFICIENTE);
    }

    @Test
    public void deveRetornarInicial()
    {
        Maquina maquina = new Maquina();
        assertTrue(maquina.getEstado() == Estado.INICIAL);
    }

    @Test
    public void deveRetornarInicialAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00);
        maquina.cancelar();
        assertTrue(maquina.getEstado() == Estado.INICIAL);
        
    }


}
