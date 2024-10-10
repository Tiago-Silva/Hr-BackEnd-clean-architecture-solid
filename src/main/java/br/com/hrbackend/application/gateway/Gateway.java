package br.com.hrbackend.application.gateway;

public interface Gateway<Object> {
    Object save(Object object);
    Object update(Object object);
    void delete(Object object);
    Object getId(int objectId);
}
