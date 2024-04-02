package interfaceandpackages.university.courses;

public class Courses {
    private String courseName;
    private String courseId;

    public Courses(String courseName, String courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course-->" +
                "courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\''
                ;
    }
}