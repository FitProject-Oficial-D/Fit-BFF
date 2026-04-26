package com.fitproject.bff.client;

import com.fitproject.bff.dto.ProjectDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Cliente Feign para comunicarse con el microservicio de gestión (ms-gestion).
 * 
 * Este cliente permite realizar llamadas HTTP al microservicio de gestión
 * de manera declarativa y tipada, abstrayendo la complejidad de la comunicación
 * entre microservicios.
 */
@FeignClient(name = "ms-gestion", url = "${services.ms-gestion.url:http://localhost:8080/api/v1}")
public interface GestionClient {

    /**
     * Obtiene todos los proyectos disponibles en el microservicio de gestión.
     * 
     * @return Lista de proyectos con toda su información incluyendo pasos y evidencias
     */
    @GetMapping("/projects")
    List<ProjectDTO> getAllProjects();
}
