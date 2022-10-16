public class Student extends Person implements Learner{

    double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {

    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
