package homework.fifteenth.dao;

import homework.fifteenth.bd.Storage;
import homework.fifteenth.lib.Dao;
import homework.fifteenth.model.Human;

import java.util.List;

@Dao
public class HumanDaoImpl implements HumanDao {
  @Override
  public void addHuman(Human human) {
    Storage. HUMANS.add(human);
  }

  @Override
  public List<Human> getAllHumans() {
    return Storage. HUMANS;
  }
}
