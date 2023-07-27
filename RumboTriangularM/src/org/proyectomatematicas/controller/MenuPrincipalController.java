package org.proyectomatematicas.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.proyectomatematicas.main.Principal;

public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void ventanaBinario() {
        escenarioPrincipal.ventanaBinario();
    }
    
    public void ventanaHexadecimal() {
        escenarioPrincipal.ventanaHexadecimal();
    }
    
    public void ventanaOctal() {
        escenarioPrincipal.ventanaOctal();
    }
    
    public void ventanaAC() {
        escenarioPrincipal.ventanaAC();
    }
    
    public void ventanaAB() {
        escenarioPrincipal.ventanaAB();
    }
    
    public void ventanaAngulo() {
        escenarioPrincipal.ventanaAngulo();
    }
    
    public void ventanaCoseno() {
        escenarioPrincipal.ventanaCoseno();
    }
    
    public void ventanaSeno() {
        escenarioPrincipal.ventanaSeno();
    }
    
    public void ventanaLadoA() {
        escenarioPrincipal.ventanaLadoA();
    }
    
    public void ventanaLadoB() {
        escenarioPrincipal.ventanaLadoB();
    }
    
    public void ventanaLadoC() {
        escenarioPrincipal.ventanaLadoC();
    }
}
