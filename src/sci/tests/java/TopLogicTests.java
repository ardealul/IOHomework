package sci.tests.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import sci.toplogic.java.*;

import org.junit.jupiter.api.Test;

class TopLogicTests {

	@Test
	void test() {
		TopLogic logic = new TopLogic();
		List<TopCriteria> topList = new ArrayList<TopCriteria>();
		topList.add(new TopCriteria(1,"iPhoneX", 3));
		topList.add(new TopCriteria(2,"Macbook pro", 2));
		topList.add(new TopCriteria(3,"Apple Watch", 1));
		topList.add(new TopCriteria(4,"Beats by DR Dre", 1));
		topList.add(new TopCriteria(5,"Amazon Giftcard", 1));
		//[TopCriteria [topNumber=1, name=iPhone X, criteria=3], TopCriteria [topNumber=2, name=Macbook pro, criteria=2], TopCriteria [topNumber=3, name=Apple Watch, criteria=1], TopCriteria [topNumber=4, name=Beats by DR Dre, criteria=1], TopCriteria [topNumber=5, name=Amazon Giftcard, criteria=1]]
		List<TopCriteria> topForTest = logic.getBestSellingProducts();
		assertEquals(topList, topForTest);
	}

}
