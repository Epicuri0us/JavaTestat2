import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StudyPlanTest {

	private StudyPlan studyPlan;
	
	@Before
    public void initObjects() {
		List<String[]> lines = new ArrayList<>();
		lines.add(new String[]{"DB1", "OO"});
		lines.add(new String[]{"DB2", "DB1"});
		lines.add(new String[]{"Math"});
		
		studyPlan = new StudyPlan(lines);
    }
	
	@Test
	public void testFillModules() {
		
	}

}
