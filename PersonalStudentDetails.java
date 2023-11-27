public class PersonalStudentDetails{
    public static void main(String[] args) {
       
        String firstName = "Rakshitha";
        String lastName = "K T";
        int age = 22;
        String gender="F";
        double height = 152;
        boolean isInternational = false;
		String hobby= "dancing";
        String address = "4th cross shivanandappa badavane";
        String city = "Nyamathi";
        String state = "karnataka";
        int pincode=577223;
        long phoneNumber = 7994024449l;
        String email = "rakshithakt.xworkz596@gmail.com";
        int grade = 10;
        float percentage=70.4f;
        boolean isHonorStudent = true;
        String favoriteSubject = "Math";
		String hateSub="Eng";
        double scholarshipAmount = 72.000;
        boolean hasPartTimeJob = false;

        
        System.out.println("Student Details:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("International Student: " + isInternational);
        System.out.println("Address: " + address + ", " + city + ", " + state + " " + pincode);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Grade:" +grade);
		System.out.println("percentage: " +percentage);
        System.out.println("Honor Student: " + isHonorStudent);
        System.out.println("Favorite Subject: " + favoriteSubject);
		System.out.println("hateSub: " +hateSub);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
        System.out.println("Part-Time Job: " + hasPartTimeJob);
    }
}