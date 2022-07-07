package SS05_Access_Modifier_StaticPethod_StaticProperty.Bai_tap2;

public class Main {
    public static void main(String[] args) {
        Student2 st = new Student2("Thao", "C06");
//        Student2 st2 =new Student2("Mai","C07");

//        st.setName("Hoang");
//        st.setGroup("C08");
        System.out.println(st.getName() + "" + st.getGroup());
    }
}
