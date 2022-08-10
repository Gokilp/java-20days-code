// create class and object using instition
class insitution{
    String college;
    String course;
    String rollno;

}
public class program16 {
    public static void main (String [] agrs)
    {
        insitution college = new insitution();
        college.college="KG college of arts and Science ";
        college.course="Bsc Computer science";
        college.rollno="2122ka14";

        insitution college1 = new insitution();
        college1.college="KG college of Arts and Science ";
        college1.course="Bcom CA";
        college1.rollno="212acb34";
        System.out.println(college.college);
        System.out.println(college.course);
        System.out.println(college.rollno);
        System.out.println(college1.college);
        System.out.println(college1.course);
        System.out.println(college1.rollno);


    }

}
