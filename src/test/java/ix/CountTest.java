/*
 * Copyright 2011-2016 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ix;

import org.junit.Test;

public class CountTest {

    @Test
    public void normal() {
        Ix<Integer> source = Ix.range(1, 5).count();
        
        IxTestHelper.assertValues(source, 5);
        
        IxTestHelper.assertNoRemove(source);
    }

    @Test
    public void just() {
        Ix<Integer> source = Ix.just(1).count();
        
        IxTestHelper.assertValues(source, 1);
        
        IxTestHelper.assertNoRemove(source);
    }
    
    @Test
    public void empty() {
        Ix<Integer> source = Ix.empty().count();
        
        IxTestHelper.assertValues(source, 0);
        
        IxTestHelper.assertNoRemove(source);
    }

    @Test
    public void normalLong() {
        Ix<Long> source = Ix.range(1, 5).countLong();
        
        IxTestHelper.assertValues(source, 5L);
        
        IxTestHelper.assertNoRemove(source);
    }

    @Test
    public void justLong() {
        Ix<Long> source = Ix.just(1).countLong();
        
        IxTestHelper.assertValues(source, 1L);
        
        IxTestHelper.assertNoRemove(source);
    }
    
    @Test
    public void emptyLong() {
        Ix<Long> source = Ix.empty().countLong();
        
        IxTestHelper.assertValues(source, 0L);
        
        IxTestHelper.assertNoRemove(source);
    }

}
