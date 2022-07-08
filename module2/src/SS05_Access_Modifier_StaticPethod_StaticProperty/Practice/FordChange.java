package SS05_Access_Modifier_StaticPethod_StaticProperty.Practice;

 class Forg {
     private static int forgCount = 0;

     static int getCount() {
         return forgCount;
     }

     public Forg() {
         forgCount += 1;
     }
 }
    class TestForg {
        public static void main(String[] args) {
            new Forg();
            new Forg();
            new Forg();
//        Forg fc = new Forg(25);
            System.out.println(Forg.getCount());
            new Forg();
            new TestForg().go();
            Forg f =new Forg();
            System.out.println(f.getCount());
        }
        void go(){
            System.out.println(Forg.getCount());
    }
}
