package service;

import model.Recurso;
import model.Usuario;

public class AutenticacaoService {
    public String autenticar(Usuario usuario, String senha, Recurso recurso){
        if (!usuario.getSenha().equals(senha)){
            return "Senha inválida";
        }else if(!usuario.getPerfil().equals(recurso.getPerfilNecessario())){
            return "Acesso negado ao recurso " + recurso.getNome();
        }else if(!recurso.isAtivo()){
            return "Recurso " + recurso.getNome() + " inativo";
        }else {
            return "Acesso concedido ao recurso " + recurso.getNome();
        }
        
    }
}
