package com.trinitarias.api_formulario.service;
@Service
public class ContratacionService {
    private ArrayList<ContratacionDto>lista=new ArrayList();
    
    //Obtener datos Dto
    public ArrayList<ContratacionDto> obtener(){
        return lista;
    }
    //Obtener un solo Dto
    public ContratacionDto verId(int id){
        for (ContratacionDto c:lista){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    //Crear Dto
    public void crear(ContratacionDatosBancarios datosbancarios, ContratacionDatosContacto datosContacto, ContratacionDatosPersonales datosPersonales, ContratacionDireccion direccion, ContratacionMetodoPago metodoPago){
        ContratacionDto cdto = new ContratacionDto(datosbancarios,datosContacto,datosPersonales,direccion,metodoPago);
        lista.add(cdto);

    }
    //Actualizar Dto
    public void actualizar(int id, ContratacionDto cd){
        for(ContratacionDto c lista){
            if(c.getId().equals(id)){
                c.setDatosBancarios(cd.getDatosbancarios);
                c.setDatosContacto(cd.getDatosContacto);
                c.setDatosPersonales(cd.getDatosPersonales);
                c.setDireccion(cd.getDireccion);
                c.setMetodoPago(cd.getMetodoPago);
            }
        }
    }
    //Borrar
    public void Borrar(int id){
        for (ContratacionDto c:lista){
            if(c.getId().equals(id)){
                lista.remove(c);
            }
        }
    }
}
