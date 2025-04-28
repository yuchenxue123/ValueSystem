package cute.neko.value.types;

import cute.neko.value.Value;

/**
 * @author yuchenxue
 * @date 2025/04/28
 */

public class BooleanValue extends Value<Boolean> {
    protected BooleanValue(Builder builder) {
        super(builder);
    }

    public static Builder create() {
        return new Builder();
    }

    public static class Builder extends Value.Builder<Boolean, Builder> {

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public BooleanValue build() {
            return new BooleanValue(this);
        }
    }
}
