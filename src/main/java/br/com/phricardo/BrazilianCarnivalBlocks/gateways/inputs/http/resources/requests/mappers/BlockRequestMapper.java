package br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.mappers;

import br.com.phricardo.BrazilianCarnivalBlocks.domains.block.Block;
import br.com.phricardo.BrazilianCarnivalBlocks.gateways.inputs.http.resources.requests.BlockRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BlockRequestMapper {

    @Mapping(source = "location", target = "location")
    Block blockRequestToBlock(BlockRequest blockRequest);
}
