public class Main {
    public static void main(String[] args) {
        String name = "Sokban";
        int age = 20;
        double height = 1.72;
        double weight = 55;
        int number = 0;
        double bmi = weight/(height*height);

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("BMI: "+bmi);

        if(bmi <= 18.4){
            System.out.println("You're underweight!");
        }else if(bmi > 18.5 && bmi < 24.9){
            System.out.println("You're normal!");
        }else if(bmi >25.0 && bmi <39.9){
            System.out.println("You're overweight!");
        }else{
            System.out.println("You're obese!");
        }

        for (int i = 0; i <= 128; i++){
            System.out.println(i);
        }
    }
}
