package cards.base;

import cards.Identity;

public interface Card extends Identity<Integer> {
    String getName();
    String getDescription();
}
