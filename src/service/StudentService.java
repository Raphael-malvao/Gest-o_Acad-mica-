package com.example.schoolmanagement.service;

import com.example.schoolmanagement.exception.StudentNotFoundException;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * Cadastra um novo estudante no sistema.
     * @param student Objeto Student com as informações do aluno.
     * @return O aluno cadastrado.
     */
    public Student createStudent(Student student) {
        // Validação simples para evitar duplicatas por matrícula
        if (studentRepository.existsByRegistrationNumber(student.getRegistrationNumber())) {
            throw new IllegalArgumentException("Já existe um aluno com este número de matrícula!");
        }
        return studentRepository.save(student);
    }

    /**
     * Retorna todos os estudantes cadastrados.
     * @return Lista de estudantes.
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Busca um estudante por ID.
     * @param id ID do estudante.
     * @return O estudante encontrado ou exceção se não existir.
     */
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Estudante não encontrado com o ID: " + id));
    }

    /**
     * Atualiza os dados de um estudante.
     * @param id ID do estudante a ser atualizado.
     * @param updatedStudent Dados atualizados do estudante.
     * @return O estudante atualizado.
     */
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setRegistrationNumber(updatedStudent.getRegistrationNumber());
        existingStudent.setBirthDate(updatedStudent.getBirthDate());
        existingStudent.setMaterias(updatedStudent.getMaterias()); // Atualiza as matérias se necessário

        return studentRepository.save(existingStudent);
    }

    /**
     * Exclui um estudante pelo ID.
     * @param id ID do estudante a ser excluído.
     */
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Estudante não encontrado para exclusão!");
        }
        studentRepository.deleteById(id);
    }

    /**
     * Busca estudantes por nome, permitindo filtros parciais.
     * @param name Nome ou parte do nome a ser pesquisado.
     * @return Lista de estudantes que correspondem ao filtro.
     */
    public List<Student> findStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
}
