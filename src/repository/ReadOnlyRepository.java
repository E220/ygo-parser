package repository;

import cards.Identity;

public interface ReadOnlyRepository<T extends Identity<ID>, ID> {
    T get(ID id);
}
