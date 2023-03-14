package ua.lviv.lgs;

public class Application {
	    public static void main(String[] args) {
	        // Створюємо масив з 10 цілих чисел
	        int[] numbers = {5, 10, -3, 8, 0, 14, 2, 7, -2, 1};
	        
	        // Шукаємо мінімальне та максимальне значення в масиві
	        int min = numbers[0];
	        int max = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        
	        // Виводимо мінімальне та максимальне значення на консоль
	        System.out.println("Мінімальне значення: " + min);
	        System.out.println("Максимальне значення: " + max);
	    }
	
}
