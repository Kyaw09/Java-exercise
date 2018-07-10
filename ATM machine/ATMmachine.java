	import java.util.* ; 
public class ATMmachine{
       static Scanner input = new Scanner(System.in) ; 
   public static void main(String[] args) {
        Account a[] = new Account[10];
        initialBalance(a) ;
        int id = 0; 	
        do{
		boolean b = true ; 
	    do{
             System.out.print( " Enter an id : " ) ;
	     try{
	      id = input.nextInt() ;
	     b = false ; 
	     }catch(Exception ex){
	         System.out.println( " You must enter integer value " ) ; 
		 input.nextLine() ; 
	     }
             
	    }while(b) ; 
          int choice= 0  ; 
	     if(isVaild(id , a ) == true ) {
		     do{
             System.out.println( " MAIN MENU " ) ; 
	     System.out.println( " 1: check balance " ) ; 
	     System.out.println( " 2: withdraw " ) ; 
	     System.out.println( " 3: deposite " ) ; 
	     System.out.println( " 4: exit " ) ;
             boolean booo = true ;   
	     do{ 
		       try{
			System.out.print( "Enter a choice " ) ;  
	              choice = input.nextInt();
	             booo = false ; 
		       }catch(Exception ex){
		          System.out.println( " You must enter integer value " ) ; 
			  input.nextLine() ; 
		       }
		 }while(booo) ; 
             switch(choice) {
		     case 1 : System.out.println( " Your balance is " + a[id].getBalance());break ; 
	             case 2 : boolean bo = true ; 
			      do{
				      try{
			      System.out.print( " Enter an amount to withdraw : " ) ;
			      double withdraw = input.nextDouble() ; 
			      a[id].withdraw(withdraw) ;
			      b = false ;  break ; 
                               }catch(Exception ex){
			          System.out.println(" You must enter integer value " ) ;
				 input.nextLine() ;  
			       }
			      }while(bo) ;break ; 
	             case 3 : boolean boo = true  ; 
			      do{
				      try{
			      System.out.print( " Enter an amount to despoit : " ) ; 
			      double des = input.nextDouble() ; 
			      a[id].deposite(des)  ;
			      b = false ; break ; 
				      }catch(Exception ex) {
				         System.out.println( " You must enter integer value : " ) ; 
					 input.nextLine() ; 
				      }
			      }while(boo) ;  break ; 
	     }
	}while( choice != 4 ) ; 
	  }else{
	     System.out.println( " Your id is invalid " ) ; 
	  }
	}while(true ) ; 
   }
   public static void initialBalance(Account[] a ) {
          int initialBalance = 100 ; 
	  for(int i = 0 ; i < 10 ; i++) {
	      a[i] = new Account(i, initialBalance ) ; 
	  }
   }
   public static boolean isVaild(int id , Account[] a) {
         for( int i = 0 ; i < a.length ; i++ ) {
	     if( id == a[i].getId() ){
	         return true ; 
	     }
	}
	return false ; 
   }
}
