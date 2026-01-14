package main.java.cl.speedFast.ui;

import main.java.cl.speedFast.model.Pedido;
import main.java.cl.speedFast.model.PedidoComida;
import main.java.cl.speedFast.model.PedidoEncomienda;
import main.java.cl.speedFast.model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Pedido[] pedidos = {
                new PedidoComida("PC001","Avenida Concepción 1234","Comida",5.1),
                new PedidoEncomienda("PE002", "Los Alamos 186", "Encomienda",3.6),
                new PedidoExpress("PX003", "Pasaje San Ambrosio 291", "Express",5.2)
        };

        System.out.println("======......LISTADO DE ENVÍOS......======");
        for (Pedido p : pedidos){
            p.mostrarResumen();
        }

    }
}