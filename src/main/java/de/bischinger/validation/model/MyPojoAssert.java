package de.bischinger.validation.model;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.internal.Iterables;

/**
 * {@link MyPojo} specific assertions - Generated by CustomAssertionGenerator.
 */
public class MyPojoAssert extends AbstractAssert<MyPojoAssert, MyPojo> {

  /**
   * Creates a new <code>{@link MyPojoAssert}</code> to make assertions on actual MyPojo.
   * @param actual the MyPojo we want to make assertions on.
   */
  public MyPojoAssert(MyPojo actual) {
    super(actual, MyPojoAssert.class);
  }

  /**
   * An entry point for MyPojoAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMyPojo)</code> and get specific assertion with code completion.
   * @param actual the MyPojo we want to make assertions on.
   * @return a new <code>{@link MyPojoAssert}</code>
   */
  public static MyPojoAssert assertThat(MyPojo actual) {
    return new MyPojoAssert(actual);
  }

  /**
   * Verifies that the actual MyPojo's mySubPojoList contains the given MySubPojo elements.
   * @param mySubPojoList the given elements that should be contained in actual MyPojo's mySubPojoList.
   * @return this assertion object.
   * @throws AssertionError if the actual MyPojo's mySubPojoList does not contain all given MySubPojo elements.
   */
  public MyPojoAssert hasMySubPojoList(MySubPojo... mySubPojoList) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    // check that given MySubPojo varargs is not null.
    if (mySubPojoList == null) failWithMessage("Expecting mySubPojoList parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getMySubPojoList(), mySubPojoList);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual MyPojo's mySubPojoList contains <b>only<b> the given MySubPojo elements and nothing else in whatever order.
   * @param mySubPojoList the given elements that should be contained in actual MyPojo's mySubPojoList.
   * @return this assertion object.
   * @throws AssertionError if the actual MyPojo's mySubPojoList does not contain all given MySubPojo elements.
   */
  public MyPojoAssert hasOnlyMySubPojoList(MySubPojo... mySubPojoList) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    // check that given MySubPojo varargs is not null.
    if (mySubPojoList == null) failWithMessage("Expecting mySubPojoList parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getMySubPojoList(), mySubPojoList);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual MyPojo's mySubPojoList does not contain the given MySubPojo elements.
   *
   * @param mySubPojoList the given elements that should not be in actual MyPojo's mySubPojoList.
   * @return this assertion object.
   * @throws AssertionError if the actual MyPojo's mySubPojoList contains any given MySubPojo elements.
   */
  public MyPojoAssert doesNotHaveMySubPojoList(MySubPojo... mySubPojoList) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    // check that given MySubPojo varargs is not null.
    if (mySubPojoList == null) failWithMessage("Expecting mySubPojoList parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getMySubPojoList(), mySubPojoList);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual MyPojo has no mySubPojoList.
   * @return this assertion object.
   * @throws AssertionError if the actual MyPojo's mySubPojoList is not empty.
   */
  public MyPojoAssert hasNoMySubPojoList() {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have mySubPojoList but had :\n  <%s>";
    
    // check
    if (actual.getMySubPojoList().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getMySubPojoList());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual MyPojo's sum1 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum1 the value to compare the actual MyPojo's sum1 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum1 is not close enough to the given value.
   */
  public MyPojoAssert hasSum1(double sum1, double offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    double actualSum1 = actual.getSum1();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum1:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum1, sum1, offset, Math.abs(sum1 - actualSum1));
    
    // check
    Assertions.assertThat(actualSum1).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum1, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual MyPojo's sum2 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum2 the value to compare the actual MyPojo's sum2 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum2 is not close enough to the given value.
   */
  public MyPojoAssert hasSum2(double sum2, double offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    double actualSum2 = actual.getSum2();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum2:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum2, sum2, offset, Math.abs(sum2 - actualSum2));
    
    // check
    Assertions.assertThat(actualSum2).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum2, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

}