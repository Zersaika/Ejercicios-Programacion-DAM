package com.itt.restaurante;

public class Consumicion {

              private String producto;

              private int cantidad;

              private double precio;

              public Consumicion(String producto, int cantidad, double precio) {

                            this.producto = producto;

                            this.cantidad = cantidad;

                            this.precio = precio;

              }

              public String getProducto() {

                            return producto;

              }

              public int getCantidad() {

                            return cantidad;

              }

              public double getPrecio() {

                            return precio;

               }

               @Override

               public String toString() {

                             return "Consumición [producto=" + producto +

                                 ", cantidad=" + cantidad

                                 + ", precio=" + precio + "]";

               }

}