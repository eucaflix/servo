/*
 * #%L
 * servo
 * %%
 * Copyright (C) 2011 - 2012 Netflix
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.netflix.servo.monitor;

import java.util.concurrent.TimeUnit;

public interface Timer extends NumericMonitor<Long> {

    /**
     * Returns a stopwatch that has been started and will automatically
     * record its result to this timer when stopped.
     */
    public Stopwatch start();

    /**
     * The TimeUnit that this timer is stored in.
     */
    public TimeUnit getTimeUnit();

    /**
     * Record a new value for this timer
     * @param duration
     */
    public void record(long duration);

    /**
     * Record a new value that was collected with the given TimeUnit
     * @param duration
     * @param timeUnit
     */
    public void record(long duration, TimeUnit timeUnit);
}