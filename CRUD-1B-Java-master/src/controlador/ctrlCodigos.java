package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Codigos;
import vista.frmCodigos;

//3- Heredar la clase de las acciones (clic, teclear): write "implements MouseListener" luego
// le doy alt+enter > "implement all abstract methods", saldrán varias lineas de codigo
public class ctrlCodigos implements MouseListener{
    
    //1- Llamar a las otras dos capas (modelo y la vista)
    private Codigos modelo;
    private frmCodigos vista;
    
 
       //2- Crear un constructor de la clase, el "que pido" no va en lo regular, hoy se pone por practica y 
       //para entender, generalmente solo es "modelo" y "vista". 
    public ctrlCodigos(Codigos modelo, frmCodigos vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
        
       //SIEMPRE PONER ESTO, SON LOS BOTONES, HAY QUE MANDAR A LLAMAR
       //Es antes o des pues,generalmente lo ponemos despues
        modelo.Mostrar(vista.jtbCodigos);
        vista.btnElimnar.addMouseListener(this);
        vista.jtbCodigos.addMouseListener(this);
    }
    
    //4- Elimino los "throw new" de todos antes de progrmar las acciones
    @Override
    public void mouseClicked(MouseEvent e) {
         //4.1 Mando a llamar los textfield cuando sea cliqueado el btnAgregar
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre_estudiante(vista.txtNombre.getText());
            modelo.setCarnet_estudiante(Integer.parseInt(vista.txtCarnet.getText()));
            modelo.setTipo_Codigo(vista.txtTipoCodigo.getText());
            
            //4.2 Cierro lo mandado a llamar, para que funcione
            modelo.Guardar();
            modelo.Mostrar(vista.jtbCodigos);                 
        }
        //(Clase2) 
        if (e.getSource() == vista.btnElimnar){
            modelo.Eliminar(vista.jtbCodigos);
            modelo.Mostrar(vista.jtbCodigos);    
        }
        
        if(e.getSource() == vista.jtbCodigos){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre_estudiante(vista.txtNombre.getText());
            modelo.setTipo_Codigo(vista.txtTipoCodigo.getText());
            modelo.setCarnet_estudiante(Integer.parseInt(vista.txtCarnet.getText()));
            
            modelo.Actualizar(vista.jtbCodigos);
            modelo.Mostrar(vista.jtbCodigos);
        }
        
    }
    
    //5- Voy a source en la vista, en frm, en el diseño pues
    // y pongo el init correspondiente para hacerlo visible

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
   
}
