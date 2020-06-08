package org.checkstyle.suppressionxpathfilter.avoidnestedblocks;

public class SuppressionXpathRegressionAvoidNestedBlocksVariable {

    void varAssign() {
        
        { // warn
            whichIsWhich = 2;
        }
    }
}
