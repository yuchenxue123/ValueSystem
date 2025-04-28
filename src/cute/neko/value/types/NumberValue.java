package cute.neko.value.types;

import cute.neko.value.Value;

/**
 * @author yuchenxue
 * @date 2025/04/28
 */

public class NumberValue extends Value<Double> {
    public final Double min;
    public final Double max;

    protected NumberValue(Builder builder) {
        super(builder);
        this.min = builder.min;
        this.max = builder.max;
    }

    public static Builder create() {
        return new Builder();
    }

    public static class Builder extends Value.Builder<Double, Builder> {
        private Double min;
        private Double max;

        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NumberValue build() {
            return new NumberValue(this);
        }
    }
}
