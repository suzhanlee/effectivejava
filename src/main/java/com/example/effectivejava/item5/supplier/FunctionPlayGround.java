package com.example.effectivejava.item5.supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPlayGround {

    public static void main(String[] args) {


        SpellChecker spellChecker = new SpellChecker(() -> new DefaultDictionary());
        SpellChecker practice = new SpellChecker(DefaultDictionary::new);

        // 말 그대로 함수 -> 어떤 연산을 할 때 사용하면 좋다
        // 들어온것에 따라 다르게 행동하게 만들 수 있음
        Function<Integer, Integer> function; // T -> R (apply)

        // 공급자 : 어떤 행위를 해주길 바람
        Supplier<Integer> supplier; // void -> T (get)

        // 소비자 : 출력할 때 사용
        Consumer<Integer> consumer; // T -> void (accept)Elvis

        // 유효셩 검사를 할 떄 용이하다.
        Predicate<Integer> predicate; // T -> boolean (test)
    }


}
