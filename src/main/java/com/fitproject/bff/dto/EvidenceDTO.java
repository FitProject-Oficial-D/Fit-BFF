package com.fitproject.bff.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Data Transfer Object para la entidad Evidence.
 * Utilizado para peticiones y respuestas de la API para evitar exponer entidades directamente.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EvidenceDTO {
    
    private String evidenceId;
    
    @NotBlank(message = "El ID del proyecto es requerido")
    private String projectId;
    
    @NotBlank(message = "El ID del paso es requerido")
    private String stepId;
    
    @NotBlank(message = "La URL de la evidencia es requerida")
    private String evidenceUrl;
    
    private String description;
    
    @NotBlank(message = "El ID del supervisor es requerido")
    private String supervisorId;
    
    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;
}
