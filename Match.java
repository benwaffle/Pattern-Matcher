import java.util.function.Predicate;

public class Match<T, R> {
	private T value;
	private R result, elseVal;

	public Match(T value) {
		this.value = value;
	}

	public Match<T, R> Case(Predicate<T> cond, R result) {
		if (this.result == null && cond.test(value))
			this.result = result;
		return this;
	}

	public Match<T, R> Else(R result) {
		elseVal = result;
		return this;
	}

	public R done() {
		return result != null ? result : elseVal;
	}
}
