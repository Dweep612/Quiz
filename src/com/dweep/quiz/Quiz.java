package com.dweep.quiz;

/**
 * Created By Dweep Panchal
 * On 11 Feb 2018
 */

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        System.out.println( "                                                          "
                + "*******QUIZ*******");

        Scanner O = new Scanner(System.in);

        int count = 0;

        while(true) {

            System.out.println();
            System.out.println("What Type of Quiz You Want to Play?");
            System.out.println("(1)Programming Related");
            System.out.println("(2)General Knowledge Related");
            System.out.println("(3)Cricket Related");
            System.out.print("Enter any One Number from Above : ");
            int q = O.nextInt();
            System.out.println();

            if (q == 1) {
                System.out.println("Which Programming Language Related Quiz You Want to Play?");
                System.out.println("(1)C");
                System.out.println("(2)C++");
                System.out.println("(3)Java");
                System.out.print("Enter any One Number from Above : ");
                int pl = O.nextInt();
                System.out.println();

                if (pl == 1) {

                    System.out.println("Who is a Founder Of C Language?");
                    System.out.println("(1)Dennis Ritchie");
                    System.out.println("(2)James Gosling");
                    System.out.println("(3)Bjarne Stroustrup");
                    System.out.println("(4)Nikola Tesla");
                    System.out.print("Enter Your Answer : ");
                    int c1 = O.nextInt();
                    if (c1 == 1) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Dennis Ritchie" );
                    }
                    System.out.println();

                    System.out.println("In Which Year C Language First Appeared?");
                    System.out.println("(1)1980");
                    System.out.println("(2)1991");
                    System.out.println("(3)1972");
                    System.out.println("(4)1992");
                    System.out.print("Enter Your Answer : ");
                    int c2 = O.nextInt();
                    if (c2 == 3) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "1972" );
                    }
                    System.out.println();

                    System.out.println("Why Dennis Ritchie Made C Language?");
                    System.out.println("(1)Just For Fun");
                    System.out.println("(2)Just For Timepass");
                    System.out.println("(3)Because He Want Job in Bell Laboratory");
                    System.out.println("(4)Because He Want To Develop Unix Operating System");
                    System.out.print("Enter Your Answer : ");
                    int c3 = O.nextInt();
                    if (c3 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Because He Want To Develop Unix Operating System" );
                    }
                    System.out.println();

                    System.out.println("From the Following Which is Not C Language HeaderFile?");
                    System.out.println("(1)#include<studio.h>");
                    System.out.println("(2)#include<iostream.h>");
                    System.out.println("(3)#include<math.h>");
                    System.out.println("(4)#include<conio.h>");
                    System.out.print("Enter Your Answer : ");
                    int c4 = O.nextInt();
                    if (c4 == 2) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "#include<iostream.h>" );
                    }
                    System.out.println();

                    System.out.println("From the Following Which is/are C Language Compiler?");
                    System.out.println("(1)Intellij IDEA");
                    System.out.println("(2)Turbo C++");
                    System.out.println("(3)Dev C++");
                    System.out.println("(4)Both 2 and 3");
                    System.out.print("Enter Your Answer : ");
                    int c5 = O.nextInt();
                    if (c5 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Both 2 and 3" );
                    }
                    System.out.println();

                    System.out.println( "Your TotalScore Out of 5 is : " + count );
                    System.out.println();
                } else if (pl == 2) {

                    System.out.println("Who is a Founder Of C++ Language?");
                    System.out.println("(1)Dennis Ritchie");
                    System.out.println("(2)James Gosling");
                    System.out.println("(3)Bjarne Stroustrup");
                    System.out.println("(4)Nikola Tesla");
                    System.out.print("Enter Your Answer : ");
                    int cpp1 = O.nextInt();
                    if (cpp1 == 3) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Bjarne Stroustrup" );
                    }
                    System.out.println();

                    System.out.println("In Which Year C++ Language First Appeared?");
                    System.out.println("(1)1988");
                    System.out.println("(2)1985");
                    System.out.println("(3)1989");
                    System.out.println("(4)1987");
                    System.out.print("Enter Your Answer : ");
                    int cpp2 = O.nextInt();
                    if (cpp2 == 2) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "1985" );
                    }
                    System.out.println();

                    System.out.println("In Which Year C With Classes was Renamed to C++?");
                    System.out.println("(1)1984");
                    System.out.println("(2)1985");
                    System.out.println("(3)1983");
                    System.out.println("(4)1988");
                    System.out.print("Enter Your Answer : ");
                    int cpp3 = O.nextInt();
                    if (cpp3 == 3) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "1983" );
                    }
                    System.out.println();

                    System.out.println("The latest Version of C++ Is");
                    System.out.println("(1)C++03");
                    System.out.println("(2)C++11");
                    System.out.println("(3)C++14");
                    System.out.println("(4)C++17");
                    System.out.print("Enter Your Answer : ");
                    int cpp4 = O.nextInt();
                    if (cpp4 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "C++17" );
                    }
                    System.out.println();

                    System.out.println("From the Following Which is/are C Language Compiler?");
                    System.out.println("(1)Intellij IDEA");
                    System.out.println("(2)Turbo C++");
                    System.out.println("(3)Dev C++");
                    System.out.println("(4)Both 2 and 3");
                    System.out.print("Enter Your Answer : ");
                    int cpp5 = O.nextInt();
                    if (cpp5 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Both 2 and 3" );
                    }
                    System.out.println();

                    System.out.println( "Your TotalScore Out of 5 is : " + count );
                    System.out.println();
                } else {

                    System.out.println("Who is a Founder Of Java Language?");
                    System.out.println("(1)Dennis Ritchie");
                    System.out.println("(2)James Gosling");
                    System.out.println("(3)Bjarne Stroustrup");
                    System.out.println("(4)Nikola Tesla");
                    System.out.print("Enter Your Answer : ");
                    int java1 = O.nextInt();
                    if (java1 == 2) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "James Gosling" );
                    }
                    System.out.println();

                    System.out.println("In Which Year Java Language First Appeared?");
                    System.out.println("(1)1995");
                    System.out.println("(2)1994");
                    System.out.println("(3)1993");
                    System.out.println("(4)1992");
                    System.out.print("Enter Your Answer : ");
                    int java2 = O.nextInt();
                    if (java2 == 1) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "1995" );
                    }
                    System.out.println();

                    System.out.println("Which is the First Name Of Java Language?");
                    System.out.println("(1)Java");
                    System.out.println("(2)Oak");
                    System.out.println("(3)JavaEE");
                    System.out.println("(4)JavaSE");
                    System.out.print("Enter Your Answer : ");
                    int java3 = O.nextInt();
                    if (java3 == 2) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Oak" );
                    }
                    System.out.println();

                    System.out.println("From the Following Which is/are Java Platform?");
                    System.out.println("(1)JavaSE");
                    System.out.println("(2)JavaEE");
                    System.out.println("(3)JavaME");
                    System.out.println("(4)All of the Above");
                    System.out.print("Enter Your Answer : ");
                    int java4 = O.nextInt();
                    if (java4 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "All of the Above" );
                    }
                    System.out.println();

                    System.out.println("From the Following Which is/are C Language Compiler?");
                    System.out.println("(1)Intellij IDEA");
                    System.out.println("(2)Eclipse");
                    System.out.println("(3)Dev C++");
                    System.out.println("(4)Both 1 and 2");
                    System.out.print("Enter Your Answer : ");
                    int java5 = O.nextInt();
                    if (java5 == 4) {
                        System.out.println("Your Answer is Correct");
                        count++;
                    } else {
                        System.out.println("Your Answer is Incorrect");
                        System.out.println();
                        System.out.println( "Correct Answer is : " + "Both 1 and 2");
                    }
                    System.out.println();

                    System.out.println( "Your TotalScore Out of 5 is : " + count );
                    System.out.println();
                }
            } else if (q == 2) {

                System.out.println("Who is Current President of India?");
                System.out.println("(1)Narendra Modi");
                System.out.println("(2)Ram Nath Kovind");
                System.out.println("(3)Pranab Mukherjee");
                System.out.println("(4)Amit Shah");
                System.out.print("Enter Your Answer : ");
                int gk1 = O.nextInt();
                if (gk1 == 2) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Ram Nath Kovind" );
                }
                System.out.println();

                System.out.println("Who is Current Prime Minister of India?");
                System.out.println("(1)Narendra Modi");
                System.out.println("(2)Rahul Gandhi");
                System.out.println("(3)Manmohan Singh");
                System.out.println("(4)Amit Shah");
                System.out.print("Enter Your Answer : ");
                int gk2 = O.nextInt();
                if (gk2 == 1) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Narendra Modi" );
                }
                System.out.println();

                System.out.println("Which State has Largest Sugarcane Production As Per 2016-17?");
                System.out.println("(1)Maharashtra");
                System.out.println("(2)TamilNadu");
                System.out.println("(3)Punjab");
                System.out.println("(4)Uttar Pradesh");
                System.out.print("Enter Your Answer : ");
                int gk3 = O.nextInt();
                if (gk3 == 4) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Uttar Pradesh" );
                }
                System.out.println();

                System.out.println("From the Following Which State is Located in South India?");
                System.out.println("(1)Maharashtra");
                System.out.println("(2)TamilNadu");
                System.out.println("(3)Punjab");
                System.out.println("(4)Uttar Pradesh");
                System.out.print("Enter Your Answer : ");
                int gk4 = O.nextInt();
                if (gk4 == 2) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "TamilNadu" );
                }
                System.out.println();

                System.out.println("Which is the Capital of Karnataka?");
                System.out.println("(1)Hyderabad");
                System.out.println("(2)Mumbai");
                System.out.println("(3)Bengaluru");
                System.out.println("(4)Delhi");
                System.out.print("Enter Your Answer : ");
                int gk5 = O.nextInt();
                if (gk5 == 3) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Bengaluru" );
                }
                System.out.println();

                System.out.println( "Your TotalScore Out of 5 is : " + count );
                System.out.println();
            } else {

                System.out.println("Who Won 2011 World Cup?");
                System.out.println("(1)Australia");
                System.out.println("(2)England");
                System.out.println("(3)India");
                System.out.println("(4)Srilanka");
                System.out.print("Enter Your Answer : ");
                int cri1 = O.nextInt();
                if (cri1 == 3) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "India" );
                }
                System.out.println();

                System.out.println("Who Won 2015 World Cup?");
                System.out.println("(1)Australia");
                System.out.println("(2)SouthAfrica");
                System.out.println("(3)England");
                System.out.println("(4)India");
                System.out.print("Enter Your Answer : ");
                int cri2 = O.nextInt();
                if (cri2 == 1) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Australia" );
                }
                System.out.println();

                System.out.println("Who Score Most International Centuries?");
                System.out.println("(1)Ricky Ponting");
                System.out.println("(2)Hasim Amla");
                System.out.println("(3)Quinton De Kock");
                System.out.println("(4)Sachin Tendulkar");
                System.out.print("Enter Your Answer : ");
                int cri3 = O.nextInt();
                if (cri3 == 4) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Sachin Tendulkar" );
                }
                System.out.println();

                System.out.println("Who Score 3 Double Hundred in International Cricket?");
                System.out.println("(1)Rohit Sharma");
                System.out.println("(2)Chris Gayle");
                System.out.println("(3)Martin Guptill");
                System.out.println("(4)Sachin Tendulkar");
                System.out.print("Enter Your Answer : ");
                int cri4 = O.nextInt();
                if (cri4 == 1) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "Rohit Sharma" );
                }
                System.out.println();

                System.out.println("From the Following Which Cricket Team Never Won International Cricket World Cup?");
                System.out.println("(1)West Indies");
                System.out.println("(2)Pakistan");
                System.out.println("(3)India");
                System.out.println("(4)England");
                System.out.print("Enter Your Answer : ");
                int cri5 = O.nextInt();
                if (cri5 == 4) {
                    System.out.println("Your Answer is Correct");
                    count++;
                } else {
                    System.out.println("Your Answer is Incorrect");
                    System.out.println();
                    System.out.println( "Correct Answer is : " + "England" );
                }
                System.out.println();

                System.out.println( "Your TotalScore Out of 5 is : " + count );
                System.out.println();
            }

            System.out.println("Want to Play Quiz Again?");
            System.out.print("Press 'Y' for Yes and 'N' for No : ");
            char qa = O.next().charAt(0);
            if (qa == 'Y' | qa == 'y') {
                count = 0;
                continue;
            } else {
                System.out.println();
                System.out.println("                                                "
                        + "*******ThankYou For Playing This QUIZ*******");
                break;
            }
        }
    }
}
