import java.util.* ; 
public class ArrayL{
   public static void main(String[] args){
       List<String> l = new ArrayList<>() ; 
       l.add("White") ; 
       l.add("Blue") ; 
       l.add("Black") ; 
       l.add("red") ; 
       System.out.println(l) ;
       for(String s: l){
          System.out.print(s+" ") ;
       }
       Iterator<String> iterator = l.iterator() ; 
       System.out.println("\nWith iterator ") ; 
       while(iterator.hasNext()){
           System.out.print(iterator.next() + " ") ; 
       }
       System.out.println("\nWith for loop ") ; 
       for(int i = l.size()-1 ; i >= 0 ; i--){
           System.out.print(l.get(i)+" ") ; 
       }
       ListIterator<String> listIterator = l.listIterator(l.size()) ; 
       System.out.println("\n With ListIterator " ) ; 
       while(listIterator.hasPrevious()){
           System.out.print(listIterator.previous() + " " ) ; 
       }
       l.add(0,"Green") ; 
       System.out.println("\n The first element is " + l.get(0) ) ; 
       System.out.println(" Update the first element with punk ");
       l.set(0,"punk") ;
       System.out.println(" The first element is " + l.get(0) ) ; 
       System.out.println(" Delete first element so second element is first element"+ l.remove(0) ) ; 
       if(l.contains("red") ){
          System.out.println(" element is found " ) ; 
       }else{
          System.out.println(" element is not found " ) ; 
       }
       Collections.sort(l) ;  
       System.out.println(" Sort arrayList is    " ) ; 
       Iterator<String> i = l.iterator() ; 
       while(i.hasNext()){
          System.out.print(i.next() + " ") ; 
       }
       System.out.println( "\n Copy Array list " ) ; 
       List<String> l1 = new  ArrayList<String>(l) ; 
       ListIterator<String> li = l1.listIterator() ; 
       while( li.hasNext()){
          System.out.print(li.next() + " " ) ; 
       }
       Collections.reverse(l1) ; 
       System.out.println(" \n reverse l1 " ) ; 
       for( String s : l1 ){
           System.out.print( s + " " ) ; 
       }
       Collections.shuffle(l1) ; 
       System.out.println(" \n shuffle l1 ") ; 
       for( String s : l1){
           System.out.print( s + " ") ; 
       }
       System.out.println(" \n extract sublist fron arrayList l1 " ) ; 
       List<String> l2 = l1.subList(0,3) ; 
       for( String str : l2 ){
          System.out.print( str + " " ) ; 
       }
   }
}
