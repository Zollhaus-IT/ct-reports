package ch.zollhaus.app.repos;

import ch.zollhaus.domain.groups.Group;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class GroupsRepository implements PanacheRepository<Group> {

    private static final Logger LOG = LoggerFactory.getLogger(GroupsRepository.class);

    @Transactional
    public void create(Group group) {

        if (find("ctGroupId", group.getCtGroupId()).list().isEmpty()) {
            persist(group);
        } else {
            LOG.info("Group with ctGroupId: " + group.getCtGroupId() + " already exists in the database.");
        }
    }
}
