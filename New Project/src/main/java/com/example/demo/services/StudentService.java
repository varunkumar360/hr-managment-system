    package com.example.demo.services;

    import com.example.demo.model.Student;
    import com.example.demo.repository.StudentRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class StudentService implements StuService {

        @Autowired
        private StudentRepo StuRepository;

        @Override
        public Student savestudent(Student student){
            return StuRepository.save(student);
        }

        @Override
        public List<Student> getAllStudent() {
            return StuRepository.findAll();
        }
    }
