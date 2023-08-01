package homework2;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class Task1 {
    public int SetVariable() {
        System.out.println("Введите число:");
        try (Scanner dig = new Scanner(System.in)) {
            int result = Integer.parseInt(dig.nextLine());

            return result;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void checkVariables(int vars) throws InvalidNameException {
        if (vars <= 0) {
            throw new InvalidNameException("Некорректное число");
        } else {
           
            System.out.println("Число корректно");
         
        }

    }

}