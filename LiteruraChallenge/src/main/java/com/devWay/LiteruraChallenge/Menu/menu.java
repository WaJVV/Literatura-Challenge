package com.devWay.LiteruraChallenge.Menu;

import com.devWay.LiteruraChallenge.Model.DatosLibro;
import com.devWay.LiteruraChallenge.Service.ConsumoAPI;
import com.devWay.LiteruraChallenge.Service.ConvierteDatos;

import java.util.Scanner;

public class menu {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books?ids=";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por titulo
                    2 - listar libros registrados
                    3 - listar autores registrados
                    4 - listar autores vivos en un determinado año
                    5 - listar libros por idioma
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();

            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
//                case 2:
//                    ListarLibrosRegistrados();
//                    break;
//                case 3:
//                    ListarAutoresRegistrados();
//                    break;
//                case 4:
//                    AnioAutores();
//                    break;
//                case 5:
//                    LibrosIdioma();
//                    break;

                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }

    private void buscarLibroPorTitulo() {
        System.out.println("Escribe el nombre del libro que deseas buscar");
        var tituloBuscado = teclado.nextInt();
        var json = consumoApi.obtenerDatos(URL_BASE + tituloBuscado);
        System.out.println(json);
        DatosLibro datos = conversor.obtenerDatos(json, DatosLibro.class);

    }
}
