import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).forEach(i ->
			System.out.println(
					new Match<>(new Tuple<>(i % 3, i % 5))
						.Case(t -> t._1 == 0 && t._2 == 0, 	"FizzBuzz")
						.Case(t -> t._1 == 0,               "Fizz")
						.Case(t -> t._2 == 0,               "Buzz")
						.Else(i)
						.done()
			)
		);
	}

}
