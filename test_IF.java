//test_IF 11-11-22

class test_IF {
    public static void main(String[] args) {

        int x=3;

        //  solo IF
        if (x==3) {
            System.out.println("ciao");

        }                                                  //  qui termina l'if


        //  IF ed ELSE----------------------------------------------------------------------------
        if (x==5) {
            System.out.println("ciao");

        }                                                   //  qui termina l'if
        else {
            System.out.println("non ciao");

        }                                                   //  qui termina l'else



        //  _IF_ ed _IF ELSE_ ed _ELSE_-------------------------------------------------------------
        if (x==5) {
            System.out.println("ciao");

        }                                                    //  qui termina l'if
        else if(x==7){
            System.out.println("ciao bello");

        }                                                    //  qui termina l'else if
        else {
            System.out.println("non ciao");

        }                                                    //  qui termina l'else

    }
    //  termine metodo main della classe test_IF
}
//  termine classe main