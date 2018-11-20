
package college.program;
import java.util.Scanner;
public class CollegeProgram {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("What is your College Department");
    String dep = sc.nextLine();
    
    if (dep.equals("CAS") || dep.equals("cas")){
        System.out.println("Welcome to the College of Arts and Sciences");
        System.out.println("The College advocates an education directed towards the development of the whole person - one that nurtures the intellectual maturity and moral integrity necessary to face the realities and challenges of a rapidly changing world.");
        System.out.println("What is your Academic Program?");
        String prog = sc.nextLine();
            if (prog.equals("English")){
                System.out.println("Your program is Bachelor of Arts in English");
                System.out.println(" The subjects offered in the course hone the four macro-communication skills, thus, developing the abilities of students to speak and write with clarity, and to listen and read with comprehension.");  
            } else if (prog.equals("Political Science")){
                System.out.println("Your program is Bachelor of Arts in Political Science");
                System.out.println(" It is designed to equip students with basic knowledge to become researchers and/or employees in government and non-government offices as well as in public and private political agencies.");
            } else if (prog.equals("Communication")){
                System.out.println("Your program is Bachelor of Arts in Communication");
                System.out.println("Mass Communication, a three-year degree program in the trimester calendar system, is designed for students who are interested to be trained in print media and electronic media - inspire young men and women to seek socially useful and rewarding careers in a field whose importance is second to none.");
            } else if (prog.equals("Psychology")){
                System.out.println("Your program is Bachelor of Arts in Psychology");
                System.out.println(" The program examines the science behind individual and collective behavior.");
            } else
                System.out.println("Sorry the Academic Program that you entered is invalid");
        
    } else if (dep.equals("CBA") || dep.equals("cba")){
        System.out.println("Welcome to the College of Business Administration");
        System.out.println("The College of Business Administration aims to develop and enhance world-class graduates in the field of business administration imbued with social responsibilities and humane values");
        System.out.println("What is your Academic Program?");
        String prog1 = sc.nextLine();
            if (prog1.equals("Business Administration")){
                System.out.println("Your program is Bachelor of Science in Business Administration");
            } else if (prog1.equals("Enterpreneurship")){
                System.out.println("Your program is Bachelor of Science in Enterpreneurship");
            } else if (prog1.equals("Office Administration")){
                System.out.println("Your program is Bachelor of Science in Office Administration");
            } else
                System.out.println("Sorry the Academic Program that you entered is invalid");
            
    } else if (dep.equals("CEA")|| dep.equals("cea")){
        System.out.println("Welcome to the College of Architecture and Engineering");
        System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man.");
        System.out.println("What is your Academic Program?");
        String prog2 = sc.nextLine();
            if (prog2.equals("Architecture")){
                System.out.println("Your program is Bachelor of Science in Architecture");
            } else if (prog2.equals("Civil Engineering")){
                System.out.println("Your program is Bachelor of Science in Civil Engineering");
            }  else if (prog2.equals("Computer Engineering")){
                System.out.println("Your program is Bachelor of Science in Computer Engineering");
            } else  if (prog2.equals("Electronics Engineering")){
                System.out.println("Your program is Bachelor of Science in Electronics Engineering");
            } else  if (prog2.equals("Environmental & Sanitary Engineering")){
                System.out.println("Your program is Bachelor of Science in Environmental & Sanitary Engineering");
            } else
                System.out.println("Sorry the Academic Program you entered is invalid");
    } else if (dep.equals("CITCS")){
        System.out.println("Welcome to the College of Information Technology And Computer Science");
        System.out.println("The College is aware that today's technology revolves around the indispensability of the computer in the fields of computations, database systems, web & graphics, networking & security, mobile technology and digital arts.");
        System.out.println("What is your Academic Program?");
        String prog3 = sc.nextLine();
             if (prog3.equals("Computer Science")){
                System.out.println("Your program is Bachelor of Science in Computer Science");
            } else  if (prog3.equals("Information System")){
                System.out.println("Your program is Bachelor of Science in Information System");
            } else  if (prog3.equals("Information Technology")){
                System.out.println("Your program is Bachelor of Science in Information Technology");
            } else  if (prog3.equals("Computer Technology ")){
                System.out.println("Your program is Associate in Computer Technology");
            } else
                System.out.println("Sorry the Academic program you entered is invalid");
 
    } else if (dep.equals("COA")){
        System.out.println("Welcome to the College of Accountancy");
        System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. ");
        System.out.println("What is your Academic Program?");
        String prog4 = sc.nextLine();
        if (prog4.equals("Accountancy")){
                System.out.println("Your program is Bachelor of Science in Accountancy");
            } else  if (prog4.equals("Accounting Technology")){
                System.out.println("Your program is Bachelor of Science in Accounting Technolgy");
            } else  if (prog4.equals("Management Accounting")){
                System.out.println("Your program is Bachelor of Science in Management Accounting");
            } else  if (prog4.equals("Forensic Accounting")){
                System.out.println("Your program is Bachelor of Science in Forensic Accounting");
            } else
                System.out.println("Sorry the Academic program you entered is invalid");
    } else if (dep.equals("CTE")){
        System.out.println("Welcome to the College of Teacher Education");
        System.out.println("The College of Teacher Education firmly believes that teachers constitute the most important resource in the nation's teaching-learning force");
        System.out.println("What is your Academic Program?");
        String prog5= sc.nextLine();
        if (prog5.equals("Elementary Education General")){
                System.out.println("Your program is Bachelor of Science in Elementary Education - General");
            } else  if (prog5.equals("Elementary Education")){
                System.out.println("Your program is Bachelor of Science in Elementary Education");
            } else  if (prog5.equals("Secondary Eduaction")){
                System.out.println("Your program is Bachelor of Science in Secondary Education");
            } else
                System.out.println("Sorry the Academic program you entered is invalid");
    }else 
        System.out.println("Sorry the College Department that you entered is invalid");
    }
}
