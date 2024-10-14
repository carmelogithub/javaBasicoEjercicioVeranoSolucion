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
             // System.out.println(pedido);
           System.out.println(pedido.getCodigo()+"-"+pedido.getFechaPedido()+"-"+pedido.getNombreCliente()+"-"+pedido.getProducto()+"-"+pedido.getUnidades()+"-"+pedido.getPrecio());

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
        pedidos.add(pedido);//añadir pedido a la lista de pedidos
        System.out.println("Pedido añadido: "+pedido.getCodigo());
    }

    public void modificarPedido() {
        System.out.println("Modificar pedido las unidades del pedido");
        System.out.println("dime el código del pedido");
        Scanner scanner = new Scanner(System.in);
        int codigo= scanner.nextInt();
        for(Pedido pedido: pedidos){
            if(pedido.getCodigo()==codigo){
                System.out.println("dime las nuevas unidades");
                int unidades=scanner.nextInt();
                pedido.setUnidades(unidades);
                System.out.println("Pedido modificado: "+pedido.getCodigo());
                break;
            }
        }
    }

    public void eliminarPedido() {
        System.out.println("Eliminar pedido");
        System.out.println("dime el código del pedido");
        Scanner scanner = new Scanner(System.in);
        int codigo= scanner.nextInt();
        for(Pedido pedido: pedidos){
            if(pedido.getCodigo()==codigo){
                pedidos.remove(pedido);
                System.out.println("Pedido eliminado: "+pedido.getCodigo());
                break;
            }
        }
    }
}//cierra class PedidoController
