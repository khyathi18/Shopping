package Ecommerce;

import Operators.StudentPojo;

public class StudentUtility {

	StudentPojo student=new StudentPojo(2.5f,6.0f);
	public float checkInternalMarks()
	{
		return student.getInternalMarks();
	}
	public float checkExternalMarks()
	{
		return student.getExternalMarks();
	}
	public float marksTest()
	{
		if(student.getInternalMarks()>=0 && student.getExternalMarks()>=0)
		{
			return student.getInternalMarks()+student.getExternalMarks();
		}
		else
			return 0;
	}

}
