package ru.socialnetwork.service;

import java.util.List;

public interface SocialNetworkService<T,ID> {
    T create(T t);
    T update(T t, ID id);
    List<T>  findAll();
    T delete(ID id);
}
