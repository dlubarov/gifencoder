package com.squareup.gifencoder;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LzwEncoderTest {
  @Test public void testGetMinimumCodeSize() {
    assertThat(new LzwEncoder(1).getMinimumCodeSize()).isEqualTo(2);
  }

  @Test public void testInvalidColorTableSize() {
    assertThatIllegalArgumentException().isThrownBy(new ThrowingCallable() {
      @Override public void call() {
        new LzwEncoder(7);
      }
    });
  }
}