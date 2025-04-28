package cute.neko.value;

/**
 * @author yuchenxue
 * @date 2025/04/28
 */

public abstract class Value<T> {
    private final String name;
    private final T value;

    private T current;

    protected Value(Builder<T, ? extends Builder<?, ?>> builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public T getValue() {
        return current;
    }

    public void setValue(T newValue) {
        this.current = newValue;
    }

    public String getName() {
        return name;
    }

    public abstract static class Builder<T, B extends Builder<T, B>> {
        private String name;
        private T value;

        public B name(String name) {
            this.name = name;
            return self();
        }

        public B value(T value) {
            this.value = value;
            return self();
        }

        protected abstract B self();

        public abstract Value<T> build() throws Exception;
    }
}
