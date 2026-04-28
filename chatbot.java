import java.util.Scanner;
public class chatbot 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Chatbot: Hello! How can I help you?");
        System.out.println("Type 'exit' to end chat.\n");
        while (true) 
        {
            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();
            if (userInput.equals("exit")) 
            {
            System.out.println("Chatbot: Thank you! Have a nice day 😊");
            break;
            }
            else if (userInput.contains("hello") || userInput.contains("hi")) 
            {
                System.out.println("Chatbot: Hello! How can I assist you?");
            }
            else if (userInput.contains("price")) 
            {
                System.out.println("Chatbot: Prices vary by product. Please visit our website.");
            }
            else 
            {
                System.out.println("Chatbot: Sorry, I didn’t understand that.");
            }
        }
        sc.close();
    }
}