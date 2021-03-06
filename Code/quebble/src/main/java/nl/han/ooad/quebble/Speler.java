package nl.han.ooad.quebble;

import nl.han.ooad.quebble.gespeeldequiz.GespeeldeQuiz;

import java.util.ArrayList;

public class Speler {

    private final String gebruikersnaam;
    private final String wachtwoord;
    private int saldo;
    private ArrayList<GespeeldeQuiz> gespeeldeQuizen;
    private GespeeldeQuiz actieveQuiz;

    public Speler(String gebruikersnaam, String wachtwoord, int saldo) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = saldo;
    }

    public boolean nogEenActie() {
        return actieveQuiz.nogEenActie();
    }

    public boolean checkVoldoendeSaldo(int bedrag) {
        return saldo > bedrag;
    }

    public void schrijfSaldoAf(int bedrag) {
        saldo -= bedrag;
    }

    public void startQuiz(Quiz quiz) {
        actieveQuiz = new GespeeldeQuiz(quiz);
    }

    public IPrintableToConsole getActie() {
        return actieveQuiz.getActie();
    }

    public void verwerkReactie(String reactie) {
        actieveQuiz.verwerkReactie(reactie);
    }

    public int getScore() {
        return actieveQuiz.getScore();
    }

}
