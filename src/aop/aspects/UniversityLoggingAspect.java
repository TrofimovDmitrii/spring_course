package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//	@Before("execution(* getStudents())")
//	public void beforeGetStudentsAdvice() {
//		System.out.println("beforeGetStudentsAdvice: логируем получение " +
//				"списка студентов перед методом getStudents.");
//	}
//
//	@AfterReturning(pointcut = "execution(* getStudents())"
//			, returning = "students")
//	public void afterReturningGetStudentsAdvice(List<Student> students) {
//		Student firstStudent = students.get(0);
//		String nameSurname = firstStudent.getNameSurname();
//		nameSurname = "Mr. " + nameSurname;
//		firstStudent.setNameSurname(nameSurname);
//
//		double avgGrade = firstStudent.getAvgGrade();
//		avgGrade = avgGrade + 0.5;
//		firstStudent.setAvgGrade(avgGrade);
//
//		System.out.println("afterReturningGetStudentsAdvice: логируем получение " +
//				"списка студентов после работы метода getStudents.");
//	}

	@AfterThrowing(pointcut = "execution(* getStudents())"
		, throwing = "exception")
	public void afterThrowingGetStudentsAdvice(Throwable exception) {
		System.out.println("afterThrowingGetStudentsAdvice: логируем выброс исключения " + exception);
	}
}
