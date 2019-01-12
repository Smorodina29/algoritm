package collections;

import java.util.EnumSet;
import java.util.Set;

public enum ColEnum {
    INFO,
    DATA,
    DATABASE,
    COMPUTER;

    private EnumSet<ColEnum> set = EnumSet.allOf(ColEnum.class);
}
