
/**
 * This is the main driver class for this program
 *
 * @author Kyle Fedalen
 * @version 4/20/2020
 */
import java.util.ArrayList;
import java.util.Scanner;
public class main
{

    /**
     * this method is the main method for this program
     */
    public static void main()
    {
        System.out.printf("%s\n\n\n","Starting program...");
        BinarySearchTree bst = new BinarySearchTree();
        Scanner in = new Scanner(System.in);

        int genstudents = 3;
        for(int i = 0; i < genstudents;i++){
            int tempid = Student.genId();
            bst.add(new Student(tempid,Student.genName(tempid),Student.genMajor()));
            //System.out.printf("%b\n",Student.isIdUsed(st,bst));
        }
        bst.add(new Student(123, "John Smith", "DPR"));
        bst.add(new Student(124, "Kelly Jones", "IMM"));
        bst.add(new Student(125, "Fred Kingston", "FRE"));
        bst.add(new Student(225, "John Appleton", "DPR"));
        bst.add(new Student(226, "Wesley Crusher", "DPR"));
        bst.add(new Student(365, "Doug Geen", "IMM"));

        boolean ok = false;
        do{
            try{
                printMenu(bst);
                int ch = in.nextInt();
                choose(ch,bst,in);
            }catch(Exception e){
                String st = e.getMessage();

                
                in.nextLine();
                System.out.println("Error:"+ st);
                System.out.print("Press Enter to continue...\n");
                in.nextLine();

            }
        }while(!ok);

        System.out.printf("%s\n","Ending program...");

    }

    
    /**
     * this method checks through the binary search tree for 
     * a student with the same id as the entered id 
     * if id is already in use this method throws an Exception
     * @pram id - the student id to check
     * @pram bst - the binary search tree to check through
     * @throws Exception - if entered id is already in use
     */
    public static void isIdUsed(int id, BinarySearchTree bst)throws Exception
    {
        Student st = new Student(id);

        if((Student)bst.find(st)!=null){
            throw new Exception("id already in use");
        }

    }

    /**
     * this method adds a student to the binary search tree
     * @pram id - the student id
     * @pram major - the student major
     * @pram name - the student name 
     * @pram bst - the binary search tree to add the student to
     * @throws Exception - if id already in use, name blank or null,Major not 3 char long
     */
    public static void addStudent( int id,String name, String major,BinarySearchTree bst)throws Exception
    {
        isIdUsed(id,bst);
        Student st = new Student();
        st.setId(id);
        st.setName(name);
        st.setMajor(major);

        bst.add(st);
    }

    /**
     * asks the user to enter the name and major then adds a student to the binary search tree
     * with the entered variables
     * @pram id - the student id
     * @pram bst - the binary search tree
     * @pram in - the scanner object
     * @throws Exception - if id already in use, if name null or blank, if major not 3 char long
     */
    public static void createStudent(int id, BinarySearchTree bst,Scanner in)throws Exception
    {
        String myname = null;
        String mymajor = null;

        isIdUsed(id,bst);

        int count = 1;
        switch(count){
            case 1:
            in.nextLine(); 
            System.out.printf("Input Student name:");
            myname = in.nextLine();
            if(myname.isEmpty()||myname == null){//check if name is null or blank
                throw new Exception("name entered null or blank");
            }
            count++;
            case 2:
            System.out.printf("Input Student major");
            mymajor = in.nextLine();
            if(mymajor.length() !=3){//check if major is 3 characters long
                throw new Exception("A major must be 3 chars long");
            }
            count++;
            case 3:

            addStudent(id,myname,mymajor,bst);
            break;

        }

    }
    /**
     * this method removes the student with the entered id from the binary search tree
     * @pram id - the id to search for
     * @pram bst - the binary search tree to search
     * @throws Exception - if no student with searched id found
     */
    public static void removeStudent(int id,BinarySearchTree bst)throws Exception
    {
        Student st = new Student(id);

        if((Student)bst.find(st)==null){
            throw new Exception("no student with entered id found");
        }
        bst.remove(st);
    }

    /**
     * this method handles the user input and adding and removing data from the binary search tree
     * @pram ch - the users menu choice
     * @pram bst - the givin binary search tree
     * @pram in - the Scanner object
     * @pram spacing - the string spacing for the menu output
     * throws Exception - - if id already in use, if name null or blank, if major not 3 char long
     */
    public static void choose(int ch,BinarySearchTree bst,Scanner in) throws Exception
    {
        int ch1 = 0;
        switch(ch){
            case 1:

            System.out.printf("%s\n","Enter Id For New Student:");
            ch1 = in.nextInt();

            createStudent(ch1,bst,in);
            break;
            case 2:
            System.out.printf("%s\n","Enter Id of Student to remove:");
            ch1 = in.nextInt();
            removeStudent(ch1,bst);
            break;
            case 3:
            int searchID = 0;

            System.out.printf("%s\n>","Enter Id to Search");
            searchID = in.nextInt();

            Student found = findStudentById(searchID,bst);

            if(found == null){
                System.out.printf("\f");
                System.out.printf("error: student with ID:%d not found\n",searchID);
                System.out.printf("%7s\n1)%s\n2)%s\n","Menu","Add Student","Back");
                ch1 = in.nextInt();
                if(ch1 == 1){
                    createStudent(searchID,bst,in);
                }else{
                    break;
                }
            }else{
                System.out.printf("\f");
                System.out.printf("%s\n%s\n","Student Found","-------------------------");
                System.out.printf("%s\n",found);
                System.out.printf("%7s\n1)%s\n2)%s\n","Menu","Remove Student","Back");
                ch1 = in.nextInt();
                if(ch1 == 1){
                    removeStudent(found.getId(),bst);
                }else{
                    break;
                }
            }
            break;

            case 4:

            Student mj = new Student();
            in.nextLine();
            System.out.printf("Enter Major to filter by:");
            String ch3 = in.nextLine();

            printFilteredList(ch3,bst);
            System.out.printf("%7s\n1)%s\n","Menu","Back");
            in.nextLine();
            break;

            case 5:
            printList(bst);
            System.exit(0);

        }
    }

    
    /**
     * this method searches through the giving binary search tree for the given student
     * @pram bst - binary search tree to search through
     * @pram st - the student object(id only) to search through the tree for
     * @return found - returns the student object if found, returns null if not found
     */
    public static Student search(BinarySearchTree bst,Student st)
    {
        Student found = (Student)bst.find(st);
        return found;
    }

    /**
     * this method searches through a binary search tree to find a student matching 
     * the entered id throws exception if not found
     * @pram id - the id to search for
     * @pram bst - the binary search tree to search
     * @return found - the fiund student object
     * @throws Exception - if student with entered id not found
     */
    public static Student findStudentById(int id,BinarySearchTree bst)throws Exception
    {

        Student st = new Student();
        st.setId(id);
        Student found = search(bst,st);
        return found;

    }

    /**
     * this method prints out all elements within a givin binary search tree
     * filtered by the given major
     * @pram majorf - the Major used as a filter
     * @pram bst - the binary search tree to print
     * @pram spacing - the string formating spacing
     */
    public static void printFilteredList(String majorf,BinarySearchTree bst)
    {
        majorf = majorf.toUpperCase();
        int count = 0;
        ArrayList<Object> students = bst.getList();
        System.out.printf("\f");
        System.out.printf("%25s\n%s%s\n","Student Listings","Filtered By:",majorf);
        System.out.printf("%s%14s %12s\n","ID","Student Name","Major");
        System.out.printf("%s\n","-----------------------------------");

        for(Object e:students){
            Student st = (Student)e;
            if(st.getMajor().equals(majorf)){
                count++;
                System.out.print(e+"\n") ;
            }

        }
        if(count == 0){
            System.out.printf("%s\n","No Students With Entered Major Found");
        }
    }

    /**
     * this method prints out all elements within a givin binary search tree
     * @pram bst - the binary search tree to print
     * @pram spacing - the string formating spacing
     */
    public static void printList(BinarySearchTree bst)
    {
        ArrayList<Object> students = bst.getList();
        System.out.printf("\f");
        System.out.printf("%25s\n","Student Listings");
        System.out.printf("%s%14s %12s\n","ID","Student Name","Major");
        System.out.printf("%s\n","-----------------------------------");
        for(Object e:students){
            Student st = (Student)e;

            System.out.print(e+"\n") ;
        }
        System.out.printf("%s\n","-----------------------------------");
    }

    /**
     * this method prints out the main menu for the program
     * @pram bst - the BinarySearchTree to print
     * @pram spacing - the string format spacing for the menu
     */
    public static void printMenu(BinarySearchTree bst)
    {
        System.out.printf("\f");

        printList(bst);

        System.out.printf("%7s\n1)%s\n2)%s\n3)%s\n4)%s\n5)%s\n","Menu","Add Student","Remove Student","Search Listings","Filter by Major","Quit");

    }

}
