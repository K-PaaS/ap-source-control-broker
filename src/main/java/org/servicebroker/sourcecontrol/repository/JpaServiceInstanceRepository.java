package org.servicebroker.sourcecontrol.repository;

import org.servicebroker.sourcecontrol.model.JpaServiceInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lena on 2017-05-16.
 */

@Repository
public interface JpaServiceInstanceRepository extends JpaRepository<JpaServiceInstance, String> {

    JpaServiceInstance findDistinctFirstByOrganizationGuid(String orgId);
}
