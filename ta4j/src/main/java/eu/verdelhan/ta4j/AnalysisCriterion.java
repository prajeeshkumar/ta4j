/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Marc de Verdelhan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eu.verdelhan.ta4j;

import eu.verdelhan.ta4j.analysis.evaluators.Decision;
import java.util.List;

/**
 * An analysis criterion.
 * <p>
 * Can be used to:
 * <ul>
 * <li>Analyze the performance of a {@link Strategy strategy}
 * <li>Compare 2 {@link Strategy strategies}
 * <li>Build a {@link Decision decision}.
 * </ul>
 */
public interface AnalysisCriterion {

    /**
     * @param series a time series
     * @param trade a trade
     * @return the criterion value for the trade
     */
    double calculate(TimeSeries series, Trade trade);

    /**
     * @param series a time series
     * @param trades a list of trades
     * @return the criterion value for the trades
     */
    double calculate(TimeSeries series, List<Trade> trades);

    /**
     * @param series a time series
     * @param trades a list of trades
     * @return the criterion value for the trades coming from the decisions
     */
    double summarize(TimeSeries series, List<Decision> decisions);
}