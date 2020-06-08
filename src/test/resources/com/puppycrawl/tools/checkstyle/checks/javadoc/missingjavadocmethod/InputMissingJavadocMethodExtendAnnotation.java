/*
 * Copyright (C) 2009 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadocmethod;



/**
 * Common superclass for {@link MultisetSetCountUnconditionallyTester} and
 * {@link MultisetSetCountConditionallyTester}. It is used by those testers to
 * test calls to the unconditional {@code setCount()} method and calls to the
 * conditional {@code setCount()} method when the expected present count is
 * correct.
 *
 * @author Chris Povirk
 */
@SuppressWarnings(value = "unchecked")
public abstract class InputMissingJavadocMethodExtendAnnotation<E>
  {

  
  

@CollectionFeature.Require
  public void testSetCount_zeroToZero_unsupported() {
    try {
      assertZeroToZero();
    } catch (UnsupportedOperationException tolerated) {
    }
  }

  private void assertZeroToZero() {

  }

  @interface CollectionFeature {
      @interface Require {
      }
  }
}
