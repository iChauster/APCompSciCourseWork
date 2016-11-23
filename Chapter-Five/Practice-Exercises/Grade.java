public class Grade {
	private double gpa = 0.0;
	public Grade(double a){
		this.gpa = a;
	}
	public String getLetterGrade(){
		double gpa = this.gpa;
		if(gpa >= 4.0){
			return "A+";
		}else if (gpa >= 3.0){
			if(gpa >= 3.85){
				return "A";
			}else if(gpa >= 3.7){
				return "A-";
			}else if(gpa >= 3.15){
				return "B+";
			}else{
				return "B";
			}
		}else if (gpa >= 2.0){
			if(gpa >= 2.85){
				return "B";
			}else if(gpa >= 2.7){
				return "B-";
			}else if(gpa >= 2.15){
				return "C+";
			}else{
				return "C";
			}
		}else if (gpa >= 1.0){
			if(gpa >= 1.85){
				return "C";
			}else if(gpa >= 1.7){
				return "C-";
			}else if(gpa >= 1.15){
				return "D+";
			}else{
				return "D";
			}
		}else{
			if(gpa > 0.85){
				return "D"
			}else if(gpa > 0.7){
				return "D-"
			}else{
				return "F";
			}
		}
	}
	public static void main(String[] args){
		Grade g = new Grade(2.85);
		System.out.println(g.getLetterGrade());
	}
}