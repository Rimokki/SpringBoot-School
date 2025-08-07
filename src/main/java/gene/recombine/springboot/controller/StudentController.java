package gene.recombine.springboot.controller;

import gene.recombine.springboot.common.result.CommonResult;
import gene.recombine.springboot.entity.Student;
import gene.recombine.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("{id}")
    public CommonResult selectOne(@PathVariable Long id) {
        Student student = studentService.getById(id);
        return CommonResult.success(student);
    }
}
