package org.servicebroker.sourcecontrol.repository;

import org.servicebroker.sourcecontrol.model.JpaScRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lena on 2017-05-16.
 */

@Repository
public interface JpaScRepositoryRepository extends JpaRepository<JpaScRepository, Integer> {

    List<JpaScRepository> findAllByInstanceId(String instanceId);


    void deleteAllByInstanceId(String instanceId);



}
