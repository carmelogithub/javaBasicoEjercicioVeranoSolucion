package org.tarea.controller;

import org.tarea.model.Pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PedidoController {
    List<Pedido> pedidos = new ArrayList<>();
    public void listarPedidos() {
        System.out.println("Listar pedidos");
       for(Pedido pedido: pedidos){
              System.out.println(pedido);
              System.out.println(pedido.getProducto());
                System.out.println("-----------------------");
       }
    }

    public void anadirPedido() {
        System.out.println("Añadir pedido");
        System.out.println("dime el código del pedido");
        Scanner scanner = new Scanner(System.in);
        int codigo= scanner.nextInt();
        System.out.println("dime el nombre de cliente");
        String cliente= scanner.next();
        System.out.println("dime el producto");
        String producto= scanner.next();
        System.out.println("dime las unidades");
        int unidades=scanner.nextInt();
        System.out.println("dime el precio");
        double precio=scanner.nextDouble();

        Pedido pedido= new Pedido(codigo, new Date(), cliente, producto, unidades, precio);
        pedidos.add(pedido);
        System.out.println("Pedido añadido: "+pedido);
    }

    public void modificarPedido() {
        System.out.println("Modificar pedido");
    }

    public void eliminarPedido() {
        System.out.println("Eliminar pedido");
    }
}//cierra class PedidoController
