package org.proyectomatematicas.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import org.proyectomatematicas.main.Principal;

public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal;

    @FXML private AnchorPane sliderPrincipal;
    @FXML private AnchorPane sliderPitagoras;
    @FXML private AnchorPane sliderAngulos;
    @FXML private AnchorPane sliderH;
    @FXML private AnchorPane sliderZ;
    private TranslateTransition sliderTransition;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
@FXML
    private void showSliderPrincipal() {
        if (sliderPrincipal.isVisible()) {
            sliderTransition = new TranslateTransition(Duration.seconds(1), sliderPrincipal);
            sliderTransition.setToX(-sliderPrincipal.getWidth());
            sliderPrincipal.setVisible(false);
            sliderPitagoras.setVisible(false);
            sliderAngulos.setVisible(false);
            sliderH.setVisible(false);
            sliderZ.setVisible(false);
        } else {
            sliderTransition = new TranslateTransition(Duration.seconds(0.5), sliderPrincipal);
            sliderPrincipal.setVisible(true);
            sliderTransition.setFromX(-sliderPrincipal.getWidth());
            sliderTransition.setToX(0);
            sliderTransition.play();
        }
    }
    
    @FXML
    public void showSliderPitagoras() {
        sliderAngulos.setVisible(false);
        sliderH.setVisible(false);
        sliderZ.setVisible(false);
        if (sliderPitagoras.isVisible()) {
            sliderPitagoras.setVisible(false);
        } else {
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5), sliderPitagoras);
            fadeTransition.setFromValue(0.0); // Opacidad inicial (totalmente transparente)
            fadeTransition.setToValue(1.0);   // Opacidad final (totalmente visible)
            sliderPitagoras.setVisible(true);
            fadeTransition.play();
        }
    }
    @FXML
    public void showSliderAngulos() {
        sliderPitagoras.setVisible(false);
        sliderH.setVisible(false);
        sliderZ.setVisible(false);
        if (sliderAngulos.isVisible()) {
            sliderAngulos.setVisible(false);
        } else {
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5), sliderAngulos);
            fadeTransition.setFromValue(0.0); // Opacidad inicial (totalmente transparente)
            fadeTransition.setToValue(1.0);   // Opacidad final (totalmente visible)
            sliderAngulos.setVisible(true);
            fadeTransition.play();
        }
    }
    @FXML
    public void showSliderH() {
        sliderPitagoras.setVisible(false);
        sliderAngulos.setVisible(false);
        sliderZ.setVisible(false);
        if (sliderH.isVisible()) {
            sliderH.setVisible(false);
        } else {
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5), sliderH);
            fadeTransition.setFromValue(0.0); // Opacidad inicial (totalmente transparente)
            fadeTransition.setToValue(1.0);   // Opacidad final (totalmente visible)
            sliderH.setVisible(true);
            fadeTransition.play();
        }
    }
    @FXML
    public void showSliderZ() {
        sliderPitagoras.setVisible(false);
        sliderAngulos.setVisible(false);
        sliderH.setVisible(false);
        if (sliderZ.isVisible()) {
            sliderZ.setVisible(false);
        } else {
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5), sliderZ);
            fadeTransition.setFromValue(0.0); // Opacidad inicial (totalmente transparente)
            fadeTransition.setToValue(1.0);   // Opacidad final (totalmente visible)
            sliderZ.setVisible(true);
            fadeTransition.play();
        }
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
    
    public void ventanaProgramadores() {
        escenarioPrincipal.ventanaProgramadores();
    }
}
