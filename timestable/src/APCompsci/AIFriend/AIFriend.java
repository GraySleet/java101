//Matthew Xue
package APCompsci.AIFriend;
import java.util.Scanner;
    public class AIFriend
    {
        private boolean done;
        private String otherName;

        public AIFriend(String who)
        {
            done = false;
            otherName = who;
        }

        public String greet(String a)
        {
            //Replace this with your greeting, let the person know "your" name.
            return "Hello," + a + ", I'm your AIFriend!";
        }

        public String says(String statement)
        {
            String lowerStmt = statement.toLowerCase();  //so we don't have to worry about case when searching
            String sayBack = "";

            if (lowerStmt.indexOf("bye") >= 0 )
            {
                //Goodbye Statement
                done = true;
                sayBack = "Goodbye, " + otherName + "!  It's been nice chatting with you";
            }
            else if (lowerStmt.indexOf("not well")>=0 || lowerStmt.indexOf("bad")>=0 || lowerStmt.indexOf("not good")>=0 || lowerStmt.indexOf("not very")>=0)    //CHANGE THIS: each 'else if' part of the statement should look for words and build a response
            {
               //Greeting statement, in which the responder is not feeling well
                sayBack = "I'm sorry to hear that. Why are you not feeling so well?";
            }
            else if (lowerStmt.indexOf("great")>=0 || lowerStmt.indexOf("good")>=0 || lowerStmt.indexOf("fine")>=0)
            {
                //Greeting statement, in which the responder is feeling well
                sayBack = "Great! Why are you feeling good today?";
            }
            else if (lowerStmt.indexOf("yes")>0 || lowerStmt.indexOf("yeah")>=0 || lowerStmt.indexOf("of course")>=0)
            {
                sayBack = "Well, that's great! Now it's your turn. what else do you want to talk about?";//that's great, or some encouraging statement.
            }
            else if (lowerStmt.indexOf("no")>=0 || lowerStmt.indexOf("not really")>=0)
            {
                sayBack = "Well, thats fine. What else do you want to talk about?";//Something not good, or and some statement
            }
            else if (lowerStmt.indexOf("maybe")>=0||lowerStmt.indexOf("I dont know")>=0||lowerStmt.indexOf("I don't know")>=0||lowerStmt.indexOf("I don't think so")>=0)
            {
                sayBack = "well, I don't know either. Do you want to say anything else?";//Because they don't know, change to a different topic?
            }
            else if (lowerStmt.indexOf("poop")>=0)
            {
                sayBack = "Hey, don't say that!";
            }
            else if (lowerStmt.indexOf("games")>=0)
            {
                sayBack = "Oh, what kind of games do you play?";
            }
            else if (lowerStmt.indexOf("food")>=0)
            {
                sayBack = "I really want to eat food, but I cant. Anyways, can you eat food?";

            }
            else if (lowerStmt.indexOf("sorry")>=0)
            {
                sayBack = "it's fine!";
            }
            else if (lowerStmt.indexOf("i like to")>=0)
            {
                String like = statement.substring(lowerStmt.indexOf("i like")+10);
                sayBack = "Yeah, I like" + like + "too!";
            }
            else if (lowerStmt.indexOf("i don't like")>=0)
            {
                String hate = statement.substring(lowerStmt.indexOf("i don't like")+13);
                sayBack = "I agree, I don't like" + hate + "either." ;
            }
            else if (lowerStmt.indexOf("sports")>=0)
            {
                sayBack = "Hey, a sport I like is handball! Do you like handball?";
            }
            else if (lowerStmt.indexOf("computer")>=0)
            {
                sayBack = "Well, I don't have a computer. I'm in one! Do you use your computer a lot?";
            }

            else          //you need to have multiple default responses in case the user says none the special words
            {
                //use Math.random to generate an even probability of the default statements you have.  You must have
                //  at least four when you turn this in.  This example is for 3.
                double chance = Math.random();
                if (chance < 0.5&&chance>0.4)
                {
                    sayBack = "I have a question: do you not like anything?";
                }
                else if (chance < 0.3 && chance>0.1)
                {
                    sayBack = "Well, on a side note, do you like any sports?";
                }
                else if (chance>0.6 && chance<0.8)
                {
                    sayBack = "Hey, I just thought of something. Do you have a computer?";
                }
                else if (chance>0.8 && chance < 0.9)
                {
                    sayBack = "Hey! do you like anything?";
                }
                else{

                    sayBack ="Well, I dont understand that. What else do you want to talk about?";
                }
            }
            return sayBack;

        }

        public boolean isDone()
        {
            return done;
        }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            //Open the conversation with a greeting
            System.out.println("Hello!  What is your name?");
            String userName = scan.nextLine();

            //Create an AI friend to talk to.
            AIFriend myFriend = new AIFriend(userName);
            System.out.println(myFriend.greet(userName));
            System.out.println("How are you doing today?");
            String GreetingResponse = scan.nextLine();
            System.out.println(myFriend.says(GreetingResponse));
            String feelingResponse = scan.nextLine();
            System.out.println(myFriend.says(feelingResponse));
            //Keep talking until the person says goodbye
            while(!myFriend.isDone())
            {
                String userSaid = scan.nextLine();
                System.out.println(myFriend.says(userSaid));

            }
        }

    }



