package com.codeclan.example.coursebookingsystem.repositories;

import com.codeclan.example.coursebookingsystem.models.Booking;
import com.codeclan.example.coursebookingsystem.models.Course;
import com.codeclan.example.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository <Course, Long> {

//    List<Course> findCourses();

    Course findDistinctCourseById(Long id);

    List<Course> findCoursesByStarRating(int rating);

    List<Course> findCoursesByBookingsCustomer(Customer customer);


}
