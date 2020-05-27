/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.*;

/**
 *
 * @author paul_
 */
public class VentanaAgenda extends Frame {

    public VentanaAgenda(String title) {

        this.setTitle(title);

        this.setSize(600, 500);
        this.setLocation(200, 200);

        Panel pPrincipal = new Panel();
        Panel pNorte = new Panel();
        Panel pCentro = new Panel();
        
        Panel pRegistrar = new Panel();
        BorderLayout posicionesInterfaz = new BorderLayout();

        this.setLayout(posicionesInterfaz);

        
        Label entrada = new Label("Bienvenido al menu de Usuario");
        pNorte.add(entrada);
        pNorte.setBackground(Color.WHITE);
        entrada.setForeground(Color.WHITE);
        this.add(pNorte, BorderLayout.NORTH);
        GridLayout malla1 = new GridLayout(5, 1);
        pPrincipal.setLayout(malla1);
        pCentro.setLayout(malla1);

        GridLayout malla2 = new GridLayout(6, 2, 7, 0);
        pRegistrar.setLayout(malla2);

        Label ingresarTel = new Label("Ingrese  telefono");
        Label espacio = new Label("");
        Label codigoTelefono = new Label("Ingrese  codigo del telefono: \n");
        TextField codigo = new TextField("", 10);
        Label numeroTelefono = new Label("Ingrese  numero de telefono: \n");
        TextField numero = new TextField("", 10);
        Label tipoTelefono = new Label("Ingrese  tipo de telefono: \n");
        TextField tipo = new TextField("", 10);
        Label operadoraTelefono = new Label("Ingrese  operadora del telefono: \n");
        TextField operadora = new TextField("", 10);
        Button volver = new Button("Volver");
        volver.setBackground(Color.GRAY);
        volver.setForeground(Color.WHITE);
        Button registrar = new Button("Registrar");
        registrar.setBackground(Color.GRAY);
        registrar.setForeground(Color.WHITE);

        pRegistrar.add(ingresarTel);
        pRegistrar.add(espacio);
        pRegistrar.add(codigoTelefono);
        pRegistrar.add(codigo);
        pRegistrar.add(numeroTelefono);
        pRegistrar.add(numero);
        pRegistrar.add(tipoTelefono);
        pRegistrar.add(tipo);
        pRegistrar.add(operadoraTelefono);
        pRegistrar.add(operadora);
        pRegistrar.add(volver);
        pRegistrar.add(registrar);
        pCentro.add(pRegistrar);

        Panel editar = new Panel();
        Panel pEditar = new Panel();

        GridLayout malla3 = new GridLayout(6, 2, 7, 0);
        pEditar.setLayout(posicionesInterfaz);
        editar.setLayout(malla3);

        Label ingresarNuevoTelefono = new Label("Ingrese  datos del nuevo telefono");
        Label espacio1 = new Label("");
        Label codigoTelefonoNuevo = new Label("Ingrese nuevo codigo del telefono: \n");
        TextField codigoNuevo = new TextField("", 10);
        Label numeroTelefonoNuevo = new Label("Ingrese  nuevo numero de telefono: \n");
        TextField numeroNuevo = new TextField("", 10);
        Label tipoTelefonoNuevo = new Label("Ingrese  nuevo tipo de telefono: \n");
        TextField tipoNuevo = new TextField("", 10);
        Label operadoraTelefonoNuevo = new Label("Ingrese  nueva operadora del telefono: \n");
        TextField operadoraNuevo = new TextField("", 10);
        Button volver1 = new Button("Volver");
        volver1.setBackground(Color.GRAY);
        volver1.setForeground(Color.WHITE);
        Button actualizar = new Button("Registrar");
        actualizar.setBackground(Color.GRAY);
        actualizar.setForeground(Color.WHITE);

        editar.add(ingresarNuevoTelefono, BorderLayout.NORTH);
        editar.add(espacio1);
        editar.add(codigoTelefonoNuevo);
        editar.add(codigoNuevo);
        editar.add(numeroTelefonoNuevo);
        editar.add(numeroNuevo);
        editar.add(tipoTelefonoNuevo);
        editar.add(tipoNuevo);
        editar.add(operadoraTelefonoNuevo);
        editar.add(operadoraNuevo);
        editar.add(volver1);
        editar.add(actualizar);
        pCentro.add(editar);

        Panel pEliminar = new Panel();
        GridLayout malla4 = new GridLayout(4, 1);
        pEliminar.setLayout(malla4);

        Label eliminarTelefono = new Label("Eliminar Telefono");
        Label espacio2 = new Label("");
        Label codigoTelefonoEliminar = new Label("Ingrese el codigo del telefono a eliminar: \n");
        TextField codigoEliminar = new TextField("1", 5);
        Button eliminar = new Button("Eliminar");
        eliminar.setBackground(Color.GRAY);
        eliminar.setForeground(Color.WHITE);
        Button cancelar = new Button("Cancelar");
        cancelar.setBackground(Color.GRAY);
        cancelar.setForeground(Color.WHITE);

        pEliminar.add(eliminarTelefono);
        pEliminar.add(espacio2);
        pEliminar.add(codigoTelefonoEliminar);
        pEliminar.add(codigoEliminar);
        pEliminar.add(eliminar);
        pEliminar.add(cancelar);
        pCentro.add(pEliminar);

        Panel pBuscar = new Panel();
        pBuscar.setLayout(malla4);

        Label buscarTelefono = new Label("Busqueda de Telefono por codigo del Usuario");
        Label codigoTelefonoBuscar = new Label("Ingrese el codigo del telefono a buscar: \n");
        TextField codigoBuscar = new TextField("", 5);
        Button buscar = new Button("Buscar");
        buscar.setBackground(Color.GRAY);
        buscar.setForeground(Color.WHITE);
        buscar.setSize(100, 10);

        pBuscar.add(buscarTelefono);
        pBuscar.add(codigoTelefonoBuscar);
        pBuscar.add(codigoBuscar);
        pBuscar.add(buscar);
        pCentro.add(pBuscar);

        Panel panelListar = new Panel();
        GridLayout malla5 = new GridLayout(2, 1);
        panelListar.setLayout(malla5);

        Label listarTelefono = new Label("Lista de sus telefonos");
        Button listar = new Button("Listar");
        listar.setBackground(Color.GRAY);
        listar.setForeground(Color.WHITE);
        Label espacio3 = new Label("");
        Button volver2 = new Button("Volver");
        volver2.setBackground(Color.GRAY);
        volver2.setForeground(Color.WHITE);

        panelListar.add(listarTelefono);
        panelListar.add(espacio3);
        panelListar.add(listar);
        panelListar.add(volver2);

        pCentro.add(panelListar);
        pCentro.setBackground(Color.WHITE);
        pCentro.setForeground(Color.BLACK);

        this.add(pCentro, BorderLayout.CENTER);

        Panel panelSalir = new Panel();
        GridLayout malla6 = new GridLayout(1, 2, 7, 0);
        panelSalir.setLayout(malla1);

        Button inicio = new Button("Inicio");
        inicio.setBackground(Color.GRAY);
        inicio.setForeground(Color.WHITE);
        Button cerrarSesion = new Button("Cerrar Secion");
        cerrarSesion.setBackground(Color.GRAY);
        cerrarSesion.setForeground(Color.WHITE);
        Button salir = new Button("Salir");
        salir.setBackground(Color.GRAY);
        salir.setForeground(Color.WHITE);

        panelSalir.add(inicio);
        panelSalir.add(cerrarSesion);
        panelSalir.add(salir);

        this.add(panelSalir, BorderLayout.SOUTH);
        this.setVisible(true);

    }

}
