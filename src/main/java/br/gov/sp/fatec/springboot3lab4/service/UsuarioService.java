package br.gov.sp.fatec.springboot3lab4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springboot3lab4.entity.Usuario;
import br.gov.sp.fatec.springboot3lab4.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;
    
    //metodo buscar usuario
    public List<Usuario> buscarTodos(){
        return usuarioRepo.findAll();
    }

    public Usuario novo(Usuario usuario){
        if(usuario == null ||
           usuario.getNome() == null ||
           usuario.getNome().isBlank() ||
           usuario.getSenha() == null ||
           usuario.getSenha().isBlank()) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Dados de usuário inválidos!");
           }
           return usuarioRepo.save(usuario);
    }
}
