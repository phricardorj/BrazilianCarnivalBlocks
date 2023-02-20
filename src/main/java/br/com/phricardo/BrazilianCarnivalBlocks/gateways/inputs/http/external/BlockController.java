package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.external;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.BlockRequest;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.mappers.BlockRequestMapper;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.CreateOrUpdateBlock;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.FindAllBlocks;
import br.com.phricardo.BrazilianCarnivalBlocks.usecases.FindBlocksByName;
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
    private final FindBlocksByName findBlocksByName;
    private final BlockRequestMapper blockRequestMapper;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Block> findAllBlocks() {
        return findAllBlocks.execute();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public List<Block> searchBlockByName(@RequestParam String name) {
        return findBlocksByName.execute(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Block scheduleBlock(@RequestBody @Validated BlockRequest blockRequest) {
        Block block = blockRequestMapper.blockRequestToBlock(blockRequest);
        return createOrUpdateBlock.execute(block);
    }
}
