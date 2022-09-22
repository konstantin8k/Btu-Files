import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("გამარჯობა, მე ვარ BTU ბოტი. ქვემოთ მოცემული კითხვებიდან აირჩიე ერთ-ერთი ან დაგვიტოვე შეკითხვა.");
        System.out.println("1)ტერიტორიულად სად მდებარეობს BTU?");
        System.out.println("2)როგორ დავუკავშირდე ადმინისტრაციას?");
        System.out.println("დამატებითი კითხვების შემთხვევაში, დაგვიტოვეთ ის აქ.");



        String question_num = scanner.next();



        if (question_num.equals("1")) {
            System.out.println("თბილისი 0162, საქართველო ი.ჭავჭავაძის გამზირი N82");
        } else if (question_num.equals("2")) {
            System.out.println("info@btu.edu.ge ან https://btu.edu.ge/ ");
        } else {
            System.out.println("თქვენი კითხვა გაგზავნილია.");
        }



        while (true) {

            System.out.println("გაქვთ დამატებითი შეკითხვა? (დიახ/არა)");

            String question_add = scanner.next();

            if (question_add.equals("დიახ")) {

                System.out.println("1)ტერიტორიულად სად მდებარეობს BTU?");
                System.out.println("2)როგორ დავუკავშირდე ადმინისტრაციას?");
                System.out.println("დამატებითი კითხვების შემთხვევაში, დაგვიტოვეთ ის აქ.");

                String question_num2 = scanner.next();

                if (question_num2.equals("1")) {
                    System.out.println("თბილისი");
                } else if (question_num2.equals("2")) {
                    System.out.println("info@btu.edu.ge");
                } else {
                    System.out.println("თქვენი კითხვა გაგზავნილია.");
                }

            } else if (question_add.equals("არა")) {
                System.out.println("მადლობა დასმული კითხვებისთვის. მათ პასუხი 1 საათის განმალობაში გაეცემა.");
                break;
            } else {
                System.out.println("გთხობთ შეიტანოთ დიახ ან არა.");
            }

        }

    }

}