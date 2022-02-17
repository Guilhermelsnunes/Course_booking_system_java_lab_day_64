package com.codeclan.example.coursebookingsystem.components;


import com.codeclan.example.coursebookingsystem.models.Booking;
import com.codeclan.example.coursebookingsystem.models.Course;
import com.codeclan.example.coursebookingsystem.models.Customer;
import com.codeclan.example.coursebookingsystem.repositories.BookingRepository;
import com.codeclan.example.coursebookingsystem.repositories.CourseRepository;
import com.codeclan.example.coursebookingsystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


    public DataLoader() {

    }


    public void run(ApplicationArguments args){
        Course courseOne = new Course("Python1","Glasgow", 3);
        courseRepository.save(courseOne);

        Customer customerOne = new Customer("Mary", "Edinburgh", 30);
        customerRepository.save(customerOne);

        Booking bookingOne = new Booking("20/02/2022", customerOne, courseOne);
        bookingRepository.save(bookingOne);

        Course course2 = new Course("Professional Software Development", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customerTwo = new Customer("Tamer", "Glasgow", 27);
        Customer customerThree = new Customer("Guillherme", "Moffat", 18);
        customerRepository.save(customerTwo);
        customerRepository.save(customerThree);

        Booking bookingTwo = new Booking("03/02/2022", customerTwo, course2);
        Booking bookingThree = new Booking("04/04/2022", customerTwo, courseOne);
        Booking bookingFour = new Booking("05/06/2022", customerThree, courseOne);
        bookingRepository.save(bookingTwo);
        bookingRepository.save(bookingThree);
        bookingRepository.save(bookingFour);

    }



}
