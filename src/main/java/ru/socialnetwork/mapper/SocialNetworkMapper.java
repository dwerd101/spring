package ru.socialnetwork.mapper;

public interface SocialNetworkMapper<Model,DTO> {
    DTO toDTO(Model model);
    Model toModel(DTO dto);
}
