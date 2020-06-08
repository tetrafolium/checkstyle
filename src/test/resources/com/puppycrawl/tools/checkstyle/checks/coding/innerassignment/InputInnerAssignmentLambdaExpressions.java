package com.puppycrawl.tools.checkstyle.checks.coding.innerassignment;



public class InputInnerAssignmentLambdaExpressions {
    interface MyLambda {
        void e(Object e);
    }
    private static class MyButton {
        public void setOnAction(final MyLambda my) {
        }
    }
    private void setAction() {
        MyButton button = new MyButton();
        button.setOnAction(e -> {
             });  //No violation here
    }
}
