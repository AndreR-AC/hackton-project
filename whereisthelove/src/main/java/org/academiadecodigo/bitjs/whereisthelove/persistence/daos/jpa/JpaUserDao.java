package org.academiadecodigo.bitjs.whereisthelove.persistence.daos.jpa;

import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends AbstractDao<User>{
  /**
   * Initializes a new JPA DAO instance given a model type
   *
   *
   */
  public JpaUserDao() {
    super(User.class);
  }
}