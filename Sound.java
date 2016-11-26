package com.company;

public
class Sound {

    public static void main(String[] args)
    throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Pomyślałem literę z przedziały od A do Z. \nSpróbuj ją zganąć: ");
        ch = (char) System.in.read();
        if(ch == answer) {
            System.out.println("Dobrze!");
        }
        else {
            System.out.println("Niestety nie zgadłeś.");
        }
        if(ch < answer) {
            System.out.println("Zbyt nisko");
        }
            else {
                System.out.println("Za wysoko");
            }
        }

    }
