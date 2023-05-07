package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
    }
}
