package br.com.phricardo.BrazilianCarnivalBlocks.domains.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String city;
    private String state;
    private String address;
    private String complement;
    private Integer number;
    private String zipCode;
    private String country;
}
