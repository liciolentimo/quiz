package com.lentimosystems.quizapp;

public class Questions {
    public String mPresidents[] = {
           "Who is the President of Kenya?",
           "Who is the President of Nigeria?",
           "Who is the President of Gambia?",
           "What is the Name of Tanzania's President?"
    };
    private String mPresidentsChoices [][] = {
            {"Uhuru Kenyatta"," Abdelaziz Bouteflika","Thomas Boni Yayi","Ikililou Dhoinine"},
            {"Idriss Déby","Muhammadu Buhari"," Hage Geingob","Abdiweli Mohamed Ali"},
            {"Abdiweli Mohamed Ali"," Alpha Condé","Yahya Jammeh"," Ellen Johnson Sirleaf"},
            {" Omar al-Bashir"," Faure Gnassingbé"," Beji Caid Essebsi","John Pombe Magufuli"}
    };
    private String mCorrectPresident[] = {"Uhuru Kenyatta","Muhammadu Buhari","Yahya Jammeh","John Pombe Magufuli"};

    public String getQuestion(int a) {
        String question = mPresidents[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice = mPresidentsChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mPresidentsChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mPresidentsChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mPresidentsChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectPresident[a];
        return answer;
    }
}
