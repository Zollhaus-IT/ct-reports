package ch.zollhaus.app.repos;

import ch.zollhaus.domain.groups.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class PersonsRepository implements PanacheRepository<Person> {

   private static final Logger LOG = LoggerFactory.getLogger(GroupsRepository.class);

   @Transactional
   public void create(Person person) {

      if (find("ctPersonId", person.getCtPersonId()).list().isEmpty()) {
         persist(person);
      } else {
         LOG.info("Group with ctPersonId: " + person.getCtPersonId() + " already exists in the database.");
      }
   }
}
