package br.com.phricardo.BrazilianCarnivalBlocks.usecases;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.BlockDataGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateOrUpdateBlock {

    private final BlockDataGateway blockDataGateway;

    public Block execute(final Block block) {
        final Block blockSaved = blockDataGateway.schedule(block);
        log.info("Saved block: {}", blockSaved);
        return blockSaved;
    }
}
