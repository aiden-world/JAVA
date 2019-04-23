package com.wydhcws.bean;

public class Customer {
		private String name ;
		private char gendar ;
		private int age;
		private String phone ;
		private String email ;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getGendar() {
			return gendar;
		}
		public void setGendar(char gendar) {
			this.gendar = gendar;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Customer() {
			super();
		}
		public Customer(String name, char gendar, int age, String phone, String email) {
			super();
			this.name = name;
			this.gendar = gendar;
			this.age = age;
			this.phone = phone;
			this.email = email;
		}
		
		
		
}
