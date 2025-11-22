package com.trinitarias.api_formulario.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.trinitarias.api_formulario.dto.ContratacionDto;
//SE PONE EL SERVICE PARA IDENTIFICARLO
@Service
public class ContratacionService {
	//ARRAYLIST DE OBJETO DTO
    private ArrayList<ContratacionDto>lista=new ArrayList();
    
    //OBTENER DATOS DTO ES DE TIPO DTO PORQUE DEBE DEVOLVERLO
    public ArrayList<ContratacionDto> obtener(){
        return lista;
    }
    //OBTENER UN SOLO DTO TIPO DTO Y DEPENDIENDO DEL ID DEVUELVE EL QUE QUEREMOS
    public ContratacionDto verId(Long id){
        for (ContratacionDto c:lista){
            if(c.getId().equals(id)){
                return c;
            }
        }
        //SINO DEVUELVE NULL
        return null;
    }
    //CREAR DTO DEVUELVE UN DTO Y AÑADE UN DTO AL ARRAYLIST DE DTOS
    public ContratacionDto crear(ContratacionDto condto){
        ContratacionDto cdto = condto;
        if(cdto!=null){
            lista.add(cdto);
        return cdto;
        }else{
        	//SINO ES NULL
            return null;
        }

    }
    //ACTUALIZAR DTO DEVUELVE UN DTO Y DEPENDIENDO DEL ID, CAMBIA ESE OBJETO DTO POR UNO NUEVO
    public ContratacionDto actualizar(Long id, ContratacionDto cd){
    	//BUCLE QUE BUSCA EL DTO SEGUN EL ID
        for(ContratacionDto c:lista){
        	//CUANDO LO ENCUENTRA CAMBIA SUS VALORES
            if(c.getId().equals(id)){
                c.setDatosBancarios(cd.getDatosbancarios);
                c.setDatosContacto(cd.getDatosContacto);
                c.setDatosPersonales(cd.getDatosPersonales);
                c.setDireccion(cd.getDireccion);
                c.setMetodoPago(cd.getMetodoPago);
                return c;
            }
        }
        //SINO RETORNA NULL
        return null;
    }
    //BORRAR DTO ES BOOLEANO YA QUE SI LO BORRAS NO PUEDES RETORNARLO
    public boolean borrar(Long id){
    	//BUCLE QUE LO BUSCA SEGUN EL ID
        for (ContratacionDto c:lista){
        	//SI LO ENCUENTRA LO BORRA
            if(c.getId().equals(id)){
                lista.remove(c);
                //Y DEVUELVE TRUE
                return true;
            }
        }
        //SINO DEVUELVE FALSE
        return false;
    }
}
