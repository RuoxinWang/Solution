package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    private Date dateOfBirth;

    public DrivingLicenseApplication() throws Exception {
        System.out.println("Please enter your DOB in YYYY-MM-DD : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        today.setTime(new Date());

        if (dob.after(today)) {
            System.out.println("Wrong DOB");
        }

        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
        int age = curYear - dobYear;

        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) {
            age--;
        } else if (dobMonth == curMonth) {
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = today.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) {
                age--;
            }
        }
        if (age >= 16) {
            System.out.println("Application Process Completed");
        }else{
            System.out.println("The age of the applicant is " + age + " which is too early to apply for a driving license");
        }
    }
}
