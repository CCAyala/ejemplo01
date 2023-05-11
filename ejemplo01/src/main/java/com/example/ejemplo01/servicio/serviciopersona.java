package com.example.ejemplo01.servicio;

import com.example.ejemplo01.entidad.persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class serviciopersona {


    public List<persona> personas= new ArrayList<>();

    public serviciopersona() {
        personas.add(new persona("camilo",18,"camilo@hotmail.com"));
        personas.add(new persona("andrea",20,"correo2@hotmail.com"));
        personas.add(new persona("juan",22,"correo3@hotmail.com"));
        personas.add(new persona("camilo",25,"correo4@hotmail.com"));
        personas.add(new persona("camilo",20,"camilo@hotmail.com"));

    }

    public List<persona> listarpersona(){
        return personas;
    }
}
