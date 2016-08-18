package com.anz.interview.domain;

public class DepartmentVO extends Department {
	private String parentDep;
	private String subDeps;
	private String emps;

	public String getParentDep() {
		return parentDep;
	}

	public void setParentDep(String parentDep) {
		this.parentDep = parentDep;
	}

	public String getSubDeps() {
		return subDeps;
	}

	public void setSubDeps(String subDeps) {
		this.subDeps = subDeps;
	}

	public String getEmps() {
		return emps;
	}

	public void setEmps(String emps) {
		this.emps = emps;
	}

}