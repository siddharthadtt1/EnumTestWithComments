package com.example;

public class Employee {

	public enum DEPT {
		IT {
			@Override
			public String getDeptName() {
				return "Information Technology";
			}
		},
		HR {
			@Override
			public String getDeptName() {
				return "Human Resources";
			}
		},
		FINANCE {
			@Override
			public String getDeptName() {
				return "Finance";
			}
		};

		public abstract String getDeptName();
	}

	private int id;
	private String name;
	private DEPT dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DEPT getDept() {
		return dept;
	}

	public void setDept(DEPT dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
