package com.marian;

/**
 * Created by marian on 9/30/2015.
 */
public class ITECCourseManagers {
        public static void main(String args[]) {
            ITECCourse maintenanceCourse =
                    new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
            //Add some students
            maintenanceCourse.addStudent("Anna");
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");
            maintenanceCourse.writeCourseInfo();
            ITECCourse datacomCourse =
                    new ITECCourse("Data Communications", 1425, 30);
            //Add some students
            datacomCourse.addStudent("Dave");
            datacomCourse.addStudent("Ed");
            datacomCourse.addStudent("Flora");
            datacomCourse.writeCourseInfo();

            ITECCourse javacourse = new ITECCourse("Java Programming", 2545, 24);
            javacourse.addStudent("Gus");
            javacourse.addStudent("Harry");
            javacourse.addStudent("Izzy");
            javacourse.writeCourseInfo();

            ITECCourse maintenanceCourses =
                    new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
            //Add some students
            // TODO check that we have not exceeded the max number for the class
            maintenanceCourse.addStudent("Anna");
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");
            maintenanceCourse.removeStudent("Carl");
            maintenanceCourse.writeCourseInfo();

            ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3);
            smallCourse.addStudent("Jake");
            smallCourse.addStudent("Kirby");
            smallCourse.addStudent("Liam");
            //We can't add this student – what happens?

            smallCourse.addStudent("Marigold");
            ITECCourse smallCourses = new ITECCourse("Small Course", 1111, 3);
            smallCourse.addStudent("Jake");
            smallCourse.addStudent("Kirby");
            smallCourse.addStudent("Liam");
            smallCourse.addStudent("Marigold");
            //Try to fetch smallCourse's name
            String smallCourseName = smallCourse.getCourseName();
            //no errorSystem.out.println(smallCourseName);

//Can also use the setCourseName method to change
//this ITECCourse's name
            smallCourse.setCourseName("Very Small Course");
//Just checking...
            smallCourse.writeCourseInfo();


        }




}

