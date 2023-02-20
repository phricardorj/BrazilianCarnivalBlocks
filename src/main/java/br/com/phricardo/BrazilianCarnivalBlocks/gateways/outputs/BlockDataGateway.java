package br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;

import java.util.List;

public interface BlockDataGateway {

    Block schedule(Block block);

    Block searchBlockByName(String name);

    List<Block> searchAllBlocks();
}
