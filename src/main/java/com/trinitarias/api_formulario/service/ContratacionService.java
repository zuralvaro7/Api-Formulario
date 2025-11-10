package com.trinitarias.api_formulario.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.trinitarias.api_formulario.dto.ContratacionDto;

@Service
public class ContratacionService {
    private ArrayList<ContratacionDto>lista=new ArrayList();
    
    //Obtener datos Dto
    public ArrayList<ContratacionDto> obtener(){
        return lista;
    }
    //Obtener un solo Dto
    public ContratacionDto verId(Long id){
        for (ContratacionDto c:lista){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    //Crear Dto
    public ContratacionDto crear(ContratacionDto condto){
        ContratacionDto cdto = condto;
        if(cdto!=null){
            lista.add(cdto);
        return cdto;
        }else{
            return null;
        }

    }
    //Actualizar Dto
    public ContratacionDto actualizar(Long id, ContratacionDto cd){
        for(ContratacionDto c:lista){
            if(c.getId().equals(id)){
                c.setDatosBancarios(cd.getDatosBancarios());
                c.setDatosContacto(cd.getDatosContacto());
                c.setDatosPersonales(cd.getDatosPersonales());
                c.setDireccion(cd.getDireccion());
                c.setMetodoPago(cd.getMetodoPago());
                return c;
            }
        }
        return null;
    }
    //Borrar
    public boolean borrar(Long id){
        for (ContratacionDto c:lista){
            if(c.getId().equals(id)){
                lista.remove(c);
                return true;
            }
        }
        return false;
    }
}
