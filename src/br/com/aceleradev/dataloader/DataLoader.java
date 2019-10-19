package br.com.aceleradev.dataloader;

import br.com.aceleradev.repositories.DisciplinaRepository;
import br.com.aceleradev.repositories.UsuarioRepository;

import java.util.Objects;

public final class DataLoader {
    private static DisciplinaRepository disciplinaRepository;
    private static UsuarioRepository usuarioRepository;

    public static synchronized DisciplinaRepository getDisciplinaRepository(){
        if (Objects.isNull(disciplinaRepository)) {
            disciplinaRepository = new DisciplinaRepository();
        }
        return disciplinaRepository;
    }

    public static synchronized  UsuarioRepository getUsuarioRepository(){
        if(Objects.isNull(usuarioRepository)){
            usuarioRepository = new UsuarioRepository();
        }
        return usuarioRepository;
    }

    private DataLoader(){ }

}
