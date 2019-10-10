package hello;

import org.springframework.data.repository.CrudRepository;

import hello.TestString;

public interface TestStringRepository extends CrudRepository<TestString, Integer> {

}