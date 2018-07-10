import java.lang.* ; 
public class StackofInteger{
        private int[] element ; 
        private int size ; 
        private static final int Default_of_Capacity = 16 ;
        public StackofInteger(){
           this(Default_of_Capacity) ; 
        }
        public StackofInteger(int Default_of_Capacity){
            this.element = new int[Default_of_Capacity];
        }
        public  void push(int value) {
            if( size > Default_of_Capacity ){
                 int[] temp = new int[Default_of_Capacity * 2 ] ; 
                 System.arraycopy(element,0,temp,0,element.length); 
                 element = temp ; 
            }
            element[size++] = value ; 
        }
        public  int pop(){
            return element[--size] ; 
        }
        public  int peek() {
            return element[element.length - 1 ] ; 
        }
        public int getSize(){
            return size ; 
        }
}
