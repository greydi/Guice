package com.example.studentstore;

public interface Registrar {
	public boolean checkStudentStatus(Integer studentId);

	public Student registerStudent(String name, Integer credits);
}
