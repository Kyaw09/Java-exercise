public class TestDrive{
  public static void main(String[] args){
      Person p = new Person("Kyaw Kyaw Khaing","Mogok","90309320239","dlldkas;fdk@gmail.com") ;
      System.out.println(p.toString() ) ; 
      Student s = new Student("Kyaw Kyaw Khaing","Mogok","90309320239","dlldkas;fdk@gmail.com",Student.freshman) ;
      System.out.println(s.toString()) ; 
      Employee e = new Employee("Kyaw Kyaw Khaing","Mogok","90309320239","dlldkas;fdk@gmail.com","KKK Technology",500000000,new MyDate()); 
      System.out.println(e.toString()) ; 
      Faculty f = new Faculty("Kyaw Kyaw Khaing","Mogok","90309320239","dlldkas;fdk@gmail.com","KKK Technology",500000000,new MyDate(),"24","CEO") ; 
      System.out.println(f.toString()) ; 
      Staff S = new Staff("Kyaw Kyaw Khaing","Mogok","90309320239","dlldkas;fdk@gmail.com","KKK Technology",500000000,new MyDate(),"AI Technology") ; 
      System.out.println(S.toString()) ; 
  }
}
