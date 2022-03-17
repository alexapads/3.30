package IfStatements;

public class NestedIf1 {
    public static void main(String[] args) {
        //passport, visa, ticket, covid test

        boolean passport = true, visa = true, ticket = true, covid = true; //depending on true/false will affect print outcome

        if (passport){      //don't need to put == or != bc true or false is already implemented
            if (visa){      // if statement inside previous statement
                if (ticket){
                    if (covid){
                        System.out.println("You can fly to miami"); //if everything returns TRUE this line will print
                    }else{      //if covid line fails
                        System.out.println("go to hospital");
                    }
                }else{          //if ticket line fails etc
                    System.out.println("ticket is required");
                }
            }else{      //keep track of curly brackets
                System.out.println("you need a visa");
            }
        }else{      //this aligns with passport if statement
            System.out.println("You must have passport first");
        }
    }
}
