package com.example.studentstore;

public interface StudentStore {
	public boolean exists(Integer id);

	public Student load(Integer id);

	public Student save(Student p);
}