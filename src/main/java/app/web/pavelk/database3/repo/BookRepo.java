package app.web.pavelk.database3.repo;


import app.web.pavelk.database3.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepo extends MongoRepository<Book, Integer> {


}
