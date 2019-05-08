package com.srmasset.factory;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author christian.pacheco
 *
 */
@Component
public class EntityFactory {

	Logger log = LoggerFactory.getLogger(EntityFactory.class);

	public void doSomething() {
		// TODO.
	}

	public void processValue(List<Integer> counters) {
		int countMaxCalls = 10000;

		for (int i = 0; i < counters.size(); i++) {
			int countTemp = counters.get(i);
			if (countTemp > 10) {
				log.debug("This will happen some times");
				processAddressValue(40, "test name", 20, "streat name", "Lima", "Lima", "Peru", "00000000", 1, 2);
				return;
			}
		}

		int calls = 0;
		while (calls++ > countMaxCalls) {
			callExternarRestService();
		}
	}

	private void processAddressValue(int age, String name, int streetNumber, String streetName, String CityName, String StateName, String CountryName, String zipcode, int code1, int code2) {
		String generalData = age + name + streetName + streetNumber;
		log.error("The general Data is" + generalData);
		// TODO. do something with this values.
	}

	private void callExternarRestService() {
		// TODO. call external Rest GET services.
	}

}
