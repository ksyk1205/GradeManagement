package grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrader(int point) {
		if(point >=70) {
			return "P";
		}else {
			return "F";
		}
	}

}
