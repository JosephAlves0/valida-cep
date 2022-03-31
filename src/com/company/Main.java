package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String cep;
        System.out.println("Digite o cep: ");
        cep = input.nextLine();
        cep = cep.replace(".","");
        cep = cep.replace("-", "");

        StringBuffer buffer = new StringBuffer();

        char[] arrayCep = new char[8];
        cep.getChars(0,8,arrayCep,0);

        for(int i = 0; i < arrayCep.length; i++){
            if(i == 2){
                buffer.append(".");
                buffer.append(arrayCep[i]);
            }else if(i == 5){
                buffer.append("-");
                buffer.append(arrayCep[i]);
            }else {
                buffer.append(arrayCep[i]);
            }
        }
        System.out.println(buffer);
    }
}
