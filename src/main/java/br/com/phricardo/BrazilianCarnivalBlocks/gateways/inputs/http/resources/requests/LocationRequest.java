package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationRequest {
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String address;
    @NotBlank
    private String complement;
    @NotBlank
    private Integer number;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String country;
}
