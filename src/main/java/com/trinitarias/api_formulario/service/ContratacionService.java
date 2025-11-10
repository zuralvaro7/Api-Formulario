package com.trinitarias.api_formulario.service;
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
    public boolean crear(ContratacionDto condto){
        ContratacionDto cdto = condto;
        if(cdto!=null){
            lista.add(cdto);
        return true
        }else{
            return false;
        }

    }
    //Actualizar Dto
    public boolean actualizar(Long id, ContratacionDto cd){
        for(ContratacionDto c lista){
            if(c.getId().equals(id)){
                c.setDatosBancarios(cd.getDatosbancarios);
                c.setDatosContacto(cd.getDatosContacto);
                c.setDatosPersonales(cd.getDatosPersonales);
                c.setDireccion(cd.getDireccion);
                c.setMetodoPago(cd.getMetodoPago);
                return true;
            }
        }
        return false;
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
