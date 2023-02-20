package br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.memory;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.blocks.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.BlockDataGateway;

import java.util.ArrayList;
import java.util.List;

public class BlockDataMemoryMemory implements BlockDataGateway {

    private final List<Block> scheduled = new ArrayList<>();

    @Override
    public void schedule(Block block) {
        this.scheduled.add(block);
    }

    @Override
    public Block searchBlockByName(Block block) {
        return null;
    }

    @Override
    public List<Block> searchAllBlocks() {
        return this.scheduled;
    }
}
