package com.puppycrawl.tools.checkstyle.grammar.java8;
import java.util.Arrays;
import java.util.List;


public class InputMethodReferences<T> extends ParentClass
{

    public void main(final String[] args) {

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

                numbers.forEach(String.CASE_INSENSITIVE_ORDER::equals);
                

                
                

                numbers.forEach(this::println);

		numbers.forEach(super::println);
        
        
        

	}
}

class ParentClass
{

    public String println(final Integer i)
    {
        return null;
    }
}
