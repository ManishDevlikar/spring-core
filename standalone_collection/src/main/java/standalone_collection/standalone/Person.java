package standalone_collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> mobNo;
	private Map<Integer, String> marks;

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<Integer, String> getMarks() {
		return marks;
	}

	public void setMarks(Map<Integer, String> marks) {
		this.marks = marks;
	}

	public List<String> getMobNo() {
		return mobNo;
	}

	public void setMobNo(List<String> mobNo) {
		this.mobNo = mobNo;
	}

}
