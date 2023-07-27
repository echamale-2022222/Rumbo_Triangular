package org.proyectomatematicas.main;

import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.proyectomatematicas.controller.AnguloController;
import org.proyectomatematicas.controller.BinarioController;
import org.proyectomatematicas.controller.HexadecimalController;
import org.proyectomatematicas.controller.LadoAController;
import org.proyectomatematicas.controller.LadoBController;
import org.proyectomatematicas.controller.LadoCController;
import org.proyectomatematicas.controller.LeyCosenoController;
import org.proyectomatematicas.controller.LeySenoController;
import org.proyectomatematicas.controller.LongitudABController;
import org.proyectomatematicas.controller.LongitudACController;
import org.proyectomatematicas.controller.MenuPrincipalController;
import org.proyectomatematicas.controller.OctalController;

public class Principal extends Application {
    
    private final String PAQUETE_VISTA = "/org/proyectomatematicas/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Rumbo Triangular");
        menuPrincipal();
        escenarioPrincipal.setResizable(false);
        escenarioPrincipal.show();
    }
    
    public void menuPrincipal() {
        try {
            MenuPrincipalController menu = (MenuPrincipalController)cambiarEscena("MenuView.fxml",623,403);
            menu.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaBinario() {
        try {
            BinarioController binario = (BinarioController)cambiarEscena("BinarioView.fxml",323,333);
            binario.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaHexadecimal() {
        try {
            HexadecimalController hexadecimal = (HexadecimalController)cambiarEscena("HexadecimalView.fxml",378,338);
            hexadecimal.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaOctal() {
        try {
            OctalController octal = (OctalController)cambiarEscena("OctalView.fxml",323,333);
            octal.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaAC() {
        try {
            LongitudACController ac = (LongitudACController)cambiarEscena("LongitudACView.fxml",600,320);
            ac.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaAB() {
        try {
            LongitudABController ab = (LongitudABController)cambiarEscena("LongitudABView.fxml",600,320);
            ab.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaAngulo() {
        try {
            AnguloController angulo = (AnguloController)cambiarEscena("AnguloView.fxml",600,320);
            angulo.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaCoseno() {
        try {
            LeyCosenoController coseno = (LeyCosenoController)cambiarEscena("LeyCosenoView.fxml",600,320);
            coseno.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaSeno() {
        try {
            LeySenoController seno = (LeySenoController)cambiarEscena("LeySenoView.fxml",600,320);
            seno.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaLadoA() {
        try {
            LadoAController ladoA = (LadoAController)cambiarEscena("LadoAView.fxml",600,400);
            ladoA.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaLadoB() {
        try {
            LadoBController ladoB = (LadoBController)cambiarEscena("LadoBView.fxml",600,400);
            ladoB.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ventanaLadoC() {
        try {
            LadoCController ladoC = (LadoCController)cambiarEscena("LadoCView.fxml",600,400);
            ladoC.setEscenarioPrincipal(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception {
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho, alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }
}
