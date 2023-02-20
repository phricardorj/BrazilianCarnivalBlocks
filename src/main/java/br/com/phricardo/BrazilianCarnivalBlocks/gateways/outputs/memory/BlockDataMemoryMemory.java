package br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.memory;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.BlockDataGateway;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlockDataMemoryMemory implements BlockDataGateway {

    private final List<Block> scheduled = new ArrayList<>();

    @Override
    public Block schedule(Block block) {
        this.scheduled.add(block);
        return block;
    }

    @Override
    public List<Block> searchBlockByName(String name) {
        return this.scheduled.stream()
                .filter(b -> b.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Block> searchAllBlocks() {
        return this.scheduled;
    }
}
