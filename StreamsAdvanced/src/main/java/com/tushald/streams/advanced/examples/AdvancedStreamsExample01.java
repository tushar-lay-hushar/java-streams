package com.tushald.streams.advanced.examples;

import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class AdvancedStreamsExample01 {

    public static void main(String[] args) {
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
        uuids.limit(10).forEach(System.out::println);

        Stream<BigInteger> powersOfTwo = Stream.iterate(BigInteger.ONE, n -> n.multiply(BigInteger.TWO));
        powersOfTwo.limit(20).forEach(System.out::println);

        Stream<Character> alphabhet = Stream.iterate('A', letter -> letter <= 'Z', letter -> (char) (letter + 1));
        alphabhet.forEach(System.out::println);

        Stream.Builder<String> builder = Stream.builder();
        builder.add("one");
        builder.add("two");
        builder.add("three");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

        System.out.println(6 % 5);
    }
}
