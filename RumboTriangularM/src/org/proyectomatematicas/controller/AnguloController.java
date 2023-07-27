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

public class AnguloController implements Initializable {
    private Principal escenarioPrincipal;

    @FXML private TextField txtAB;
    @FXML private TextField txtCD;
    @FXML private Label lblRespuesta;
    @FXML private Button btnCalcular;
    @FXML private Button btnCalcularOtro;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        limpiarControles();
        lblRespuesta.setVisible(false);
    }

    public void calcular() {
        if (txtAB.getText().isEmpty() || txtCD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
            limpiarControles();
        } else {
            double AB = Double.parseDouble(txtAB.getText().trim());
            double CD = Double.parseDouble(txtCD.getText().trim());
            if (AB < CD) {
                JOptionPane.showMessageDialog(null, "El segmento AB no puede ser menor que AC");
                limpiarControles();
            } else {
                AB = 0;
                CD = 0;
                AB = Double.parseDouble(txtAB.getText().trim());
                CD = Double.parseDouble(txtCD.getText().trim());
                double res = AB -  CD;
                double resultado = res/2;
                lblRespuesta.setVisible(true);
                lblRespuesta.setText("El ángulo θ mide: " + resultado);
                desactivarControles();
                btnCalcular.setDisable(true);
            }
        }
    }
    
    public void calcularOtro() {
        btnCalcular.setDisable(false);
        lblRespuesta.setVisible(false);
        limpiarControles();
        activarControles();
    }
    
    public void limpiarControles() {
        txtAB.clear();
        txtCD.clear();
    }
    
    public void desactivarControles() {
        txtAB.setEditable(false);
        txtCD.setEditable(false);
    }
    
    public void activarControles() {
        txtAB.setEditable(true);
        txtCD.setEditable(true);
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
