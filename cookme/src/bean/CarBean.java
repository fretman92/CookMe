package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarBean {
	private List<Car> cars;

	public CarBean() {
		cars = new ArrayList<Car>();
		cars.add(new Car("myModel", 2005, "1", "blue"));
		cars.add(new Car("myModel2", 2006, "2", "blue"));
		cars.add(new Car("myModel3", 2007, "3", "blue"));
		cars.add(new Car("myModel4", 2008, "4", "blue"));
		cars.add(new Car("myModel5", 2009, "5", "blue"));
	}

	public List<Car> getCars() {
		return cars;
	}
}