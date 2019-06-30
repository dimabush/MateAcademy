package homework.fifteenth.dao;

import homework.fifteenth.model.Human;

import java.util.List;

public interface HumanDao {

  void addHuman(Human human);

  List<Human> getAllHumans();
}
