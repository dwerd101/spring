package ru.socialnetwork.repository;

import java.util.List;

public interface SocicalNetworkService<T,ID> {
    T create(T t);
    T update(T t, ID id);
    List<T>  findAll();
    T delete(ID id);
}
