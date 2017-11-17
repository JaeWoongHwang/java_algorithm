package bookExercise;
import java.lang.reflect.Method;

import bookExercise.PrintAnnotation;
import bookExercise.Service;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				System.out.println("[" + method.getName() + "] ");

				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}

				System.out.println();

				try {
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();
			}
		}

	}

}
