package did_career_certification.holder.repository;

import did_career_certification.holder.entity.Holder;
import did_career_certification.holder.entity.VC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("HolderVCRepository")
public interface VCRepository extends JpaRepository<VC, Long> {
    List<VC> findAllByHolder(Holder holder);
}
