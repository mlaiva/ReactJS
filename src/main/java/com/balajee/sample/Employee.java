package com.balajee.sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	 private @Id @GeneratedValue Long id;
	    private String name;
	    private int age;
	    private int years;
	 
	    private Employee() {}
	 
	    public Employee(String name, int age, int years) {
	        this.name = name;
	        this.age = age;
	        this.years = years;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getYears() {
			return years;
		}

		public void setYears(int years) {
			this.years = years;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", years=" + years + "]";
		}
	    
	    
}
