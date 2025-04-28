package cute.neko.value.types;

import cute.neko.value.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuchenxue
 * @date 2025/04/28
 */

public class ModeValue extends Value<String> {

    public final List<String> modes;

    protected ModeValue(Builder builder) {
        super(builder);
        this.modes = builder.modes;
    }

    public static Builder create() {
        return new Builder();
    }

    public static class Builder extends Value.Builder<String, Builder> {

        private final List<String> modes = new ArrayList<>();

        public Builder subMode(String mode) {
            modes.add(mode);
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ModeValue build() throws Exception {
            if (modes.isEmpty()) {
                throw new Exception("Can't build ModeValue with empty modes.");
            }
            return new ModeValue(this);
        }
    }
}
