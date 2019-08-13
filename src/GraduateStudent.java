public class GraduateStudent extends Student{
    private String studyLevel;
    private String thesisAdviser;
    
    public void  oralExamination(){
        System.out.println("oralExamination");
    }
     public void  thesisExamination(){
        System.out.println("thesisExamination");
    }

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }
    
}
