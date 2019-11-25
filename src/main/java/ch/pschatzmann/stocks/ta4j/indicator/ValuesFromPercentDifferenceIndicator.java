package ch.pschatzmann.stocks.ta4j.indicator;

import java.util.ArrayList;
import java.util.List;

import org.ta4j.core.Indicator;
import org.ta4j.core.BarSeries;
import org.ta4j.core.num.Num;

/**
 * Calculates the absolute values from the % differences
 * 
 * @author pschatzmann
 *
 */
public class ValuesFromPercentDifferenceIndicator implements IIndicator<Num> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Num> result;
	private BarSeries timeSeries;
	
	
	public ValuesFromPercentDifferenceIndicator(Num startValue, Indicator<Num> differences) {
		timeSeries = differences.getBarSeries();
		result = new ArrayList();
		Num value = startValue;
		result.add(value);
		for (int i=0;i<differences.getBarSeries().getBarCount();i++) {
			value.plus(numOf(value.doubleValue() * differences.getValue(i).doubleValue()));
			result.add(numOf(value.doubleValue()));
		}
	}

	@Override
	public Num getValue(int index) {
		return result.get(index);
	}

	@Override
	public BarSeries getBarSeries() {
		return timeSeries;
	}

	@Override
	public Num numOf(Number number) {
		return timeSeries.numOf(number);
	}


}
