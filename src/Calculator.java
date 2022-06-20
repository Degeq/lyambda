public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
//  BinaryOperator<Integer> devide = (x, y) -> {
//  if (y != 0) {
//      return x / y;
//  }
//    println("деление на нуль невозможно");
//  return ;
//  };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Consumer<Integer> println = System.out::println;
}
