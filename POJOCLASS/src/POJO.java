
public class POJO {

		
		
		private String student;
		private String college;
		public String getCollege() {
			return college;
		}
		public String getStudent() {
			return student;
		}
		public void setStudent(String student) {
			this.student = student;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		@Override
		public String toString() {
			return "POJO [student=" + student + ", college=" + college + "]";
		}

		
}
