package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.external;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.blocks.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.FindAllBlocks;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/blocks")
public class BlockController {

    private final FindAllBlocks findAllBlocks;

    @GetMapping
    public List<Block> findAllBlocks() {
        return findAllBlocks.execute();
    }
}
