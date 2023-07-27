package org.proyectomatematicas.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.proyectomatematicas.main.Principal;

public class LeySenoController implements Initializable {
    private Principal escenarioPrincipal;

    @FXML private TextField txtA;
    @FXML private TextField txtF;
    @FXML private Label lblRespuesta;
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    @FXML private TextField txtL;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    limpiarControles();
    }
    
    public void calcular(){
        if (txtA.getText().isEmpty() || txtF.getText().isEmpty() || txtL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double a = Double.parseDouble(txtA.getText().trim());
            double f = Double.parseDouble(txtF.getText().trim());
            double l = Double.parseDouble(txtL.getText().trim());
            double r1 = 90 - a;
            double ar1 = Math.toRadians(r1);
            double r2 = 90 - f;
            double r3 = 180 - (r1+r2);
            double ar3 = Math.toRadians(r3);
            double resultado = (l * Math.sin(ar3)) / Math.sin(ar1);
            lblRespuesta.setVisible(true);
            lblRespuesta.setText("El valor de h es: " + resultado);
            desactivarControles();
            btnCalcular.setDisable(true);
        }
    }
    
    public void calcularOtro() {
        btnCalcular.setDisable(false);
        lblRespuesta.setVisible(false);
        limpiarControles();
        activarControles();
    }
    
    public void limpiarControles() {
        txtA.clear();
        txtF.clear();
        txtL.clear();
    }
    public void desactivarControles() {
        txtA.setEditable(false);
        txtF.setEditable(false);
        txtL.setEditable(false);
    }
    public void activarControles() {
        txtA.setEditable(true);
        txtF.setEditable(true);
        txtL.setEditable(true);
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

}
