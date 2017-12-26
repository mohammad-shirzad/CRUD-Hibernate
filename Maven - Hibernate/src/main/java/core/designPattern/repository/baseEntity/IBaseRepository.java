package core.designPattern.repository.baseEntity;

import core.model.dto.BaseDto;

public interface IBaseRepository<T extends BaseDto> {
    public T getById(Class<T> tClass,int id);
    public void deleteById(Class<T> tClass,int id);
    public void create(T t);
}
