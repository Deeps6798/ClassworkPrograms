package com.morning.sessions;


public class ArrayObjects {
	
		int id;
		String  name;
		int totalmarks;
		
		public ArrayObjects()
		{
			
		}

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

		public int getTotalmarks() {
			return totalmarks;
		}

		public void setTotalmarks(int totalmarks) {
			this.totalmarks = totalmarks;
		}

		@Override
		public String toString() {
			return "ArrayObjects [id=" + id + ", name=" + name + ", totalmarks=" + totalmarks + "]";
		}
		
		

}
