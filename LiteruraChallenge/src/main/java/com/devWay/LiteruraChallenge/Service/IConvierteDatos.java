package com.devWay.LiteruraChallenge.Service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
