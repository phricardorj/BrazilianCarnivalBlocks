package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BlockRequest implements Serializable {

    @NotBlank
    private String name;
    @NonNull
    private LocalDateTime dateTime;
    private LocationRequest location;
}
