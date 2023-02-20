package br.com.phricardo.BrazilianCarnivalBlocks.domains.block;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Block {
    private String name;
    private LocalDateTime dateTime;
    private Location location;
}
