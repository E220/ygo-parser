package repository;

import cards.Identity;

import java.util.Collections;
import java.util.List;

public class InMemoryArrayListReadOnlyRepository<T extends Identity<ID>, ID> implements ReadOnlyRepository<T, ID> {
    final List<T> items;

    public InMemoryArrayListReadOnlyRepository(final List<T> items) {
        this.items = Collections.unmodifiableList(items);
    }

    @Override
    public T get(ID id) {
        return this.items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
