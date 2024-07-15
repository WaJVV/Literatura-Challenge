package com.devWay.LiteruraChallenge.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("id") Long Id,
        @JsonAlias("title") String tituloLibro,
        @JsonAlias("name") String nombreAutor,
        @JsonAlias("birth_year") String fechaNacimiento,
        @JsonAlias("death_year") String fechaFallecido,
        @JsonAlias("languages") String idiomas,
        @JsonAlias("download_count") Integer cantidadDescargas

) {
}
