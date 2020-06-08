package com.google.checkstyle.test.chapter7javadoc.rule713atclauses;

import java.io.Serializable;

/**
 * Some javadoc.
 *
 * @author max
 * @version 1.0
 * @see Some javadoc.
 * @since Some javadoc.
 * @deprecated Some javadoc.
 */
class InputCorrectAtClauseOrderCheck implements Serializable
{

    /**
     * The client's first name.
     * @serial
     */
    

    /**
     * The client's first name.
     * @serial
     */
    

    /**
     * The client's first name.
     * @serialField
     */
    

    /**
     * Some text.
     * @param aString Some text.
     * @return Some text.
     * @throws Exception Some text.
     * @serialData Some javadoc.
     * @deprecated Some text.
     */
    String method(final String aString) throws Exception
    {
        return "null";
    }

    /**
     * Some text.
     * @param aString Some text.
     * @return Some text.
     * @throws Exception Some text.
     * @serialData Some javadoc.
     */
    String method1(final String aString) throws Exception
    {
        return "null";
    }

    /**
     * Some text.
     * @param aString Some text.
     * @throws Exception Some text.
     */
    void method2(final String aString) throws Exception { }

    /**
     * Some text.
     * @throws Exception Some text.
     * @deprecated Some text.
     */
    void method3() throws Exception { }

    /**
     * Some text.
     * @return Some text.
     * @throws Exception Some text.
     */
    String method4() throws Exception
    {
        return "null";
    }

    /**
     * Some text.
     * @param aString Some text.
     * @return Some text.
     * @serialData Some javadoc.
     * @deprecated Some text.
     */
    String method5(final String aString)
    {
        return "null";
    }

    /**
     * Some text.
     * @param aString Some text.
     * @param aInt Some text.
     * @param aBoolean Some text.
     * @return Some text.
     * @throws Exception Some text.
     * @deprecated Some text.
     */
    String method6(final String aString, final int aInt, final boolean aBoolean) throws Exception
    {
        return "null";
    }

    /**
     *
     * @author max
     * @version 1.0
     * @since Some javadoc.
     */
    class InnerClassWithAnnotations
    {
        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        String method(final String aString) throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @serialData Some javadoc.
         */
        String method1(final String aString) throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @throws Exception Some text.
         */
        void method2(final String aString) throws Exception { }

        /**
         * Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        void method3() throws Exception { }

        /**
         * Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @serialData Some javadoc.
         */
        String method4() throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @serialData Some javadoc.
         * @deprecated Some text.
         */
        String method5(final String aString)
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @param aInt Some text.
         * @param aBoolean Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        String method6(final String aString, final int aInt, final boolean aBoolean) throws Exception
        {
            return "null";
        }
    }

    InnerClassWithAnnotations anon = new InnerClassWithAnnotations()
    {
        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        String method(final String aString) throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @throws Exception Some text.
         */
        String method1(final String aString) throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @throws Exception Some text.
         * @serialData Some javadoc.
         */
        void method2(final String aString) throws Exception { }

        /**
         * Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        void method3() throws Exception { }

        /**
         * Some text.
         * @return Some text.
         * @throws Exception Some text.
         */
        String method4() throws Exception
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @return Some text.
         * @deprecated Some text.
         */
        String method5(final String aString)
        {
            return "null";
        }

        /**
         * Some text.
         * @param aString Some text.
         * @param aInt Some text.
         * @param aBoolean Some text.
         * @return Some text.
         * @throws Exception Some text.
         * @deprecated Some text.
         */
        String method6(final String aString, final int aInt, final boolean aBoolean) throws Exception
        {
            return "null";
        }
    };
}

/**
 * Some javadoc.
 *
 * @author max
 * @version 1.0
 * @see Some javadoc.
 * @since Some javadoc.
 * @deprecated Some javadoc.
 */
enum Foo { }

/**
 * Some javadoc.
 *
 * @author max
 * @version 1.0
 * @see Some javadoc.
 * @since Some javadoc.
 * @deprecated Some javadoc.
 */
interface FooIn { }
