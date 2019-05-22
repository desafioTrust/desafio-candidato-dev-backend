package com.srmasset.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srmasset.factory.EntityFactory;

@Service
public class ProcessRuleServices {

	public void doWork() {
		EntityFactory entityFactory = new EntityFactory();
		List<Integer> counters = new ArrayList<Integer>();
		entityFactory.doSomething();
		entityFactory.processValue(counters);
	}

}
