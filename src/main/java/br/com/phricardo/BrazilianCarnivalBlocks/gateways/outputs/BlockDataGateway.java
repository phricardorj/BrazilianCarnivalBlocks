package br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;

import java.util.List;

public interface BlockDataGateway {

    Block schedule(Block block);

    List<Block> searchAllBlocks();

    List<Block> searchBlockByName(String name);
}
