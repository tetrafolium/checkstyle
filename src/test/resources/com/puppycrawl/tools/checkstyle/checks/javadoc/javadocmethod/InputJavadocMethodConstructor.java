package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

public class InputJavadocMethodConstructor {
    private int field;
    public InputJavadocMethodConstructor() { }
    public InputJavadocMethodConstructor(final Runnable p1) {
        this.field = 0; }
    /** */
    public InputJavadocMethodConstructor(final String p1) {
        this.field = 0; }
    /** Test. */
    public InputJavadocMethodConstructor(final Integer p1) {
        this.field = 0; }
    /** Test.
     * @param p1 */
    public InputJavadocMethodConstructor(final Long p1) {
        this.field = 0; }
    /** Test.
     * @param p1 Test. */
    public InputJavadocMethodConstructor(final Short p1) {
        this.field = 0; }
}
