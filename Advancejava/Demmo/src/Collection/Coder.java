package Collection;
import java.util.*;
public class Coder {

    void register(String greeting) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for department choice
        System.out.print("Enter your choice (CSE / ENTC / AI / IT): ");
        String choice = sc.nextLine();

        System.out.println("------------------");
        System.out.println(greeting + " " + name);
        System.out.println("Your input: " + choice);

        switch (choice) {
            case "CSE":
                System.out.println("You selected Computer Science Engineering");
                System.out.println("Focus: Programming, Algorithms, Data Structures, AI, ML");
                System.out.println("Duration: 4 years");
                System.out.println("Eligibility: 50%+ in 10+2");
                break;

            case "IT":
                System.out.println("You selected Information Technology");
                System.out.println("Focus: Software Development, Networking, Cybersecurity");
                System.out.println("Duration: 4 years");
                System.out.println("Eligibility: 50%+ in 10+2");
                break;

            case "ENTC":
                System.out.println("You selected Electronics and Telecommunication");
                System.out.println("Focus: Electronics, Communication Systems, Networking");
                System.out.println("Duration: 4 years");
                System.out.println("Eligibility: 50%+ in 10+2 (Science Stream Preferred)");
                break;

            case "AI":
                System.out.println("You selected Artificial Intelligence");
                System.out.println("Focus: AI, ML, Robotics, Data Science");
                System.out.println("Duration: 4 years");
                System.out.println("Eligibility: 50%+ in 10+2");
                break;

            default:
                System.out.println("Invalid Department");
        }

        // Ask for marks
        System.out.print("Enter your marks: ");
        int mark = sc.nextInt();

        // Branch eligibility based on marks
        if (mark < 50) {
            System.out.println("Not allowed in any branch");
        } else if (mark >= 50 && mark <= 90) {
            System.out.println("Allowed in ENTC branch");
        } else if (mark > 90) {
            System.out.println("Allowed in all branches");
        } else {
            System.out.println("Enter correct marks");
        }

        // consume the leftover newline so nextLine() works correctly
        sc.nextLine();

        System.out.println("Which course are we allowing? ");
        String course = sc.nextLine();
        System.out.println(course);
        System.out.println("ok");

        System.out.print("How many courses do you want to enter: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String allCourses = "";   // single String variable

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter course " + i + ": ");
            String course1 = sc.nextLine();

            allCourses = allCourses + course1;

            if (i != n) {
                allCourses = allCourses + ", ";
            }
        }

        System.out.println("\nAll Courses Entered:");
        System.out.println(allCourses);

        // Rules & Conditions (based on normalized choice)
        if (choice.equals("CSE")) {
            System.out.println("\n--- CSE Rules & Conditions ---");
            Thread.sleep(500);
            System.out.println("1. Minimum 50% in 12th with Mathematics.");
            Thread.sleep(500);
            System.out.println("2. Attendance must be 75%.");
            Thread.sleep(500);
            System.out.println("3. Lab work is compulsory.");
            Thread.sleep(500);
            System.out.println("4. Final year project mandatory.");

        } else if (choice.equals("ENTC")) {
            System.out.println("\n--- ENTC Rules & Conditions ---");
            Thread.sleep(500);
            System.out.println("1. Minimum 50% in 12th with Physics & Maths.");
            Thread.sleep(500);
            System.out.println("2. 75% attendance required.");
            Thread.sleep(500);
            System.out.println("3. Practical exams compulsory.");
            Thread.sleep(500);
            System.out.println("4. Industrial training required.");

        } else if (choice.equals("AI")) {
            System.out.println("\n--- AI Rules & Conditions ---");
            Thread.sleep(500);
            System.out.println("1. Minimum 60% in 12th (Science Stream).");
            Thread.sleep(500);
            System.out.println("2. Basic programming knowledge preferred.");
            Thread.sleep(500);
            System.out.println("3. AI lab work compulsory.");
            Thread.sleep(500);
            System.out.println("4. Research project mandatory.");

        } else if (choice.equals("IT")) {
            System.out.println("\n--- IT Rules & Conditions ---");
            Thread.sleep(500);
            System.out.println("1. Minimum 50% in 12th with Mathematics.");
            Thread.sleep(500);
            System.out.println("2. 75% attendance required.");
            Thread.sleep(500);
            System.out.println("3. Networking lab compulsory.");
            Thread.sleep(500);
            System.out.println("4. Internship required in final year.");

        } else {
            System.out.println("Invalid Course Selected.");
        }
       

                System.out.println("Welcome to XYZ Engineering College");
                System.out.println("Courses Available: CSE, ENTC, AI, IT");

                System.out.print("\nEnter your course: ");
                String choice1 = sc.nextLine().toUpperCase();

                System.out.println("\nLoading course details...");
                Thread.sleep(1000);

                if (choice1.equals("CSE")) {

                    System.out.println("\n--- CSE Rules ---");
                    Thread.sleep(500);
                    System.out.println("1. 75% Attendance Required");
                    Thread.sleep(500);
                    System.out.println("2. Lab Work Compulsory");
                    Thread.sleep(500);
                    System.out.println("3. Final Year Project Mandatory");

                    Thread.sleep(1000);
                    System.out.println("\nAfter Course Completion - Placements:");
                    Thread.sleep(500);
                    System.out.println("Top Companies: Google, Microsoft, TCS");
                    Thread.sleep(500);
                    System.out.println("Average Package: 6 LPA");
                }

                else if (choice1.equals("ENTC")) {

                    System.out.println("\n--- ENTC Rules ---");
                    Thread.sleep(500);
                    System.out.println("1. 75% Attendance Required");
                    Thread.sleep(500);
                    System.out.println("2. Practical Exams Compulsory");
                    Thread.sleep(500);
                    System.out.println("3. Industrial Training Required");

                    Thread.sleep(1000);
                    System.out.println("\nAfter Course Completion - Placements:");
                    Thread.sleep(500);
                    System.out.println("Top Companies: BSNL, Reliance, L&T");
                    Thread.sleep(500);
                    System.out.println("Average Package: 4 LPA");
                }

                else if (choice1.equals("AI")) {

                    System.out.println("\n--- AI Rules ---");
                    Thread.sleep(500);
                    System.out.println("1. Programming Knowledge Required");
                    Thread.sleep(500);
                    System.out.println("2. AI Lab Work Compulsory");
                    Thread.sleep(500);
                    System.out.println("3. Research Project Mandatory");

                    Thread.sleep(1000);
                    System.out.println("\nAfter Course Completion - Placements:");
                    Thread.sleep(500);
                    System.out.println("Top Companies: OpenAI, IBM, Infosys");
                    Thread.sleep(500);
                    System.out.println("Average Package: 8 LPA");
                }

                else if (choice1.equals("IT")) {

                    System.out.println("\n--- IT Rules ---");
                    Thread.sleep(500);
                    System.out.println("1. 75% Attendance Required");
                    Thread.sleep(500);
                    System.out.println("2. Networking Lab Compulsory");
                    Thread.sleep(500);
                    System.out.println("3. Internship Mandatory");

                    Thread.sleep(1000);
                    System.out.println("\nAfter Course Completion - Placements:");
                    Thread.sleep(500);
                    System.out.println("Top Companies: Wipro, TCS, Accenture");
                    Thread.sleep(500);
                    System.out.println("Average Package: 5 LPA");
                }

                else {
                    System.out.println("Invalid Course Selected.");
                }

                System.out.println("\nThank you for visiting XYZ Engineering College!");
                sc.close();
    
        System.out.println("\nWelcome to XYZ Engineering College");
        System.out.println("Course Selected: " + course);
        Thread.sleep(1000);

        System.out.println("\nGeneral College Rules:");
        Thread.sleep(500);
        System.out.println("1. 75% Attendance Mandatory");
        Thread.sleep(500);
        System.out.println("2. Discipline Required");
        Thread.sleep(500);
        System.out.println("3. Exams Compulsory");
    }
    
    public class Codemo extends Coder{
    	 public void showDetails(String course) throws InterruptedException {


    	        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    	        if (course.equalsIgnoreCase("CSE")) {

    	            System.out.println("\n--- CSE Department Info ---");
    	            try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    	            System.out.println("Duration: 4 Years");
    	            System.out.println("Fees: 1,00,000 per year");
    	            System.out.println("Placement: Google, Microsoft, TCS");
    	            System.out.println("Average Package: 6 LPA");
    	            
    	            
    	            Codemo obj = new Codemo();
    	            obj.register("Hello");
    	            
    	        }
    	 }
    	 
    }
}