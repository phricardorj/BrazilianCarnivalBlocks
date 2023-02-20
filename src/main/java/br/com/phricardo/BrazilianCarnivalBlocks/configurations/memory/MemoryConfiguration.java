package br.com.phricardo.BrazilianCarnivalBlocks.configurations.memory;

import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.BlockDataGateway;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.outputs.memory.BlockDataMemoryMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfiguration {

    @Bean
    public BlockDataGateway blockDataGateway() {
        return new BlockDataMemoryMemory();
    }
}
