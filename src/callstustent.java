public class callstustent {
   public static void main(String[] args) {
        Student mati = new Student();
        System.out.println(">>" + mati );
        mati.enrollment();
        mati.payment();
        mati.addCourse();
        mati.droopCourse();
        System.out.println("============");
        GraduateStudent yaya = new GraduateStudent();
        yaya.enrollment();
        yaya.addCourse();
        yaya.droopCourse();
        yaya.payment();
        yaya.oralExamination();
        yaya.thesisExamination();
   }
 
}
