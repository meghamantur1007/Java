package com.xworkz.collection.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class LamdaRunner {

	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer = (name, age) -> {
			System.out.println("Name :" + name + " , " + "age :" + age);
		};

		BiFunction<Integer, String, Boolean> biFunction = (age, name) -> {
			System.out.println("Age :" + age + " , " + "Name :" + name);
			return true;
		};

		BinaryOperator<Integer> binaryOperator = (x, y) -> {
			int x1 = 2;
			int y1 = 3;
			System.out.println("x value:" + x1);
			System.out.println("y value" + y1);
			return 1;
		};

		BiPredicate<Double, Double> biPredicate = (a, b) -> {
			System.out.println("BiPredicate Interface");
			return false;
		};

		Consumer<Integer> consumer = (age) -> {
			System.out.println(age);
		};

		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> {
			double store = a * b;
			return store;
		};

		DoubleConsumer doubleConsumer = (price) -> {
			System.out.println(price);
		};
		DoubleFunction<Boolean> doubleFunction = (weight) -> {
			System.out.println(weight);
			return false;
		};
		DoublePredicate doublePredicate = (x) -> {
			System.out.println(x);
			return true;
		};

		DoubleSupplier doubleSupplier = () -> {
			System.out.println("DoubleSupplier Interface");
			return 200;
		};
		DoubleToIntFunction doubleToIntFunction = (y) -> {
			System.out.println(y);
			return 3;
		};
		DoubleToLongFunction doubleToLongFunction = (d) -> {
			System.out.println(d);
			return 2;
		};
		DoubleUnaryOperator doubleUnaryOperator = (f) -> {
			System.out.println(f);
			return 3;
		};
		Function<String, Boolean> function = (name) -> {
			System.out.println(name);
			return true;
		};
		IntBinaryOperator intBinaryOperator = (leftValue, rightValue) -> {
			System.out.println(leftValue);
			System.out.println(rightValue);
			return 2;
		};
		IntConsumer intConsumer = (value) -> {
			System.out.println(value);
		};
		IntFunction<Boolean> intFunction = (s) -> {
			System.out.println(s);
			return true;
		};
		IntPredicate intPredicate = (h) -> {
			System.out.println(h);
			return true;
		};
		IntSupplier intSupplier = () -> {
			System.out.println("IntSupplier Interface");
			return 0;
		};
		IntToDoubleFunction intToDoubleFunction = (m) -> {
			System.out.println(m);
			return 0;
		};
		IntToLongFunction intToLongFunction = (g) -> {
			System.out.println(g);
			return 45;
		};
		IntUnaryOperator intUnaryOperator = (i) -> {
			System.out.println(i);
			return 0;
		};
		LongBinaryOperator longBinaryOperator = (x1, x2) -> {
			System.out.println(x1);
			System.out.println(x2);
			return 3;
		};
		LongConsumer longConsumer = (value) -> {
			System.out.println(value);
		};
		LongFunction<Boolean> longFunction = (long mobileNumber) -> {
			System.out.println(mobileNumber);
			return true;
		};
		LongPredicate longPredicate = (number) -> {
			System.out.println(number);
			return true;
		};
		LongSupplier longSupplier = () -> {
			System.out.println("LongSupplier Interface");
			return 45;
		};
		LongToDoubleFunction longToDoubleFunction = (age) -> {
			System.out.println(age);
			return 700;
		};
		LongToIntFunction longToIntFunction = (value) -> {
			System.out.println(value);
			return 2;
		};
		LongUnaryOperator longUnaryOperator = (long operand) -> {
			System.out.println(operand);
			return 5000;
		};
		ObjDoubleConsumer<Integer> objDoubleConsumer = (cityName, pincode) -> {
			System.out.println(cityName);
			System.out.println(pincode);
		};
		ObjIntConsumer<String> objIntConsumer = (name, age) -> {
			System.out.println(name);
			System.out.println(age);
		};
		ObjLongConsumer<String> objLongConsumer = (institute, contactNumber) -> {
			System.out.println(institute);
			System.out.println(contactNumber);
		};

		Predicate<String> predicate = (name) -> {
			System.out.println(name);
			return true;
		};
		Supplier<Integer> supplier = () -> {
			System.out.println("Supplier Interface");
			return 1;
		};
		ToDoubleBiFunction<Integer, String> ToDoubleBiFunction = (pincode, city) -> {
			System.out.println(pincode);
			System.out.println(city);
			return 600;
		};
		ToDoubleFunction<String> toDoubleFunction = (movie) -> {
			System.out.println(movie);
			return 87.98;
		};
		ToIntBiFunction<Integer, String> toIntBiFunction = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return 8;
		};
		ToIntFunction<String> toIntFunction = (value) -> {
			System.out.println(value);
			return 2;
		};
		ToLongBiFunction<String, Integer> toLongBiFunction = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
			return 354657657578L;
		};
		ToLongFunction<String> toLongFunction = (actorName) -> {
			System.out.println(actorName);
			return 56576786878L;
		};
		UnaryOperator<Long> unaryOperation = (mobileNo) -> {
			System.out.println(mobileNo);
			return 9380916659L;
		};
	}
}
