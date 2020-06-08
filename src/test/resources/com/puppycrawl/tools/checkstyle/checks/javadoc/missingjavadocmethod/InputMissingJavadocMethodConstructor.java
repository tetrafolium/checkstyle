package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadocmethod;

public class InputMissingJavadocMethodConstructor {
    private int field;
    public InputMissingJavadocMethodConstructor() { }
    public InputMissingJavadocMethodConstructor(final Runnable p1) {
        this.field = 0; }
    /** */
    public InputMissingJavadocMethodConstructor(final String p1) {
        this.field = 0; }
    /** Test. */
    public InputMissingJavadocMethodConstructor(final Integer p1) {
        this.field = 0; }
    /** Test.
     * @param p1 */
    public InputMissingJavadocMethodConstructor(final Long p1) {
        this.field = 0; }
    /** Test.
     * @param p1 Test. */
    public InputMissingJavadocMethodConstructor(final Short p1) {
        this.field = 0; }
}
