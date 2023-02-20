package br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.blocks.Block;

import java.util.List;

public interface BlockDataGateway {

    void schedule(Block block);

    Block searchBlockByName(Block block);

    List<Block> searchAllBlocks();
}
