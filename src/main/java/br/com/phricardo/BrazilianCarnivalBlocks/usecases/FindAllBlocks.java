package br.com.phricardo.BrazilianCarnivalBlocks.usecases;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.blocks.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.BlockDataGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class FindAllBlocks {

    private final BlockDataGateway blockDataGateway;

    public List<Block> execute(){
        return blockDataGateway.searchAllBlocks();
    }

}
