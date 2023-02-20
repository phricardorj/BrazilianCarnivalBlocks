package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.external;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.BlockRequest;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.mappers.BlockRequestMapper;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.CreateOrUpdateBlock;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.FindAllBlocks;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/blocks")
public class BlockController {

    private final FindAllBlocks findAllBlocks;
    private final CreateOrUpdateBlock createOrUpdateBlock;
    private BlockRequestMapper blockRequestMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Block> findAllBlocks() {
        return findAllBlocks.execute();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Block scheduleBlock(@RequestBody @Validated Block block) {
        return createOrUpdateBlock.execute(block);
    }
}
