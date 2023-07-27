package org.proyectomatematicas.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.proyectomatematicas.main.Principal;

public class BinarioController implements Initializable {
    private Principal escenarioPrincipal;
    
    @FXML private TextField txtNumeroEntero;
    @FXML private TextField txtNumeroBinario;
    @FXML private Button btnConvertir;
    @FXML private Button btnConvertirOtro;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        limpiarControles();
    }
    
    public void convertirNumero() {
        if (txtNumeroEntero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
            System.out.println("hila");
        } else {
            System.out.println("HOla");
            try {
                int numero = Integer.parseInt(txtNumeroEntero.getText().trim());
                Integer num = numero;
                txtNumeroBinario.setText(String.valueOf(intABinario(num)));
                btnConvertir.setDisable(true);
                desactivarControles();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void convertirOtroNumero() {
        limpiarControles();
        activarControles();
        btnConvertir.setDisable(false);
    }
    
    public void limpiarControles() {
        txtNumeroEntero.clear();
        txtNumeroBinario.clear();
    }
    
    public void desactivarControles() {
        txtNumeroEntero.setEditable(false);
        txtNumeroBinario.setDisable(false);
    }
    
    public void activarControles() {
        txtNumeroEntero.setEditable(true);
        txtNumeroBinario.setDisable(false);
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void menuPrincipal() {
        escenarioPrincipal.menuPrincipal();
    }
    
    public String intABinario(Integer numeroEntero) {
        return Integer.toBinaryString(numeroEntero);
    }
}
