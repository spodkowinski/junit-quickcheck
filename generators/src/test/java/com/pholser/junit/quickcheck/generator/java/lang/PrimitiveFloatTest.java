/*
 The MIT License

 Copyright (c) 2010-2016 Paul R. Holser, Jr.

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.pholser.junit.quickcheck.generator.java.lang;

import com.pholser.junit.quickcheck.Generating;
import com.pholser.junit.quickcheck.generator.BasicGeneratorTheoryParameterTest;

import java.lang.reflect.Type;
import java.util.List;

import static com.pholser.junit.quickcheck.Generating.*;
import static java.util.Arrays.*;
import static org.mockito.Mockito.*;

@Deprecated
public class PrimitiveFloatTest extends BasicGeneratorTheoryParameterTest {
    public static final float TYPE_BEARER = 0;

    @Override protected void primeSourceOfRandomness() {
        when(Generating.floats(randomForParameterGenerator))
            .thenReturn(0.7F).thenReturn(0.8F);
    }

    @Override protected int sampleSize() {
        return 2;
    }

    @Override protected List<?> randomValues() {
        return asList(0.7F, 0.8F);
    }

    @Override public void verifyInteractionWithRandomness() {
        verifyFloats(randomForParameterGenerator, times(2));
    }
}
