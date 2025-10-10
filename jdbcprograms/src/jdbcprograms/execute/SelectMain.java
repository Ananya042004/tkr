package jdbcprograms.execute;

import jdbcprograms.services.Crudoperations;

public class SelectMain {
    //jdbc select
	public static void main(String[] args) {
		Crudoperations.displayAllStudents();
        Crudoperations.searchStudent(101);

	}

}
