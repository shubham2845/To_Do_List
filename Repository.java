package mypackage.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mypackage.sts.entity.entity;


@Repository
public interface Repo extends JpaRepository<entity, Integer>{

}
